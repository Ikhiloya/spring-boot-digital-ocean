package com.blackcrow.springbootdigitalocean.service;

import com.blackcrow.springbootdigitalocean.domain.Message;
import com.blackcrow.springbootdigitalocean.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * created by loya on 10/10/2022
 */
@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;

    public Optional<Message> findById(Long id) {
        return messageRepository.findById(id);
    }

    public Message save(Message message) {
        return messageRepository.save(message);
    }

}
