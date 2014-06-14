package com.github.youmoo.spring.command;

import com.github.youmoo.spring.domain.User;

import javax.servlet.http.HttpServletRequest;

/**
 * ajax请求接口
 * @autor youmoo
 * @since 2014-06-14 下午5:17
 */
public interface AjaxCommand {
    public String execute(User user, HttpServletRequest request, QueryParam queryParam);
}
