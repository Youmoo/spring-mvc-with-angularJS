package com.github.youmoo.spring.command;

import javax.servlet.http.HttpServletRequest;

/**
 * 实现此接口，用来将请求参数解析并闭装到QueryParam中
 */
public interface Prepare {

    public QueryParam prepare(HttpServletRequest request);

}
