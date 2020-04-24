package com.example.web.controller;

import com.example.dao.entity.Chat;
import com.example.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ChatController {
    @Autowired
    ChatService chatService;

    @PostMapping(value = "/chats/add")
    public @ResponseBody
    Long createChat(@RequestBody Chat chat) {
        return chatService.create(chat);
    }
}
