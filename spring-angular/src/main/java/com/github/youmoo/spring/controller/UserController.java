package com.github.youmoo.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @autor youmoo
 * @since 2014-06-14 下午5:07
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/list")
    public String list() {
        return "user/list";
    }
}
