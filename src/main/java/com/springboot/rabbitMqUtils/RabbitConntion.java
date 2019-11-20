package com.springboot.rabbitMqUtils;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @author Sir_小三
 * @date 2019/11/11--21:20
 */
public class RabbitConntion {

    public static Connection getConnection() throws IOException, TimeoutException {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.setHost("www.lovecln.cn");
        connectionFactory.setPort(5672);
        connectionFactory.setUsername("liuyanjun");
        connectionFactory.setPassword("123456");
        return  connectionFactory.newConnection();
    }
}
