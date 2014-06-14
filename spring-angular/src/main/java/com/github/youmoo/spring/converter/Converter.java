package com.github.youmoo.spring.converter;

/**
 * domain到vo的转换接口
 * 注意：其子类应该是无状的类，以使ConverterRegister正确执行
 * @autor youmoo
 * @since 2014-06-14 下午7:23
 */
public interface Converter<T, R> {
    public R convert(T t);
}
