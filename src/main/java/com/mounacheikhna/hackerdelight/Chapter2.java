package com.mounacheikhna.hackerdelight;

public class Chapter2 {

    /**
     * Turn off the rightmost on bit.
     **/
    public static int turnOffRightMostOnBit(int x) {
        return x & (x - 1);
    }

    /**
     * is x a power of 2.
     **/
    public static boolean isPowerOfTwo(int x) {
        return x != 0 && (x & (x - 1)) == 0;
    }

    /**
     * Turn on the rightmost off bit.
     **/
    public static int turnOnRightMostOffBit(int x) {
        return x | (x + 1);
    }

    /**
     * Turn off the trailing ones.
     **/
     public static int turnOffTrailingOnes(int x) {
        return x & (x + 1);
    }

    /**
     * Is number of the form 2^n - 1.
     */
    public static boolean isOfFormPowerOfTwoMinusOne(int x) {
        return (x & (x + 1)) == 0;
    }

    /**
     * Turn on trailing zeros
     */
    public static int turnOnTrailingZeros(int x) {
        return x | (x - 1);
    }

    /**
     *  Create an int with a single 1-bit at the position of the rightmost 0-bit in x, producing 0 if none
     *  (e.g., 10100111 -> 00001000): turn on trailing in 10100111 => 10100111
     *
     * x:                10100111  = 1 + 2 + 4 + 32 + 128 = 167
     * ¬x:            01011000
     * x + 1:            10101000  = 8 + 32 + 128 = 169
     * ¬x & (x+1) = 00001000
     *
     * the question to find why this works is why do neg x and x + 1 have in common only the rightmost 0 bit ->
     * neg x certainly turns it into 1 since it was 0 and x + 1 turns only the right most bit into 1 and everything
     * else is same as x which means its different than neg xso their and gives only the rightmost 0 bit set
     */
    public static int onBitInPositionOfRightMostOffBit(int x) {
        return ~x & (x + 1);
    }

    /**
     * Creates an int with a single 0-bit at the position of the rightmost 1-bit in x, producing all 1’s if none
     * (e.g., 10101000 -> 11110111):
     *
     * ¬x | (x – 1)
     *
     * x:           10101000
     *
     * ¬x:          01010111
     * x - 1:       10100111
     *              --------
     * ¬x | (x-1):  11110111
     *
     * similar to before ¬x and x-1 have in common the 0s place because x - 1 will make the rightmost zeros before 1
     * become 1 and the one directly after 1 become 0 which negation does too so their or will give 0 then the rest is
     * 1 because of or of ¬x is the inverse of x - 1 bits in the rest.
     */
    public static int offBitInPositionOfRightMostOnBitRestOnes(int x) {
        return ~x | (x - 1);
    }
}
