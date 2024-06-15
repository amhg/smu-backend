package com.samuapplication.samu_backend.model.login;

import lombok.Data;

@Data
public class LoginMessage {
    public String message;
    public boolean status;

    public LoginMessage(final String message, final boolean status) {
        this.message = message;
        this.status = status;
    }
}
