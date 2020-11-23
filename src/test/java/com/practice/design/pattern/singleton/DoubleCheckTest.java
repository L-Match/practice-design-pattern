package com.practice.design.pattern.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author Liu Chang
 * @Date 2020/11/23 9:27 上午
 */
@SpringBootTest
class DoubleCheckTest {

    @Test
    public void test() {
        DoubleCheck doubleCheck1 = DoubleCheck.getInstance();
        DoubleCheck doubleCheck2 = DoubleCheck.getInstance();
        Assert.isTrue(doubleCheck1.equals(doubleCheck2));
    }
}