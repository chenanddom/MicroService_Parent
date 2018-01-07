package com.glombok.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Message {

    private String msgName;

    private String msgContent;

    public Message() {
    }
}
