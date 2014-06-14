package com.github.youmoo.spring.command.concrete;

import com.github.youmoo.spring.command.AbstractAjaxCommand;
import com.github.youmoo.spring.command.QueryParam;
import com.github.youmoo.spring.domain.User;
import com.github.youmoo.spring.helper.JsonBuilder;
import com.github.youmoo.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * 处理用户信息的ajax请求
 * @autor youmoo
 * @since 2014-06-14 下午5:26
 */
@Component("ajax_user")
public class UserCommand extends AbstractAjaxCommand {

    public static final String GROUP_LIST = "list";/*查询用户列表*/

    @Autowired
    UserService userService;

    @Override
    public String execute(User user, HttpServletRequest request, QueryParam queryParam) {
        if (GROUP_LIST.equals(queryParam.getGroup())) {

            return new JsonBuilder()
                    .put("ok", true)
                    .put("users", userService.list())
                    .build();
        }
        return new JsonBuilder()
                .put("ok", false)
                .put("msg", "group=" + queryParam.getGroup() + "不存在。")
                .build();
    }
}
