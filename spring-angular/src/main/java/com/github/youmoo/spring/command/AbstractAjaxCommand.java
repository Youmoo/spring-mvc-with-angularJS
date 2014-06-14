package com.github.youmoo.spring.command;

import com.github.youmoo.spring.domain.User;

import javax.annotation.PreDestroy;
import javax.servlet.http.HttpServletRequest;

/**
 * 对ajax请求接口的抽象实现，主要用来封装通用的请求参数
 * @autor youmoo
 * @since 2014-06-14 下午7:09
 */
public class AbstractAjaxCommand implements AjaxCommand,Prepare {

    @Override
    public String execute(User user, HttpServletRequest request, QueryParam queryParam) {
        return null;
    }

    @Override
    public QueryParam prepare(HttpServletRequest request) {
        QueryParam param=new QueryParam();
        String group=request.getParameter("group");
        param.setGroup(group);
        return param;
    }
}
