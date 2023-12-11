package com.lissenok88;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSumTest1() {
        int[] actual = TwoSum.twoSum(new int[]{2, 7, 11, 15}, 9);
        int[] expected = {0, 1};
        assertArrayEquals(expected, actual);
    }

    @Test
    void twoSumTest2() {
        int[] actual = TwoSum.twoSum(new int[]{3, 2, 4}, 6);
        int[] expected = {1, 2};
        assertArrayEquals(expected, actual);
    }

    @Test
    void twoSumTest3() {
        int[] actual = TwoSum.twoSum(new int[]{3, 3}, 6);
        int[] expected = {0, 1};
        assertArrayEquals(expected, actual);
    }
}