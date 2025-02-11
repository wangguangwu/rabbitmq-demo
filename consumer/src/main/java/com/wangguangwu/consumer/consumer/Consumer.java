package com.wangguangwu.consumer.consumer;

import com.wangguangwu.consumer.constants.QueueConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author wangguangwu
 */
@Component
@Slf4j
@RabbitListener(queues = QueueConstants.MESSAGE_QUEUE)
public class Consumer {

    @RabbitHandler
    public void messageMsg(String msg) {
        log.info("接收到: {}", msg);
    }

}
