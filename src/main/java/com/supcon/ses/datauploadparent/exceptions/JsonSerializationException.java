package com.supcon.ses.datauploadparent.exceptions;

public class JsonSerializationException extends RuntimeException {

    public JsonSerializationException(String message) {
        super(message);
    }

    public JsonSerializationException(String message, Throwable cause) {
        super(message, cause);
    }
}