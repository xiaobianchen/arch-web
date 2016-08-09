package com.arch.biz.exception;

/**
 * Created by chenxiaobian on 16/7/1.
 */
public class ApplicationException extends RuntimeException {
    public ApplicationException() {
    }

    public ApplicationException(String message) {
        super(message);
    }


    public ApplicationException(String message, Object... args) {
        super(String.format(message, args));
    }

    public ApplicationException(String message, Throwable cause) {
        super(message, cause);
    }
}
