package com.practice.design.pattern.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author Liu Chang
 * @Date 2020/11/23 9:17 上午
 */
@SpringBootTest
class LazyTest {

    @Test
    public void test() {
        Lazy lazy1 = Lazy.getInstance();
        Lazy lazy2 = Lazy.getInstance();
        Assert.isTrue(Objects.equals(lazy1, lazy2));
    }
}