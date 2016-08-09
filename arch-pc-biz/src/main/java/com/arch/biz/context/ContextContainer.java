package com.arch.biz.context;

/**
 * Created by chenxiaobian on 16/7/1.
 */
public class ContextContainer {

    private static ThreadLocal<UserContext> userContext = new ThreadLocal<>();

    public static UserContext getUserContext(){
        if(userContext.get() == null){
            userContext.set(new UserContext());
        }
        return userContext.get();
    }

    public static void setContext(UserContext context) {
        userContext.set(context);
    }

    public static void clear(){
        userContext.remove();
    }

}
