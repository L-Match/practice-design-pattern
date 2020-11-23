package com.practice.design.pattern.singleton;

/**
 * @author liuchang
 */
public class Lazy {
    private static Lazy lazy = null;

    private Lazy() {};

    public static Lazy getInstance() {
        if (lazy == null) {
            lazy = new Lazy();
        }
        return lazy;
    }

}
