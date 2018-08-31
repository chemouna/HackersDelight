package com.mounacheikhna.hackerdelight;

import org.junit.Test;

import static com.mounacheikhna.hackerdelight.Chapter2.*;
import static org.junit.Assert.*;

public class Chapter2Test {

    @Test
    public void testTurnOffRightMostOnBit() {
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

    @Test
    public void testTurnOnRightMostBit() {
        int i = Integer.valueOf("10111100", 2);
        int j = Integer.valueOf("10111101", 2);
        i = turnOnRightMostOnBit(i);
        assertEquals(j, i);

        i = Integer.valueOf("01110111", 2);
        j = Integer.valueOf("01111111", 2);
        i = turnOnRightMostOnBit(i);
        assertEquals(j, i);

        i = Integer.valueOf("00000001", 2);
        j = Integer.valueOf("00000011", 2);
        i = turnOnRightMostOnBit(i);
        assertEquals(j, i);

        i = Integer.valueOf("10000000", 2);
        j = Integer.valueOf("10000001", 2);
        i = turnOnRightMostOnBit(i);
        assertEquals(j, i);

        i = Integer.valueOf("00000000", 2);
        j = Integer.valueOf("00000001", 2);
        i = turnOnRightMostOnBit(i);
        assertEquals(j, i);

        i = Integer.valueOf("11111111", 2);
        j = Integer.valueOf("111111111", 2);
        i = turnOnRightMostOnBit(i);
        assertEquals(j, i);
    }

    @Test
    public void testTurnOffTrailingOnes() {
        int i = Integer.valueOf("1000000000000000000000000010111", 2);
        int j = Integer.valueOf("1000000000000000000000000010000", 2);
        i = turnOffTrailingOnes(i);
        assertEquals(j, i);

        i = Integer.valueOf("1111111111111111111111111111111", 2);
        j = Integer.valueOf("0000000000000000000000000000000", 2);
        i = turnOffTrailingOnes(i);
        assertEquals(j, i);

        i = Integer.valueOf("1000000000000000000000000000000", 2);
        j = Integer.valueOf("1000000000000000000000000000000", 2);
        i = turnOffTrailingOnes(i);
        assertEquals(j, i);

        i = Integer.valueOf("0000000000000000000000000000000", 2);
        j = Integer.valueOf("0000000000000000000000000000000", 2);
        i = turnOffTrailingOnes(i);
        assertEquals(j, i);
    }

    @Test
    public void testIsOfFormPowerOfTwoMinusOne() {
        assertTrue(isOfFormPowerOfTwoMinusOne(0));
        assertTrue(isOfFormPowerOfTwoMinusOne(1));
        assertTrue(isOfFormPowerOfTwoMinusOne(3));
        assertTrue(isOfFormPowerOfTwoMinusOne(7));
        assertTrue(isOfFormPowerOfTwoMinusOne(15));

        assertFalse(isOfFormPowerOfTwoMinusOne(2));
        assertFalse(isOfFormPowerOfTwoMinusOne(4));
        assertFalse(isOfFormPowerOfTwoMinusOne(5));
        assertFalse(isOfFormPowerOfTwoMinusOne(6));
        assertFalse(isOfFormPowerOfTwoMinusOne(8));
        assertFalse(isOfFormPowerOfTwoMinusOne(9));
        assertFalse(isOfFormPowerOfTwoMinusOne(10));
    }

    @Test
    public void testTurnOnTrailingZeros() {
        int i = Integer.valueOf("1000000000000000000000000010000", 2);
        int j = Integer.valueOf("1000000000000000000000000011111", 2);
        i = turnOnTrailingZeros(i);
        assertEquals(j, i);

        i = Integer.valueOf("1000000000000000000000000011111", 2);
        j = Integer.valueOf("1000000000000000000000000011111", 2);
        i = turnOnTrailingZeros(i);
        assertEquals(j, i);

        i = Integer.valueOf("1000000000000000000000000001010", 2);
        j = Integer.valueOf("1000000000000000000000000001011", 2);
        i = turnOnTrailingZeros(i);
        assertEquals(j, i);
    }
}