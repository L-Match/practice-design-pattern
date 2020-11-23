package com.practice.design.pattern.singleton;

/**
 * @author liuchang
 */
public class InnerClass {
    private InnerClass () { }

    private static class SingletonHolder{
        private static final InnerClass INSTANCE = new InnerClass();
    }

    public static InnerClass getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
