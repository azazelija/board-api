package com.example.web.controller;

import com.example.dao.entity.Message;
import com.example.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MessageController {
    @Autowired
    MessageService messageService;

    @PostMapping(value = "/message/add")
    public @ResponseBody
    Long create(Message message) {
        return messageService.create(message);
    }
}
