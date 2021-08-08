package com.wtiy.yzt.level.modules.queues.single;

import redis.clients.jedis.*;
import redis.clients.jedis.commands.JedisCommands;
import redis.clients.jedis.params.*;
import redis.clients.jedis.resps.KeyedListElement;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author wangyu
 * @Create: 2021/7/8 3:05 下午
 * @Description:
 */
public class JedisSingleCommand implements JedisCommands {

    private final JedisPool jedisPool;

    public JedisSingleCommand(JedisPool jedisPool) {
        this.jedisPool = jedisPool;
    }

    @Override
    public String set(String s, String s1) {
        return null;
    }

    @Override
    public String set(String s, String s1, SetParams setParams) {
        return null;
    }

    @Override
    public String get(String s) {
        return null;
    }

    @Override
    public String getDel(String s) {
        return null;
    }

    @Override
    public String getEx(String s, GetExParams getExParams) {
        return null;
    }

    @Override
    public Boolean exists(String s) {
        return null;
    }

    @Override
    public Long persist(String s) {
        return null;
    }

    @Override
    public String type(String s) {
        return null;
    }

    @Override
    public byte[] dump(String s) {
        return new byte[0];
    }

    @Override
    public String restore(String s, long l, byte[] bytes) {
        return null;
    }

    @Override
    public String restoreReplace(String s, long l, byte[] bytes) {
        return null;
    }

    @Override
    public String restore(String s, long l, byte[] bytes, RestoreParams restoreParams) {
        return null;
    }

    @Override
    public Long expire(String s, long l) {
        return null;
    }

    @Override
    public Long pexpire(String s, long l) {
        return null;
    }

    @Override
    public Long expireAt(String s, long l) {
        return null;
    }

    @Override
    public Long pexpireAt(String s, long l) {
        return null;
    }

    @Override
    public Long ttl(String s) {
        return null;
    }

    @Override
    public Long pttl(String s) {
        return null;
    }

    @Override
    public Long touch(String s) {
        return null;
    }

    @Override
    public Boolean setbit(String s, long l, boolean b) {
        return null;
    }

    @Override
    public Boolean setbit(String s, long l, String s1) {
        return null;
    }

    @Override
    public Boolean getbit(String s, long l) {
        return null;
    }

    @Override
    public Long setrange(String s, long l, String s1) {
        return null;
    }

    @Override
    public String getrange(String s, long l, long l1) {
        return null;
    }

    @Override
    public String getSet(String s, String s1) {
        return null;
    }

    @Override
    public Long setnx(String s, String s1) {
        return null;
    }

    @Override
    public String setex(String s, long l, String s1) {
        return null;
    }

    @Override
    public String psetex(String s, long l, String s1) {
        return null;
    }

    @Override
    public Long decrBy(String s, long l) {
        return null;
    }

    @Override
    public Long decr(String s) {
        return null;
    }

    @Override
    public Long incrBy(String s, long l) {
        return null;
    }

    @Override
    public Double incrByFloat(String s, double v) {
        return null;
    }

    @Override
    public Long incr(String s) {
        return null;
    }

    @Override
    public Long append(String s, String s1) {
        return null;
    }

    @Override
    public String substr(String s, int i, int i1) {
        return null;
    }

    @Override
    public Long hset(String s, String s1, String s2) {
        return null;
    }

    @Override
    public Long hset(String s, Map<String, String> map) {
        return null;
    }

    @Override
    public String hget(String s, String s1) {
        return null;
    }

    @Override
    public Long hsetnx(String s, String s1, String s2) {
        return null;
    }

    @Override
    public String hmset(String s, Map<String, String> map) {
        return null;
    }

    @Override
    public List<String> hmget(String s, String... strings) {
        return null;
    }

    @Override
    public Long hincrBy(String s, String s1, long l) {
        return null;
    }

    @Override
    public Double hincrByFloat(String s, String s1, double v) {
        return null;
    }

    @Override
    public Boolean hexists(String s, String s1) {
        return null;
    }

