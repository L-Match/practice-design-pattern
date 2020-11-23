package com.practice.design.pattern.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

/**
 * @Author Liu Chang
 * @Date 2020/11/23 9:31 上午
 */
@SpringBootTest
class HungryTest {

    @Test
    public void test() {
        Hungry hungry1 = Hungry.getInstance();
        Hungry hungry2 = Hungry.getInstance();
        Assert.isTrue(hungry1.equals(hungry2));
    }

}