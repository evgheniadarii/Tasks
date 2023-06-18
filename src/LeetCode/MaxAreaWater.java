package LeetCode;

public class MaxAreaWater {
    public int maxArea(int[] height) {
        //I'll use the Two-Pointer approach:
        int left = 0; // Initializing left pointer that pointing to the start of the haight array
        int right = height.length -1; //this line initializing right pointer pointing to the end of the height array
        int maxArea = 0; //this line we initialize the variable to store the maximum area

        //now we will iterate until left and right pointers will meet
        while(left < right) {
            //calculating the cur area by taking the min height between the left and right pointers,
            //multiplied by the distance between them
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea); // update maximum area if current area is greater

            if(height[left] < height[right]){
                left++;//if the height at the left pointer is smaller then we increment the left pointer
            }else{
                right--; // if the height at the right pointer is smaller then we decrement the right pointer
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {

        MaxAreaWater maxAreaWater = new MaxAreaWater();//created an instance of MaxAreaWater class

        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};// this line defines the height array
        int maxWater = maxAreaWater.maxArea(height);// this line explains how to call the maxArea method to
                                                    // get the maximum amount of water

        System.out.println("Maximum amount of water the container can hold: " + maxWater);

    }

}


