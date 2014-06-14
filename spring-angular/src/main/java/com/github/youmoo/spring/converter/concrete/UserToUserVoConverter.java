package com.github.youmoo.spring.converter.concrete;

import com.github.youmoo.spring.converter.Converter;
import com.github.youmoo.spring.domain.User;
import com.github.youmoo.spring.vo.UserVo;

/**
 * User到UserVo的转换器
 *
 * @autor youmoo
 * @since 2014-06-14 下午7:22
 */
public class UserToUserVoConverter implements Converter<User, UserVo> {
    @Override
    public UserVo convert(User user) {
        UserVo userVo = new UserVo();
        userVo.setUsername(user.getUsername());
        return userVo;
    }
}
