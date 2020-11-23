package com.practice.design.pattern.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

/**
 * @Author Liu Chang
 * @Date 2020/11/23 9:35 上午
 */
@SpringBootTest
class InnerClassTest {

    @Test
    public void test() {
        InnerClass innerClass1 = InnerClass.getInstance();
        InnerClass innerClass2 = InnerClass.getInstance();
        Assert.isTrue(innerClass1.equals(innerClass2));
    }

}