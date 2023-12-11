package com.lissenok88;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumber_9Test {

    @Test
    void isPalindromeTest1() {
        boolean actual = PalindromeNumber_9.isPalindrome(121);
        assertTrue(actual);
    }

    @Test
    void isPalindromeTest2() {
        boolean actual = PalindromeNumber_9.isPalindrome(-121);
        assertFalse(actual);
    }

    @Test
    void isPalindromeTest3() {
        boolean actual = PalindromeNumber_9.isPalindrome(10);
        assertFalse(actual);
    }
}