package com.example.service.impl;

import com.example.dao.ChatRepository;
import com.example.dao.entity.Chat;
import com.example.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ChatServiceImpl implements ChatService {

    @Autowired
    ChatRepository chatRepository;

    @Override
    public Long create(Chat chat) {
        chat.setCreated_at(new Date());
        return chatRepository.save(chat).getId();
    }
}
