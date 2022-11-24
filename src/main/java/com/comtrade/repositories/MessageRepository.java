package com.comtrade.repositories;

import com.comtrade.models.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Integer> {

    public Message findByLanguage(String language);
}
