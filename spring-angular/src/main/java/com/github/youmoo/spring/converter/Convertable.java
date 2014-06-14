package com.github.youmoo.spring.converter;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * 用来标注vo，表示可由domain类转换
 * @autor youmoo
 * @since 2014-06-14 下午7:52
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
@Lazy
public @interface Convertable {
    Class<? extends Converter> converter();
}
