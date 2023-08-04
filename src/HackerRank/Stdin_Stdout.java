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