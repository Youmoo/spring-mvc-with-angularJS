package com.github.youmoo.spring.converter;

import com.github.youmoo.spring.helper.ObjectFactory;
import com.github.youmoo.spring.vo.UserVo;

import java.util.List;
import java.util.Map;

/**
 * 转换器工厂，所有domain到vo的转换器都在这里注册
 *
 * @autor youmoo
 * @since 2014-06-14 下午7:27
 */
public class Converters {
    private static Map<Class, Converter> CONVERTERS = ObjectFactory.newHashMap();

    public static void register(Class clz, Converter converter) {
        CONVERTERS.put(clz, converter);
    }

    public static <T, R> List<R> convert(List<T> list, Class<R> rClass) {
        Converter<T, R> converter = get(rClass);
        List<R> result = ObjectFactory.newArrayList();
        for (T t : list) {
            result.add(converter.convert(t));
        }
        return result;
    }

    private static <T, R> R convert(T t, Converter<T, R> converter) {
        return converter.convert(t);
    }

    public static <T, R> R convert(T t, Class<R> rClass) {
        return get(rClass).convert(t);
    }

    private static <T, R> Converter<T, R> get(Class<R> rClass) {
        return CONVERTERS.get(rClass);
    }
}
