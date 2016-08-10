package com.resolver;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Map;

/**
 * Created by chenxiaobian on 16/7/1.
 */
@Component
public class TextResolver implements HandlerExceptionResolver {

    static class TextView implements View {
        private String msg;

        public TextView(String msg) {
            this.msg = msg;
        }

        @Override
        public String getContentType() {
            return "text/plain";
        }

        @Override
        public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
            response.setContentType(getContentType());
            response.setStatus(500);
            PrintWriter writer = response.getWriter();
            writer.print(this.msg);
            writer.flush();
        }
    }

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        if (ex instanceof ApplicationException) {
            return new ModelAndView(new TextView(ex.getMessage()));
        }
        return null;
    }
}
