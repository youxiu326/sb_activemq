package com.idress;

import com.idress.mq.SenderMq;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MqTest {

    @Autowired
    private SenderMq senderMq;


    @Test
    public void testSend(){
        senderMq.send("消息内容");
    }


    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Test
    public void testSend02(){
        jmsMessagingTemplate.convertAndSend("promoteAct","吹牛逼02");
    }

} 