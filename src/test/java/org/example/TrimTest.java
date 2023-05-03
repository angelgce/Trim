package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class TrimTest {
    @Test
    void test1() {
        String text1 = " Mary had a little lamb! ";
        assertEquals(text1.trim(), MyTrim.trim(text1));

    }

    @Test
    void test2() {
        String text2 = " Mary had a little lamb!";
        assertEquals(text2.trim(), MyTrim.trim(text2));
    }

    @Test
    void test3() {
        String text3 = "Mary had a little lamb! ";
        assertEquals(text3.trim(), MyTrim.trim(text3));
    }

    @Test
    void test4() {
        String text4 = "Mary had a little lamb!";
        assertEquals(text4.trim(), MyTrim.trim(text4));
    }

    @Test
    void test5() {
        String text5 = "   Mary had a little lamb!   ";
        assertEquals(text5.trim(), MyTrim.trim(text5));
    }
}