    @Override
    public Long hdel(String s, String... strings) {
        return null;
    }

    @Override
    public Long hlen(String s) {
        return null;
    }

    @Override
    public Set<String> hkeys(String s) {
        return null;
    }

    @Override
    public List<String> hvals(String s) {
        return null;
    }

    @Override
    public Map<String, String> hgetAll(String s) {
        return null;
    }

    @Override
    public String hrandfield(String s) {
        return null;
    }

    @Override
    public List<String> hrandfield(String s, long l) {
        return null;
    }

    @Override
    public Map<String, String> hrandfieldWithValues(String s, long l) {
        return null;
    }

    @Override
    public Long rpush(String s, String... strings) {
        return null;
    }

    @Override
    public Long lpush(String s, String... strings) {
        return null;
    }

    @Override
    public Long llen(String s) {
        return null;
    }

    @Override
    public List<String> lrange(String s, long l, long l1) {
        return null;
    }

    @Override
    public String ltrim(String s, long l, long l1) {
        return null;
    }

    @Override
    public String lindex(String s, long l) {
        return null;
    }

    @Override
    public String lset(String s, long l, String s1) {
        return null;
    }

    @Override
    public Long lrem(String s, long l, String s1) {
        return null;
    }

    @Override
    public String lpop(String s) {
        return null;
    }

    @Override
    public List<String> lpop(String s, int i) {
        return null;
    }

    @Override
    public Long lpos(String s, String s1) {
        return null;
    }

    @Override
    public Long lpos(String s, String s1, LPosParams lPosParams) {
        return null;
    }

    @Override
    public List<Long> lpos(String s, String s1, LPosParams lPosParams, long l) {
        return null;
    }

    @Override
    public String rpop(String s) {
        return null;
    }

    @Override
    public List<String> rpop(String s, int i) {
        return null;
    }

    @Override
    public Long sadd(String s, String... strings) {
        return null;
    }

    @Override
    public Set<String> smembers(String s) {
        return null;
    }

    @Override
    public Long srem(String s, String... strings) {
        return null;
    }

    @Override
    public String spop(String s) {
        return null;
    }

    @Override
    public Set<String> spop(String s, long l) {
        return null;
    }

    @Override
    public Long scard(String s) {
        return null;
    }

    @Override
    public Boolean sismember(String s, String s1) {
        return null;
    }

    @Override
    public List<Boolean> smismember(String s, String... strings) {
        return null;
    }

    @Override
    public String srandmember(String s) {
        return null;
    }

    @Override
    public List<String> srandmember(String s, int i) {
        return null;
    }

    @Override
    public Long strlen(String s) {
        return null;
    }

    @Override
    public Long zadd(String s, double v, String s1) {
        return null;
    }

    @Override
    public Long zadd(String s, double v, String s1, ZAddParams zAddParams) {
        return null;
    }

    @Override
    public Long zadd(String s, Map<String, Double> map) {
        return null;
    }

    @Override
    public Long zadd(String s, Map<String, Double> map, ZAddParams zAddParams) {
        return null;
    }

    @Override
    public Double zaddIncr(String s, double v, String s1, ZAddParams zAddParams) {
        return null;
    }

    @Override
    public Set<String> zrange(String s, long l, long l1) {
        return null;
    }

    @Override
    public Long zrem(String s, String... strings) {
        return null;
    }

    @Override
    public Double zincrby(String s, double v, String s1) {
        return null;
    }

    @Override
    public Double zincrby(String s, double v, String s1, ZIncrByParams zIncrByParams) {
        return null;
    }

    @Override
    public Long zrank(String s, String s1) {
        return null;
    }

    @Override
    public Long zrevrank(String s, String s1) {
        return null;
    }

    @Override
    public Set<String> zrevrange(String s, long l, long l1) {
        return null;
    }

    @Override
    public Set<Tuple> zrangeWithScores(String s, long l, long l1) {
        return null;
    }

