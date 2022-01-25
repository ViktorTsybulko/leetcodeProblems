package com.company;
/*
* Given a signed 32-bit integer x, return x with its digits reversed.
*  If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
*
* Example:
*
* Input: x = -123
* Output: -321
*/


public class ReverseInteger {
    public static void main(String[] args) {
        ReverseInteger ri = new ReverseInteger();
        System.out.println(ri.reverse(-123));
    }

    public int reverse(int x) {
        String result = x < 0 ? new StringBuilder(String.valueOf(-x)).append("-").reverse().toString()
                : new StringBuilder(String.valueOf(x)).reverse().toString();
        try {
            return Integer.parseInt(result);
        } catch (Exception e) {
            return 0;
        }
    }
}
