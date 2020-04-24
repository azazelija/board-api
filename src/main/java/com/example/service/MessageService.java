package com.example.service;

import com.example.dao.entity.Chat;
import com.example.dao.entity.Message;

/**
 * Сервис для работы с сообщениями
 */
public interface MessageService {
    /**
     * Создает новое сообщение пользователя
     * @param message
     * @return id
     */
    Long create(Message message);
}
