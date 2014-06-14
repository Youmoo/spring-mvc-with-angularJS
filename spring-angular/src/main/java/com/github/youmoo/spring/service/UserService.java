package com.github.youmoo.spring.service;

import com.github.youmoo.spring.domain.User;
import com.github.youmoo.spring.vo.UserVo;

import java.util.List;

/**
 * @autor youmoo
 * @since 2014-06-14 下午5:34
 */
public interface UserService {

    public List<UserVo> list();

}
