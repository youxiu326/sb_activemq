package com.idress.mq;

import org.apache.activemq.broker.region.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Destination;

@Component
public class SenderMq {

    @Autowired
    private Destination queue;

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;


    public void send(String msg) {
        this.jmsMessagingTemplate.convertAndSend(queue,msg);

    }


}