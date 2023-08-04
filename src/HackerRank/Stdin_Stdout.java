package HackerRank;

import java.util.Scanner;

public class Stdin_Stdout {

    public static void main(String[] args) {
        // Creating a new Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);

        // Using a while loop to read integers until there are no more integers to read
        while (scan.hasNextInt()){
            int a = scan.nextInt();// Reading the next integer from the input
            System.out.println(a);
        }

        scan.close(); //closing the scanner

    }
}
 /*
 Task:
 In this challenge, you must read  integers from stdin and then print them to stdout.
 Each integer must be printed on a new line. To make the problem a little easier,
 a portion of the code is provided for you in the editor below.

Input Format:
There are  lines of input, and each line contains a single integer.

Sample Input:
42
100
125

  */

/**
 * Stdin (standard input)/ Stdout (standard output) => standard streams
 *
 * Intuition:
 *This code read integers from the standard input (stdin) and print them on separate lines until there are no more
 * integers left to read. It uses a while loop to keep reading integers as long as the input contains integers.
 * Once there are no more integers, the loop terminates, and the code get to the scan.close() statement,
 * that will close the Scanner object to free up resources.
 *
 * Time complexity:
 * time complexity it is linear, because the code wil be read line by line, from input to the end.
 * Time complexity is O(n), where n is the number of integers that are read from input.
 *
 */