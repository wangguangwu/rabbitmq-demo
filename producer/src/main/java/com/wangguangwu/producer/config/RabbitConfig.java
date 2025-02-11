package com.wangguangwu.producer.config;

import com.wangguangwu.producer.constants.QueueConstants;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 创建队列
 *
 * @author wangguangwu
 */
@Configuration
public class RabbitConfig {

    @Bean
    public Queue messageQueue() {
        return new Queue(QueueConstants.MESSAGE_QUEUE);
    }

    @Bean
    public Queue messageUser() {
        return new Queue(QueueConstants.MESSAGE_USER);
    }
}
