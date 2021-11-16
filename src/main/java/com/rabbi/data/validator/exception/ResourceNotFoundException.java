package com.rabbi.data.validator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
    static final long serialVersionUID = 1327943942275365628L;

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