    @Override
    public Set<Tuple> zrevrangeWithScores(String s, long l, long l1) {
        return null;
    }

    @Override
    public String zrandmember(String s) {
        return null;
    }

    @Override
    public Set<String> zrandmember(String s, long l) {
        return null;
    }

    @Override
    public Set<Tuple> zrandmemberWithScores(String s, long l) {
        return null;
    }

    @Override
    public Long zcard(String s) {
        return null;
    }

    @Override
    public Double zscore(String s, String s1) {
        return null;
    }

    @Override
    public List<Double> zmscore(String s, String... strings) {
        return null;
    }

    @Override
    public Tuple zpopmax(String s) {
        return null;
    }

    @Override
    public Set<Tuple> zpopmax(String s, int i) {
        return null;
    }

    @Override
    public Tuple zpopmin(String s) {
        return null;
    }

    @Override
    public Set<Tuple> zpopmin(String s, int i) {
        return null;
    }

    @Override
    public List<String> sort(String s) {
        return null;
    }

    @Override
    public List<String> sort(String s, SortingParams sortingParams) {
        return null;
    }

    @Override
    public Long zcount(String s, double v, double v1) {
        return null;
    }

    @Override
    public Long zcount(String s, String s1, String s2) {
        return null;
    }

    @Override
    public Set<String> zrangeByScore(String s, double v, double v1) {
        return null;
    }

    @Override
    public Set<String> zrangeByScore(String s, String s1, String s2) {
        return null;
    }

    @Override
    public Set<String> zrevrangeByScore(String s, double v, double v1) {
        return null;
    }

    @Override
    public Set<String> zrangeByScore(String s, double v, double v1, int i, int i1) {
        return null;
    }

    @Override
    public Set<String> zrevrangeByScore(String s, String s1, String s2) {
        return null;
    }

    @Override
    public Set<String> zrangeByScore(String s, String s1, String s2, int i, int i1) {
        return null;
    }

    @Override
    public Set<String> zrevrangeByScore(String s, double v, double v1, int i, int i1) {
        return null;
    }

    @Override
    public Set<Tuple> zrangeByScoreWithScores(String s, double v, double v1) {
        return null;
    }

    @Override
    public Set<Tuple> zrevrangeByScoreWithScores(String s, double v, double v1) {
        return null;
    }

    @Override
    public Set<Tuple> zrangeByScoreWithScores(String s, double v, double v1, int i, int i1) {
        return null;
    }

    @Override
    public Set<String> zrevrangeByScore(String s, String s1, String s2, int i, int i1) {
        return null;
    }

    @Override
    public Set<Tuple> zrangeByScoreWithScores(String s, String s1, String s2) {
        return null;
    }

    @Override
    public Set<Tuple> zrevrangeByScoreWithScores(String s, String s1, String s2) {
        return null;
    }

    @Override
    public Set<Tuple> zrangeByScoreWithScores(String s, String s1, String s2, int i, int i1) {
        return null;
    }

    @Override
    public Set<Tuple> zrevrangeByScoreWithScores(String s, double v, double v1, int i, int i1) {
        return null;
    }

    @Override
    public Set<Tuple> zrevrangeByScoreWithScores(String s, String s1, String s2, int i, int i1) {
        return null;
    }

    @Override
    public Long zremrangeByRank(String s, long l, long l1) {
        return null;
    }

    @Override
    public Long zremrangeByScore(String s, double v, double v1) {
        return null;
    }

    @Override
    public Long zremrangeByScore(String s, String s1, String s2) {
        return null;
    }

    @Override
    public Long zlexcount(String s, String s1, String s2) {
        return null;
    }

    @Override
    public Set<String> zrangeByLex(String s, String s1, String s2) {
        return null;
    }

    @Override
    public Set<String> zrangeByLex(String s, String s1, String s2, int i, int i1) {
        return null;
    }

    @Override
    public Set<String> zrevrangeByLex(String s, String s1, String s2) {
        return null;
    }

