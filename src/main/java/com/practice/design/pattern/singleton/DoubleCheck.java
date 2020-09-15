package com.practice.design.pattern.singleton;

public class DoubleCheck {

    // volatile 保证代码的执行顺序不受 jvm 重排序影响。
    // JVM 重排：当 JVM 在指令优化时，会将原本顺序中的 2、3 步骤交换
    // 原本顺序： 1. 分配内存 2. 初始化对象 3.将对象指向刚分配的内存空间
    private static volatile DoubleCheck doubleCheck = null;

    private DoubleCheck() {}

    public static DoubleCheck getInstance() {
        if (doubleCheck == null) {
            synchronized (DoubleCheck.class) {
                if (doubleCheck == null) {
                    doubleCheck = new DoubleCheck();
                }
            }
        }

        return doubleCheck;
    }
}
