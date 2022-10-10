package com.blackcrow.springbootdigitalocean.controller;

import com.blackcrow.springbootdigitalocean.domain.Message;
import com.blackcrow.springbootdigitalocean.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * created by loya on 10/10/2022
 */
@RestController
@RequestMapping("/message")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @GetMapping("/{id}")
    public Optional<Message> getMessage(@PathVariable("id") Long id) {
        return messageService.findById(id);
    }

    @PostMapping
    public Message getMessage(@RequestBody Message message) {
        return messageService.save(message);
    }

}
