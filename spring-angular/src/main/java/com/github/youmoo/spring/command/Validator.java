package com.github.youmoo.spring.command;

import javax.servlet.http.HttpServletRequest;

/**
 * 实现此接口表明需要对请求参数进行验证
 */
public interface Validator {

    public boolean validate(HttpServletRequest request) throws ValidationException;

}
