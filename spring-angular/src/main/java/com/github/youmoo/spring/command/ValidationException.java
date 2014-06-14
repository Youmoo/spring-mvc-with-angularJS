package com.github.youmoo.spring.command;

/**
 * 请求参数验证失败时抛出此异常
 */
public class ValidationException extends RuntimeException {

    private String errorMsg;

    public ValidationException(String errorMsg) {
        super(errorMsg);
        this.errorMsg = errorMsg;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}
