package com.company;

import java.util.Stack;

/*
* Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
* determine if the input string is valid.
*
* An input string is valid if:
*
* 1)Open brackets must be closed by the same type of brackets.
* 2)Open brackets must be closed in the correct order.
* */

public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        System.out.println(vp.isValid("([]))"));
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();

        for(char ch : s.toCharArray()) {
            if(isOpenParenthesis(ch)) {
                stack.push(ch);
            } else {
                if(stack.isEmpty()) {
                    return false;
                }
                char popped = stack.pop();
                if(!isParenthesisMatch(popped, ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean isOpenParenthesis(char ch) {
        return ch == '(' || ch == '{' || ch == '[';
    }

    private boolean isParenthesisMatch(char open, char close) {
        return (open=='(' && close==')')
                || (open=='{' && close=='}')
                || (open=='[' && close==']');
    }
}
