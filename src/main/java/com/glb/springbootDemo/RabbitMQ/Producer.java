package com.glb.springbootDemo.RabbitMQ;


import com.glb.springbootDemo.Config.RabbitMQConfig;
import com.glb.springbootDemo.entity.Student;
import com.rabbitmq.client.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author GeLinBo
 * @date 2020/6/23 23:35
 */
@Component
public class Producer {



    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendDirect() {
        String msg = "DirectMsg";

        rabbitTemplate.convertAndSend(RabbitMQConfig.DIRECT_QUEUE, msg);
    }

    public void sendDirect1() {
        Student s = new Student("glb", 20);
        rabbitTemplate.convertAndSend(RabbitMQConfig.DIRECT_EXCHANGE, "apple", s);

        s = new Student("gg", 19);
        rabbitTemplate.convertAndSend(RabbitMQConfig.DIRECT_EXCHANGE, "apple", s);

        s = new Student("xx", 19);
        rabbitTemplate.convertAndSend(RabbitMQConfig.DIRECT_EXCHANGE, "apple1", s);

    }

    public void sendDirect2() {
        rabbitTemplate.convertAndSend(RabbitMQConfig.DIRECT_EXCHANGE, "key", "test key");
        rabbitTemplate.convertAndSend(RabbitMQConfig.DIRECT_EXCHANGE, "orange", "test orange");
        Student s = new Student("xx", 19);
        rabbitTemplate.convertAndSend(RabbitMQConfig.DIRECT_EXCHANGE, "apple", s);



    }

    public void sendTopic() {
        rabbitTemplate.convertAndSend(RabbitMQConfig.TOPIC_EXCHANGE, "topic.key1", "test key1 topic");
        rabbitTemplate.convertAndSend(RabbitMQConfig.TOPIC_EXCHANGE, "topic.key2", "test key2 topic");
    }

    public void sendFanout() {
        String msg = "FanoutMsg";

        rabbitTemplate.convertAndSend(RabbitMQConfig.FANOUT_EXCHANGE, "", msg);
    }
}
