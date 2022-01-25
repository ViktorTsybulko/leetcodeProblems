package com.company;

/*
* There is a programming language with only four operations and one variable X:
*
* ++X and X++ increments the value of the variable X by 1.
* --X and X-- decrements the value of the variable X by 1.
*
* Initially, the value of X is 0.
*
* Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.
* */

public class FinalValueOfVariableAfterPerformingOperations {
    public static void main(String[] args) {

        FinalValueOfVariableAfterPerformingOperations f = new FinalValueOfVariableAfterPerformingOperations();
        System.out.println(f.finalValueAfterOperations(new String[] {"--X","X++"}));
    }
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for (String operation : operations) {
            if ((operation.charAt(0) == '+') || (operation.charAt(2) == '+')) {
                result++;
            } else {
                result--;
            }
        }
        return result;
    }
}
