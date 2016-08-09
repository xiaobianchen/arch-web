package com.arch.biz.exception;

/**
 * Created by chenxiaobian on 16/7/4.
 */
public class WeixinException extends RuntimeException {
    public WeixinException() {
    }

    public WeixinException(String message) {
        super(message);
    }


    public WeixinException(String message, Object... args) {
        super(String.format(message, args));
    }

    public WeixinException(String message, Throwable cause) {
        super(message, cause);
    }
}
