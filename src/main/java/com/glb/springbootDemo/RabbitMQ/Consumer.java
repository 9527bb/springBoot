package com.glb.springbootDemo.RabbitMQ;


import com.glb.springbootDemo.Config.RabbitMQConfig;
import com.glb.springbootDemo.entity.Student;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 * @author GeLinBo
 * @date 2020/6/23 23:35
 */
@Component
public class Consumer {

    @RabbitListener(queues = RabbitMQConfig.DIRECT_QUEUE1)
    public void receive(@Payload Student msg) {
        System.out.println("test 1111--------------------");

        System.out.println(msg.getName());

    }

    @RabbitListener(queues = RabbitMQConfig.DIRECT_QUEUE2)
    public void receive(@Payload Object msg) {
        System.out.println("test 2222--------------------");

        System.out.println(msg);

    }

    @RabbitListener(queues = RabbitMQConfig.TOPIC_QUEUE_1)
    public void receiveOfTopic(String msg) {
        System.out.println(msg);
    }

    @RabbitListener(queues = RabbitMQConfig.FANOUT_QUEUE_1)
    public void receiveOfFanout1(String msg) {
        System.out.println(msg);
    }

    @RabbitListener(queues = RabbitMQConfig.FANOUT_QUEUE_2)
    public void receiveOfFanout2(String msg) {
        System.out.println(msg);
    }
}
