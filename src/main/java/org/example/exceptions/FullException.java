package org.example.exceptions;

public class FullException extends RuntimeException {
    public FullException() {
    }

    public FullException(String message) {
        super(message);
    }

    public FullException(String message, Throwable cause) {
        super(message, cause);
    }

    public FullException(Throwable cause) {
        super(cause);
    }

    public FullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
