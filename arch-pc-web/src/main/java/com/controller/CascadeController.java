package com.controller;

import com.arch.biz.context.ContextContainer;
import com.arch.biz.exception.ApplicationException;
import com.dianping.cascade.Cascade;
import com.dianping.cascade.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/cascade")
public class CascadeController {
    @Autowired
    private Cascade cascade;

    @RequestMapping(value = "/query", method = RequestMethod.POST)
    @ResponseBody
    public Object cascade(@RequestBody List<Field> fields) {

        try {
            Object result = cascade.
                    process(fields, new HashMap() {{
                put("operator", ContextContainer.getUserContext());
            }});
            return result;
        } catch (Exception e) {
            throw new ApplicationException(e.getMessage());
        }
    }
}