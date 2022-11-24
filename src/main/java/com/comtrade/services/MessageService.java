package com.comtrade.services;

import com.comtrade.models.Message;
import com.comtrade.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageService {

    @Autowired
    MessageRepository messageRepository;


    public List<Message> getMessages(){
        List<Message> messages = new ArrayList<>();
        messageRepository.findAll().forEach(messages::add);
        return messages;
    }
    public Message getMessage(String language){

        return messageRepository.findByLanguage(language);

    }
}