    @Override
    public Set<String> zrevrangeByLex(String s, String s1, String s2, int i, int i1) {
        return null;
    }

    @Override
    public Long zremrangeByLex(String s, String s1, String s2) {
        return null;
    }

    @Override
    public Long linsert(String s, ListPosition listPosition, String s1, String s2) {
        return null;
    }

    @Override
    public Long lpushx(String s, String... strings) {
        return null;
    }

    @Override
    public Long rpushx(String s, String... strings) {
        return null;
    }

    @Override
    public List<String> blpop(int i, String s) {
        return null;
    }

    @Override
    public KeyedListElement blpop(double v, String s) {
        return null;
    }

    @Override
    public List<String> brpop(int i, String s) {
        return null;
    }

    @Override
    public KeyedListElement brpop(double v, String s) {
        return null;
    }

    @Override
    public Long del(String s) {
        return null;
    }

    @Override
    public Long unlink(String s) {
        return null;
    }

    @Override
    public String echo(String s) {
        return null;
    }

    @Override
    public Long move(String s, int i) {
        return null;
    }

    @Override
    public Long bitcount(String s) {
        return null;
    }

    @Override
    public Long bitcount(String s, long l, long l1) {
        return null;
    }

    @Override
    public Long bitpos(String s, boolean b) {
        return null;
    }

    @Override
    public Long bitpos(String s, boolean b, BitPosParams bitPosParams) {
        return null;
    }

    @Override
    public ScanResult<Map.Entry<String, String>> hscan(String s, String s1) {
        return null;
    }

    @Override
    public ScanResult<Map.Entry<String, String>> hscan(String s, String s1, ScanParams scanParams) {
        return null;
    }

    @Override
    public ScanResult<String> sscan(String s, String s1) {
        return null;
    }

    @Override
    public ScanResult<Tuple> zscan(String s, String s1) {
        return null;
    }

    @Override
    public ScanResult<Tuple> zscan(String s, String s1, ScanParams scanParams) {
        return null;
    }

    @Override
    public ScanResult<String> sscan(String s, String s1, ScanParams scanParams) {
        return null;
    }

    @Override
    public Long pfadd(String s, String... strings) {
        return null;
    }

    @Override
    public long pfcount(String s) {
        return 0;
    }

    @Override
    public Long geoadd(String s, double v, double v1, String s1) {
        return null;
    }

    @Override
    public Long geoadd(String s, Map<String, GeoCoordinate> map) {
        return null;
    }

    @Override
    public Long geoadd(String s, GeoAddParams geoAddParams, Map<String, GeoCoordinate> map) {
        return null;
    }

    @Override
    public Double geodist(String s, String s1, String s2) {
        return null;
    }

    @Override
    public Double geodist(String s, String s1, String s2, GeoUnit geoUnit) {
        return null;
    }

    @Override
    public List<String> geohash(String s, String... strings) {
        return null;
    }

    @Override
    public List<GeoCoordinate> geopos(String s, String... strings) {
        return null;
    }

    @Override
    public List<GeoRadiusResponse> georadius(String s, double v, double v1, double v2, GeoUnit geoUnit) {
        return null;
    }

    @Override
    public List<GeoRadiusResponse> georadiusReadonly(String s, double v, double v1, double v2, GeoUnit geoUnit) {
        return null;
    }

    @Override
    public List<GeoRadiusResponse> georadius(String s, double v, double v1, double v2, GeoUnit geoUnit, GeoRadiusParam geoRadiusParam) {
        return null;
    }

    @Override
    public List<GeoRadiusResponse> georadiusReadonly(String s, double v, double v1, double v2, GeoUnit geoUnit, GeoRadiusParam geoRadiusParam) {
        return null;
    }

    @Override
    public List<GeoRadiusResponse> georadiusByMember(String s, String s1, double v, GeoUnit geoUnit) {
        return null;
    }

    @Override
    public List<GeoRadiusResponse> georadiusByMemberReadonly(String s, String s1, double v, GeoUnit geoUnit) {
        return null;
    }

