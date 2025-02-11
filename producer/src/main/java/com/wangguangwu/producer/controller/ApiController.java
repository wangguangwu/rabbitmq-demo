package com.wangguangwu.producer.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wangguangwu.producer.constants.QueueConstants;
import com.wangguangwu.producer.dto.User;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangguangwu
 */
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ApiController {

    private final AmqpTemplate amqpTemplate;
    private final ObjectMapper objectMapper;

    @GetMapping("/produceQueue")
    public void produceQueue() {
        amqpTemplate.convertAndSend(QueueConstants.MESSAGE_QUEUE, "Hello world");
    }

    @GetMapping("/produceUser")
    public void produceUser() throws JsonProcessingException {
        User user = new User("wang", "123456");
        String json = objectMapper.writeValueAsString(user);
        amqpTemplate.convertAndSend(QueueConstants.MESSAGE_USER, json);
    }
}
