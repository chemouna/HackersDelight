package com.mounacheikhna.hackerdelight;

import org.junit.Test;

import static com.mounacheikhna.hackerdelight.Chapter2.isPowerOfTwo;
import static com.mounacheikhna.hackerdelight.Chapter2.turnOffRightMostOnBit;
import static org.junit.Assert.*;

public class Chapter2Test {

    @Test
    public void testTurnOffRightMostOnBitInt() {
        int i = Integer.valueOf("0000000000000000000000000000001", 2);
        int j = Integer.valueOf("0000000000000000000000000000000", 2);
        i = turnOffRightMostOnBit(i);
        assertEquals(j, i);

        i = Integer.valueOf("0000000000000000000000000000010", 2);
        j = Integer.valueOf("0000000000000000000000000000000", 2);
        i = turnOffRightMostOnBit(i);
        assertEquals(j, i);

        i = Integer.valueOf("0000000000000000000000000000011", 2);
        j = Integer.valueOf("0000000000000000000000000000010", 2);
        i = turnOffRightMostOnBit(i);
        assertEquals(j, i);

        i = Integer.valueOf("01010111", 2);
        j = Integer.valueOf("01010110", 2);
        i = turnOffRightMostOnBit(i);
        assertEquals(j, i);

        i = Integer.valueOf("10000000", 2);
        j = Integer.valueOf("00000000", 2);
        i = turnOffRightMostOnBit(i);
        assertEquals(j, i);

        i = Integer.valueOf("11111111", 2);
        j = Integer.valueOf("11111110", 2);
        i = turnOffRightMostOnBit(i);
        assertEquals(j, i);

        i = Integer.valueOf("00000000", 2);
        j = Integer.valueOf("00000000", 2);
        i = turnOffRightMostOnBit(i);
        assertEquals(j, i);

        i = (int) Math.pow(2, 30);
        i = turnOffRightMostOnBit(i);
        assertEquals(0, i);

        i = (int) Math.pow(2, 30) + 3;
        i = turnOffRightMostOnBit(i);
        assertEquals(1073741826, i);
    }

    @Test
    public void testIsPowerOfTwo() {
        assertTrue(isPowerOfTwo(1));
        assertTrue(isPowerOfTwo(2));
        assertTrue(isPowerOfTwo(4));
        assertTrue(isPowerOfTwo(8));
        assertTrue(isPowerOfTwo(16));

        assertFalse(isPowerOfTwo(0));
        assertFalse(isPowerOfTwo(3));
        assertFalse(isPowerOfTwo(9));
        assertFalse(isPowerOfTwo(17));
    }
}