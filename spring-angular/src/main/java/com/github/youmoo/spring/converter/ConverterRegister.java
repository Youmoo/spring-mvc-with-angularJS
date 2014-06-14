package com.github.youmoo.spring.converter;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Map;

/**
 * 程序启动时注册vo转换器
 *
 * @autor youmoo
 * @since 2014-06-14 下午7:48
 */
@Component
public class ConverterRegister implements ApplicationContextAware, InitializingBean {

    ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Map<String, Object> map = applicationContext.getBeansWithAnnotation(Convertable.class);
        Collection<?> vos = map.values();
        for (Object vo : vos) {
            Class<?> voClz = vo.getClass();
            Convertable convertable = voClz.getAnnotation(Convertable.class);
            Converters.register(voClz, convertable.converter().newInstance());
        }
    }


}
