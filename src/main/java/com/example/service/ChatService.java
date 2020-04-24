package com.example.service;

import com.example.dao.entity.Chat;

/**
 * Сервис для работы с чатом
 */
public interface ChatService {

    /**
     * Создает новый чат между пользователями
     * @param chat
     * @return id
     */
    Long create(Chat chat);
}