    @Override
    public List<GeoRadiusResponse> georadiusByMember(String s, String s1, double v, GeoUnit geoUnit, GeoRadiusParam geoRadiusParam) {
        return null;
    }

    @Override
    public List<GeoRadiusResponse> georadiusByMemberReadonly(String s, String s1, double v, GeoUnit geoUnit, GeoRadiusParam geoRadiusParam) {
        return null;
    }

    @Override
    public List<Long> bitfield(String s, String... strings) {
        return null;
    }

    @Override
    public List<Long> bitfieldReadonly(String s, String... strings) {
        return null;
    }

    @Override
    public Long hstrlen(String s, String s1) {
        return null;
    }

    @Override
    public StreamEntryID xadd(String s, StreamEntryID streamEntryID, Map<String, String> map) {
        return null;
    }

    @Override
    public StreamEntryID xadd(String s, StreamEntryID streamEntryID, Map<String, String> map, long l, boolean b) {
        return null;
    }

    @Override
    public StreamEntryID xadd(String s, Map<String, String> map, XAddParams xAddParams) {
        return null;
    }

    @Override
    public Long xlen(String s) {
        return null;
    }

    @Override
    public List<StreamEntry> xrange(String s, StreamEntryID streamEntryID, StreamEntryID streamEntryID1) {
        return null;
    }

    @Override
    public List<StreamEntry> xrange(String s, StreamEntryID streamEntryID, StreamEntryID streamEntryID1, int i) {
        return null;
    }

    @Override
    public List<StreamEntry> xrevrange(String s, StreamEntryID streamEntryID, StreamEntryID streamEntryID1) {
        return null;
    }

    @Override
    public List<StreamEntry> xrevrange(String s, StreamEntryID streamEntryID, StreamEntryID streamEntryID1, int i) {
        return null;
    }

    @Override
    public long xack(String s, String s1, StreamEntryID... streamEntryIDS) {
        return 0;
    }

    @Override
    public String xgroupCreate(String s, String s1, StreamEntryID streamEntryID, boolean b) {
        return null;
    }

    @Override
    public String xgroupSetID(String s, String s1, StreamEntryID streamEntryID) {
        return null;
    }

    @Override
    public long xgroupDestroy(String s, String s1) {
        return 0;
    }

    @Override
    public Long xgroupDelConsumer(String s, String s1, String s2) {
        return null;
    }

    @Override
    public StreamPendingSummary xpending(String s, String s1) {
        return null;
    }

    @Override
    public List<StreamPendingEntry> xpending(String s, String s1, StreamEntryID streamEntryID, StreamEntryID streamEntryID1, int i, String s2) {
        return null;
    }

    @Override
    public List<StreamPendingEntry> xpending(String s, String s1, XPendingParams xPendingParams) {
        return null;
    }

    @Override
    public long xdel(String s, StreamEntryID... streamEntryIDS) {
        return 0;
    }

    @Override
    public long xtrim(String s, long l, boolean b) {
        return 0;
    }

    @Override
    public long xtrim(String s, XTrimParams xTrimParams) {
        return 0;
    }

    @Override
    public List<StreamEntry> xclaim(String s, String s1, String s2, long l, long l1, int i, boolean b, StreamEntryID... streamEntryIDS) {
        return null;
    }

    @Override
    public List<StreamEntry> xclaim(String s, String s1, String s2, long l, XClaimParams xClaimParams, StreamEntryID... streamEntryIDS) {
        return null;
    }

    @Override
    public List<StreamEntryID> xclaimJustId(String s, String s1, String s2, long l, XClaimParams xClaimParams, StreamEntryID... streamEntryIDS) {
        return null;
    }

    @Override
    public StreamInfo xinfoStream(String s) {
        return null;
    }

    @Override
    public List<StreamGroupInfo> xinfoGroup(String s) {
        return null;
    }

    @Override
    public List<StreamConsumersInfo> xinfoConsumers(String s, String s1) {
        return null;
    }
}
