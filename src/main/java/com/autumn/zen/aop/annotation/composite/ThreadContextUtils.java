package com.autumn.zen.aop.annotation.composite;

/**
 * Thread Context Utility
 *
 * @author zhikong.wl
 * @create 2017-10-10 11:12
 **/
public class ThreadContextUtils {

    private static ThreadLocal<String> threadName = new ThreadLocal<String>();

    public static String getName() {
        return threadName.get();
    }

    public static void setName(final String name) {
        threadName.set(name);
    }
}
