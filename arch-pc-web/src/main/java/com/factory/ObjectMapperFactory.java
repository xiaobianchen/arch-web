package com.factory;

import com.fasterxml.jackson.databind.DeserializationFeature;


import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by chenxiaobian on 16/7/1
 */
public class ObjectMapperFactory {

    private static final ObjectMapper MAPPER = new ObjectMapper();;

    static {
        MAPPER.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        MAPPER.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
        MAPPER.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public static ObjectMapper getMapper(){
        return MAPPER;
    }

}
