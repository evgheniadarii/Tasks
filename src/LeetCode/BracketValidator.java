package LeetCode;

import java.util.Stack;

public class BracketValidator {

    public static boolean isValid(String s) {
        // Creating a stack to store open brackets
        Stack<Character> stack = new Stack<>();

        // starting a Loop that will go through each character in the input string
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c); //if the bracket opened is encountered than through this method it will push it onto the stack
            } else {
                if (stack.isEmpty()) { // If a closing bracket is encountered
                    return false; // If stack is empty it will return false
                }
                char top = stack.pop(); // Get the top element from the stack
                if (c == ')' && top != '(') { // Check if the closing bracket it will match the open bracket
                    return false;
                }
                if (c == ']' && top != '[') {
                    return false;
                }
                if (c == '}' && top != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty(); // If the stack is empty at the end, all brackets are balanced
    }

    public static void main(String[] args) {
        BracketValidator bracketValidator = new BracketValidator(); // Create an instance of the Solution class

        String input1 = "()";
        String input2 = "()[]{}";
        String input3 = "(]";

        System.out.println(bracketValidator.isValid(input1)); // Output: true
        System.out.println(bracketValidator.isValid(input2)); // Output: true
        System.out.println(bracketValidator.isValid(input3)); // Output: false

    }
}

/*
Task Valid parentheses:
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 */

/**
 * Intuition & approach:
 *
 * From a tester's perspective, I think of a stack like a stack of books. Let's Imagine we have a pile of books,
 * and we can only put a new book on the top of the pile, and we can only take a book from the top.
 *
 * In my approach a "stack" is a way to keep track of the brackets in my string.
 * When I encounter an opening bracket (like '(' or '{' or '['), I "put it on the stack"
 * (like adding a book to the top of the pile). When I encounter a closing bracket (like ')' or '}' or ']'),
 * I'll "take a book off the stack" (like removing a book from the top of the pile) and check if it matches
 * the type of bracket you're closing.
 *
 * For example, if you see '(', you put it on the stack. If you then see ')',
 * you take the '(' off the stack and check if they match. If they do, great! If they don't,
 * then the string is not valid.
 *That's why my approach is based on stack data structure that uses the LIFO method, and then I started a for each loop
 * that will go through each character in the input string.
 * after I checked through if statement how brackets are working.
 *
 * at the end returning the empty stack
 *
 * then created a main method to run the code.
 */
