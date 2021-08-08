package com.wtiy.yzt.level.modules.queues.service.impl;

import com.netflix.dyno.queues.Message;
import com.netflix.dyno.queues.redis.RedisQueues;
import com.wtiy.yzt.level.modules.queues.service.IQueueService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author wangyu
 * @Create: 2021/7/8 3:41 下午
 * @Description:
 */
@Component
@AllArgsConstructor
public class QueueServiceImpl implements IQueueService {

    private final RedisQueues redisQueues;

    @Override
    public void push(String queueName, List<Message> messageList) {
        redisQueues.get(queueName).push(messageList);
    }

    @Override
    public void ack(String queueName, List<Message> messageList) {
        redisQueues.get(queueName).ack(messageList);
    }

    @Override
    public Message get(String queueName, String messageId) {
        return redisQueues.get(queueName).get(messageId);
    }
}
