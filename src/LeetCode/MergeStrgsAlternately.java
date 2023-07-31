package LeetCode;

import java.util.Locale;

public class MergeStrgsAlternately {
    public String mergeAlternately(String word1, String word2){

        StringBuilder result = new StringBuilder(); //we create a StringBuilder to store the merged result
        int i = 0; // provide a variable to iterate through the strings

        //creating a loop, and proceed until we have been through all characters from both strings
        while (i < word1.length() || i < word2.length()) {
            if (i< word1.length()){ //if there are char-s left in word1, append the char at index i to the result
                result.append(word1.charAt(i));
            }
            if (i < word2.length()) { //if there are char-s left in word2, append the char at index i to the result
                result.append(word2.charAt(i));
            }
            i++; // Move to the next character index in both strings
        }
        return result.toString();
    }

    public static void main(String[] args) {
        MergeStrgsAlternately mergeStrgsAlternately = new MergeStrgsAlternately();

        String word1 = "abc";
        String word2 = "pqr";

        String mergedString = mergeStrgsAlternately.mergeAlternately(word1, word2);

        System.out.println("Merged String: " + mergedString);
    }

}


/*
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.


Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
 */


/**    -Intuition & approach:
 *
 * This problem asks to merge 2 strings alternately, while we can go through both strings at the same time and pick
 * each character alternately from both strings.
 *
 * so, first we need to initialize an empty string to store our merge result.
 * then, creating a loop, and proceed until we have been through all characters from both strings
 * then use a if statement for word1 and word2 and append the char at index i to the result
 * and finally return the merged result string
 *
 * time complexity of this approach is O(n), where n is the length of the longer string.
 *
 */
