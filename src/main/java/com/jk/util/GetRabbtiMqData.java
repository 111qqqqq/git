package com.jk.util;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues="ggd")
public class GetRabbtiMqData {
    @RabbitHandler
    public void getMsg(String msg){
        System.out.println(msg);
    }
}
