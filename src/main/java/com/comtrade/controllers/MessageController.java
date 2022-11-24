package com.comtrade.controllers;

import com.comtrade.models.Message;
import com.comtrade.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MessageController {

    @Autowired
    MessageService messageService;

    @RequestMapping("/hello")
    public String sayHelloWorld(){
        return "Hello World";
    }

    @RequestMapping("/messages")
    public List<Message> getAllMessages(){
        return messageService.getMessages();
    }

    @RequestMapping("/messages/{language}")
    public Message getMessage(@PathVariable String language){
        return messageService.getMessage(language);
    }

}
