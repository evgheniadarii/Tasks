package HackerRank;

import java.util.Scanner;

public class NumberWeirdnessChecker {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt(); //read the integer input N from the user
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        //check if N is odd
        if (N % 2 != 0) {
            //if N is odd, print "Weird"
            System.out.println("Weird");
        } else {
            //if N is even, check the following ranges:
            if (N >= 2 && N <= 5) {
                //here if N is even and in the range 2 - 5, then print "Not Weird"
                System.out.println("Not Weird");
            } else if ( N >= 6 && N <= 20){
                //here if N is even and in the range 6 - 20, then print "Weird"
                System.out.println("Weird");
            } else {
                // here if N is even and greater than 20, print "Not Weird"
                System.out.println("Not Weird");
            }
        }

        scanner.close(); //closing the scanner
    }
}

/*
Task
Given an integer, n, perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not n is weird.

Input Format

A single line containing a positive integer, .

Constraints

Output Format

Print Weird if the number is weird; otherwise, print Not Weird.
 */

/**
 * Intuition:
 * Here, I believe, we have to decide if a given positive integer is "Weird" or "Not Weird" based on some rules.
 * My approach was if statement:
 * If the number is odd (not divisible by 2), we call it "Weird".
 * If the number is even (divisible by 2) and in the range of 2 to 5 (inclusive), we call it "Not Weird".
 * If the number is even and in the range of 6 to 20 (inclusive), we call it "Weird".
 * If the number is even and greater than 20, we call it "Not Weird".
 * The code will check these rules one by one. If any rule matches, it prints the corresponding result.
 *
 * Time complexity:
 *
 * In my approach, here are no loops or recursive calls that depend on the size of the input.
 * So, the time complexity is constant, O(1).
 *
 */