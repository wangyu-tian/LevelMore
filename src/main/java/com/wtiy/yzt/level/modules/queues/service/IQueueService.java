package com.wtiy.yzt.level.modules.queues.service;

import com.netflix.dyno.queues.Message;

import java.util.List;

/**
 * @Author wangyu
 * @Create: 2021/7/8 3:39 下午
 * @Description:
 */
public interface IQueueService {

    /**
     * push消息
     *
     * @param queueName
     * @param messageList
     */
    void push(String queueName, List<Message> messageList);

    /**
     * ack消息
     * 取出消息后，等待超时时间后自动放回队列
     * @param queueName
     * @param messageList
     */
    void ack(String queueName, List<Message> messageList);

    /**
     * get消息
     *
     * @param queueName
     * @param messageId
     */
    Message get(String queueName, String messageId);
}
