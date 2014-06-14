package com.github.youmoo.spring.vo;

import com.github.youmoo.spring.converter.Convertable;
import com.github.youmoo.spring.converter.concrete.UserToUserVoConverter;

/**
 * @autor youmoo
 * @since 2014-06-14 下午7:21
 */
@Convertable(converter = UserToUserVoConverter.class)
public class UserVo {
    String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
