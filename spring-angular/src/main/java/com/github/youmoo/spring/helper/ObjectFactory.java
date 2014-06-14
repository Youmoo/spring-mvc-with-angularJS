package com.github.youmoo.spring.helper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @autor youmoo
 * @since 2014-06-14 下午5:36
 */
public class ObjectFactory {
    public static <K, V> Map<K, V> newHashMap() {
        return new HashMap<K, V>();
    }

    public static <E> List<E> newArrayList() {
        return new ArrayList<E>();
    }
}
