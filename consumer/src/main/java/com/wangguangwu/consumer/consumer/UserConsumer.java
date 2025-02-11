package com.wangguangwu.consumer.consumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wangguangwu.consumer.constants.QueueConstants;
import com.wangguangwu.consumer.dto.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author wangguangwu
 */
@Component
@Slf4j
@RequiredArgsConstructor
@RabbitListener(queues = QueueConstants.MESSAGE_USER)
public class UserConsumer {

    private final ObjectMapper objectMapper;

    @RabbitHandler
    public void messageUser(String json) throws Exception {
        User user = objectMapper.readValue(json, User.class);
        log.info("接收到{}的信息: {}", user.getUsername(), json);
    }

}
