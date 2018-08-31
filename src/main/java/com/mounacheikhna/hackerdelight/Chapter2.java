package com.mounacheikhna.hackerdelight;

public class Chapter2 {

    public static int turnOffRightMostOnBit(int x) {
        return x & (x - 1);
    }

    public static boolean isPowerOfTwo(int x) {
        return x != 0 && (x & (x - 1)) == 0;
    }

    public static int turnOnRightMostOnBit(int x) {
        return x | (x + 1);
    }

    public static int turnOffTrailingOnes(int x) {
        return x & (x + 1);
    }
}
