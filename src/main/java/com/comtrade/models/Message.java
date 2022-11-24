package com.comtrade.models;

import javax.persistence.*;

@Entity(name = "hello_world_table")
public class Message {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "message")
    private String message;
    @Column(name = "language_of_message")
    private String language;

    public Message() {
    }

    public Message(Long id, String message, String language) {
        this.id = id;
        this.message = message;
        this.language = language;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }




}
