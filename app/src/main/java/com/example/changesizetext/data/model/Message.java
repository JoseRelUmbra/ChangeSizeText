package com.example.changesizetext.data.model;

import java.io.Serializable;

/**
 * guarda el mensaje
 */
public class Message implements Serializable {
    private User user;
    private String message;
    private int size;

    public Message(User user, String message, int size) {
        this.user = user;
        this.message = message;
        this.size = size;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
