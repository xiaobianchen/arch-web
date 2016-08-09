package com.arch.biz.util;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.commons.lang3.reflect.MethodUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by chenxiaobian on 16/7/1.
 */
public class EnumUtils {

    public static List<Map<String, Object>> generateResult(Class c) {

        try {
            List<Map<String, Object>> list = Lists.newArrayList();
            Object[] objects = (Object[]) MethodUtils.invokeStaticMethod(c, "values");
            for (Object enums : Arrays.asList(objects)) {
                list.add(build(MethodUtils.invokeMethod(enums, "getCode"), MethodUtils.invokeMethod(enums, "getDesc")));
            }
            return list;
        } catch (Exception e) {
            return Lists.newArrayList();
        }
    }

    public static List<Map<String, Object>> generateResultWithAll(Class c) {

        try {
            List<Map<String, Object>> list = Lists.newArrayList();
            list.add(build(0, "全部"));
            Object[] objects = (Object[]) MethodUtils.invokeStaticMethod(c, "values");
            for (Object enums : Arrays.asList(objects)) {
                list.add(build(MethodUtils.invokeMethod(enums, "getCode"), MethodUtils.invokeMethod(enums, "getDesc")));
            }
            return list;
        } catch (Exception e) {
            return Lists.newArrayList();
        }
    }

    private static Map<String, Object> build(Object key, Object value) {
        Map<String, Object> map_ = Maps.newHashMap();
        map_.put("text", value);
        map_.put("value", key);
        return map_;
    }
}
