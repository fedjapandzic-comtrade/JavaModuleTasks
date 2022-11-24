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

    @RequestMapping("/hello-rest")
    public String sayHelloWorld(){
        return "Hello World";
    }

    @RequestMapping("/hello")
    public List<Message> getAllMessages(){
        return messageService.getMessages();
    }

    @RequestMapping("/hello/{language}")
    public Message getMessage(@PathVariable String language){
        return messageService.getMessage(language);
    }

}
