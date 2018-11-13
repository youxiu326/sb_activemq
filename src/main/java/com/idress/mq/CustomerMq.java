package com.idress.mq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class CustomerMq {

    /**
     * 客户端消费
     * @param consumer
     */
    @JmsListener(destination = "nb")
    public void receiveQueue(String consumer) {
        System.out.println(consumer+"消息已经消费了");
    }

    @JmsListener(destination = "测试队列001")
    public void receiveQueue2(String consumer) {
        System.out.println(consumer+"消息已经消费了");
    }

} 