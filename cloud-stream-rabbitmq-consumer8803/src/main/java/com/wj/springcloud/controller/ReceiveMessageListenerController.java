package com.wj.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wen.jie
 * @Classname ReceiveMessageListenerController
 * @Description TODO
 * @Date 2020/9/7
 */
@EnableBinding(Sink.class)
@RestController
public class ReceiveMessageListenerController {

    @Value("${server.port}")
    private String serverPort;

    @StreamListener(value = Sink.INPUT)
    public void input(Message<String> message){
        System.out.println("消息:"+message.getPayload()+"serverPort:"+serverPort);
    }

}
