package com.arch.biz.framework;

/**
 * Created by chenxiaobian on 16/7/4.
 */
public interface BeanMappingService {

    <T> T transform(Object o, Class<T> clazz);
}
