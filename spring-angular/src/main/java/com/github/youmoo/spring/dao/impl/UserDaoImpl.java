package com.github.youmoo.spring.dao.impl;

import com.github.youmoo.spring.dao.UserDao;
import com.github.youmoo.spring.domain.User;
import com.github.youmoo.spring.helper.UserMocker;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 这是一个伪dao实现
 * @autor youmoo
 * @since 2014-06-14 下午5:32
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public List<User> select(Map<String, Object> params) {
        return UserMocker.mock();
    }


}
