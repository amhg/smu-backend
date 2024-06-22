package com.samuapplication.samu_backend.model.login;

import lombok.Data;

@Data
public class PersonLoginMessage {
    public String message;
    public boolean status;
    public String rfc;

    public PersonLoginMessage(String message, boolean status, String rfc) {
        this.message = message;
        this.status = status;
        this.rfc = rfc;
    }
}
