package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class RomanInteger {
    public static int romanToInt(String s) {
        //creating a HasMap to store the values of Roman numerals
        Map<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        int result = 0; //initialize the result variable to store the final integer value
        int prevValue = 0; // initializing the previous value variable to keep track of the previous
        //numeral's value

        //Iterating through the input string from right to left
        for( int i = s.length() - 1; i>= 0; i--) {
            int currValue = values.get(s.charAt(i)); //getting the value of the current numeral

            //if the current numeral's value is greater than or equal to the previous numeral's value, add it to the result
            if(currValue >= prevValue) {
                result += currValue;
            }else {
                //if the current numeral's value is less than the previous we do subtraction from the result
                result -= currValue;
            }

            prevValue = currValue; //updated value

        }

        return result; // returning the final integer value
    }

    public static void main(String[] args) {
        String romanNumeral = "III";
        int number = romanToInt(romanNumeral);
        System.out.println(number);
    }
}

/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given an integer, convert it to a roman numeral.



Example :

Input: num = 3
Output: "III"
Explanation: 3 is represented as 3 ones.
 */

