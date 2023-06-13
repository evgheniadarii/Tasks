package June6th;

import java.util.Arrays;

public class SmallestDifference {

    public static int computeSmallestDifference(int[] array1, int[] array2) {
        //Sort the arrays in ascending order
        Arrays.sort(array1);
        Arrays.sort(array2);
        int smallestDifference = Integer.MAX_VALUE;

        //then I'll use 2 pointers for each array
        int i= 0; // pointer for array1
        int j = 0; // pointer for array2

        while (i<array1.length && j < array2.length){
            int difference = Math.abs(array1[i] - array2[j]);
            smallestDifference = Math.min(smallestDifference, difference);

            //move the pointers based on the comparison
            if (array1[i] < array2[j]){
                i++;
            }else {
                j++;
            }
        }
        return smallestDifference;
    }

    public static void main(String[] args) {
        int[] array1 = {1,3,15,11,2};
        int[] array2 = {23, 127, 235, 19, 8};

        int smallestDifference = computeSmallestDifference(array1, array2);
        System.out.println("smallestDifference = " + smallestDifference);
    }


}

/*
Task 2
Given 2 arrays of integers, compute the pair of values (one value in each array) with the smallest (non-negative) difference.
Return the difference.
Example: {1,3,15,11,2}, {23, 127, 235, 19, 8}
output: 3. That is the pairs(11,8).

 */