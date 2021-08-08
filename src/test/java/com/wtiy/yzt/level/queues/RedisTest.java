package com.wtiy.yzt.level.queues;

import com.netflix.dyno.queues.Message;
import com.wtiy.yzt.level.modules.queues.service.IQueueService;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Author wangyu
 * @Create: 2021/7/8 3:33 下午
 * @Description:
 */
@SpringBootTest
public class RedisTest {

    @Autowired
    private IQueueService queueService;

    @Test
    void contextLoads() {
//        List<Message> messageList = createMessage(10);
//        queueService.push("haha", messageList);
        Message message = queueService.get("haha", "test_id_5");
        System.out.println(message);
    }

    private List<Message> createMessage(int count) {
        List<Message> messageList = Lists.newArrayList();
        while (count > 0) {
            Message message = new Message();
            message.setId("test_id_" + count);
            message.setPayload("test_payload_" + count);
            messageList.add(message);
            count--;
        }
        return messageList;
    }


}
