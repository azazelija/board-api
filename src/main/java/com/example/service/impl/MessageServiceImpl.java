package com.example.service.impl;

import com.example.dao.MessageRepository;
import com.example.dao.entity.Message;
import com.example.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    MessageRepository messageRepository;

    @Override
    public Long create(Message message) {
        message.setCreated_at(new Date());
        return messageRepository.save(message).getId();
    }
}
