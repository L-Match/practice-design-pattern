package com.practice.jesign.pattern;

import com.practice.design.pattern.singleton.Lazy;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SingletonsTest {

    @Test
    void lazy() {
        Lazy lazy1 = Lazy.getInstance();
    }
}
