package com.glb.springbootDemo;



import com.glb.springbootDemo.RabbitMQ.Consumer;
import com.glb.springbootDemo.RabbitMQ.Producer;
import com.rabbitmq.client.ConnectionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



/**
 * @author GeLinBo
 * @date 2020/6/23 23:08
 */
@SpringBootTest
public class RabbitMQTest {

    @Autowired
    private Producer producer;

    @Autowired
    private Consumer consumer;

    @Test
    public void testDirect1() {
        System.out.println("begin");
        producer.sendDirect1();
        System.out.println("end");
    }

    @Test
    public void testDirect2() {
        System.out.println("begin");
        producer.sendDirect2();
        System.out.println("end");
    }

    @Test
    public void sendTopic() {
        String msg = "TopicMsg";
        System.out.println("fffff");
        producer.sendTopic();
    }

    @Test
    public void test() {
        ConnectionFactory factory = new ConnectionFactory();
    }



}
