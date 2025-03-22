package com.example.mdClone2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class TimesheetAllReadyExistsException extends RuntimeException{

    public TimesheetAllReadyExistsException(String message) {
        super(message);
    }
}
