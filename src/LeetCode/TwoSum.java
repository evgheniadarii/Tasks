package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> complementMap = new HashMap<>(); // Used Map to store the complements

            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i]; // Calculating the complement for the current element

                if (complementMap.containsKey(complement)) {
                    // If the complement exists in the map, return the indices of the two numbers
                    return new int[] { complementMap.get(complement), i };
                }

                complementMap.put(nums[i], i);// Added the current number and its index to the map as key and value
            }

            // No solution found, handle it as needed
            return new int[0];
        }

        public static void main(String[] args) {
            int[] nums = {2, 7, 11, 15};
            int target = 9;

            TwoSum solution = new TwoSum();
            int[] indices = solution.twoSum(nums, target);

            System.out.println(Arrays.toString(indices));
        }
    }


