package com.practice.design.pattern.singleton;

public class Hungry {

    // initialized during class loading
    private static final Hungry hungry = new Hungry();

    private Hungry() {}

    public static Hungry getInstance() {
        return hungry;
    }
}
