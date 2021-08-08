package com.wtiy.yzt.level.modules.queues.single;

import cn.hutool.core.collection.CollUtil;
import com.netflix.dyno.connectionpool.Host;
import com.netflix.dyno.connectionpool.HostSupplier;
import com.netflix.dyno.queues.ShardSupplier;
import com.netflix.dyno.queues.redis.RedisQueues;
import com.netflix.dyno.queues.shard.DynoShardSupplier;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.context.annotation.Bean;
import redis.clients.jedis.*;
import redis.clients.jedis.commands.JedisCommands;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author wangyu
 * @Create: 2021/7/7 4:01 下午
 * @Description:
 */
@SpringBootConfiguration
public class QueueRedisConfig {

//    @Bean
//    public JedisCommands jedisCommands(HostSupplier hostSupplier, TokenMapSupplier tokenMapSupplier) {
//        ConnectionPoolConfigurationImpl connectionPoolConfiguration = new ConnectionPoolConfigurationImpl(StrUtil.EMPTY)
//                .withTokenSupplier(tokenMapSupplier)
//                .setLocalRack("cn-east-1et")
//                .setLocalDataCenter("cn-eats-1")
//                .setSocketTimeout(0)
//                .setConnectTimeout(0)
//                .setMaxConnsPerHost(10);
//        return new DynoJedisClient.Builder()
//                .withHostSupplier(hostSupplier)
//                .withApplicationName("level-more")
//                .withDynomiteClusterName(StrUtil.EMPTY)
//                .withCPConfig(connectionPoolConfiguration)
//                .build();
//    }

    @Bean
    public JedisPool jedisPool(RedisProperties redisProperties) {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        // 设置配置
        jedisPoolConfig.setMaxTotal(1024);
        jedisPoolConfig.setMaxIdle(100);
        jedisPoolConfig.setMaxWaitMillis(100);
        jedisPoolConfig.setTestOnBorrow(false);
        jedisPoolConfig.setTestOnReturn(true);
        // 初始化JedisPool
        JedisPool jedisPool = new JedisPool(jedisPoolConfig, redisProperties.getHost(), redisProperties.getPort(), 0, redisProperties.getPassword());
        return jedisPool;
    }

    @Bean
    public JedisCommands jedisCommands(JedisPool jedisPool) {
        return jedisPool.getResource();
    }

    @Bean("dynoReadClient")
    public JedisCommands jedisCommandsRead(JedisPool jedisPool) {
        return jedisPool.getResource();
    }

    @Bean
    public RedisQueues redisQueues(ShardSupplier shardSupplier, JedisCommands jedisCommands, @Named("dynoReadClient") JedisCommands dynoClientRead) {
        final String redisKeyPrefix = "MK:";
        return new RedisQueues(
                jedisCommands,
                dynoClientRead,
                redisKeyPrefix,
                shardSupplier,
                Integer.MAX_VALUE,
                Integer.MAX_VALUE
        );
    }

    @Bean
    public HostSupplier hostSupplier(RedisProperties redisProperties) {
        return () -> new ArrayList<>(parseHosts(redisProperties));
    }

    @Bean
    public ShardSupplier shardSupplier(HostSupplier hostSupplier) {
        final String localRack = "e";
        return new DynoShardSupplier(hostSupplier, "cn-east-1", localRack);
    }

    private List<Host> parseHosts(RedisProperties redisProperties) {
        RedisProperties.Sentinel sentinel = redisProperties.getSentinel();
        if (sentinel != null) {
            String password = redisProperties.getPassword();
            List<String> nodes = sentinel.getNodes();
            return nodes.stream().map(node -> {
                String[] hostAndPort = node.split(":");
                int port = Integer.parseInt(hostAndPort[1]);
                return new Host(node, hostAndPort[0], port, port, Host.DEFAULT_DATASTORE_PORT, "e", "rac", Host.Status.Up, null, password);
            }).collect(Collectors.toList());
        } else {
            String host = redisProperties.getHost();
            int port = redisProperties.getPort();
            String password = redisProperties.getPassword();
            return CollUtil.newArrayList(new Host(host, null, port, port, Host.DEFAULT_DATASTORE_PORT, "et", "cn-east-1et", Host.Status.Up, null, password));
        }
    }
}
