package com.company;

/*
* Given an integer x, return true if x is palindrome integer.
*
* An integer is a palindrome when it reads the same backward as forward.
*
* For example, 121 is a palindrome while 123 is not.
* */

public class PalindromeNumber {
    public static void main(String[] args) {
        PalindromeNumber pn= new PalindromeNumber();
        System.out.println(pn.isPalindrome(121));
    }

    public boolean isPalindrome(int x) {
        String result = x < 0 ? -x + "-" : String.valueOf(x);

        String result1 = x < 0 ? new StringBuilder(String.valueOf(-x)).append("-").reverse().toString()
                : new StringBuilder(String.valueOf(x)).reverse().toString();

        return result.equals(result1);
    }
}
