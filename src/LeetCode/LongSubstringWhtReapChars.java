package LeetCode;

import java.util.HashMap;

public class LongSubstringWhtReapChars {

    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int maxLength = 0;
        int left = 0;

        HashMap<Character, Integer> charMap = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            if(charMap.containsKey(currentChar)) {
                // Move the left pointer to the right of the last occurrence of currentChar
                left = Math.max(left, charMap.get(currentChar) + 1);
            }
            charMap.put(currentChar, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;

    }

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";

        System.out.println(lengthOfLongestSubstring(s1));
        System.out.println(lengthOfLongestSubstring(s2));
        System.out.println(lengthOfLongestSubstring(s3));
    }
}



 /*
 Given a string s, find the length of the longest
substring
 without repeating characters.



Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
  */

/**
 * the problem ask to find the length of the longest substring without repeating characters
 * I used a HashMap approach, how this works
 * by using two pointers "left" and "right"
 * the left pointer will start the substring
 * and the right will end the current substring.
 *
 * so in HashMap we store the character as keys and indices as values
 *
 * then i started a loop that iterates through the string from the right pointer by checking if that
 * character is a repeating one.
 * then used a if statement to see if that string contains the character
 *
 * then moved the left pointer to the right of the last occurrence of currentChar
 *
 * in each iteration we update the maxLength by taking the max and the size of current window
 * at the end we return the maxLength
 *
 */