package com.example.nanqiao.common.util;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.BeanUtils;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author smile
 */
public class MyBeanUtils {
    public static <T> T convert(Object source, Class<T> targetClass) {
        if (source == null || targetClass == null) {
            return null;
        }

        T target = BeanUtils.instantiate(targetClass);
        BeanUtils.copyProperties(source, target);
        return target;
    }

    public static <T> List<T> convertList(List<?> sources, Class<T> targetClass) {
        if (CollectionUtils.isEmpty(sources) || targetClass == null) {
            return Collections.emptyList();
        }

        return sources.stream().map(it -> convert(it, targetClass)).collect(Collectors.toList());
    }
}
