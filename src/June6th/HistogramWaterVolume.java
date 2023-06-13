package June6th;

public class HistogramWaterVolume {
    public static int calculateWaterVolume(int[] histogram) {
        //first the algorithm will calculate 2 arrays the left and right Max's:
        int n = histogram.length;
        int[] leftMax = new int[n]; // this array it will store the max height to the left of each bar
        int[] rightMax = new int[n]; //this array it will store the max height to the right of each bar

        //calculate the maximum height to the left of each bar
        leftMax[0] = histogram[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], histogram[i]);
        }

        //Calculate the maximum height to the right of each bar
        rightMax[n - 1] = histogram[n - 1];
        for (int i = n-2; i >= 0 ; i--) {
            rightMax[i] = Math.max(rightMax[i+1], histogram[i]);
        }

        int waterVolume = 0;
        for (int i = 0; i < n; i++) {
            //calculate the height of water at each bar
            int waterHeight = Math.min(leftMax[i], rightMax[i]);

            // calculate the volume of water at each bar
            int barVolume = waterHeight - histogram[i];

            //accumulate the total water volume
            waterVolume += barVolume;
        }

        return waterVolume;

    }

    public static void main(String[] args) {
        int[] histogram = {0, 0, 4, 0, 0, 6, 0, 0, 3, 0, 5, 0, 1, 0, 0, 0};
        int waterVolume;
        waterVolume = calculateWaterVolume(histogram);
        System.out.println("waterVolume = " + waterVolume);
    }


}

/*

Task 4
Imagine a histogram (bar graph). Design an algorithm to compute the volume of water it could hold if someone poured
water across the top. You can assume that each histogram bar has width 1.
Example: Black bars are the histogram. Gray is water)
Input: {0, 0, 4, 0, 0, 6, 0, 0, 3, 0, 5, 0, 1, 0, 0, 0}

          |
          |         |
    |     |         |
    |     |     |   |
    |     |     |   |
____|_____|_____|___|___|______
0 0 4 0 0 6 0 0 3 0 5 0 1 0 0 0

Output: 26


to understand this task we first have to study this example, to see what we can learn from it.
First in the algorithm we look at the leftmost bar of the histogram. This bar isn't necessarily the tallest bar in the
entire histogram,but it is the first bar we consider when calculating the water volume.
The role of the leftmost bar is to serve as a reference point for calculating the water height at each subsequent bar.
By considering the leftmost bar, we establish a baseline for the water height.
As we move from left to right in the histogram, we compare the current bar's height with the leftmost bar.
If the current bar's height is greater than or equal to the leftmost bar's height, it means the water can potentially
flow over the leftmost bar and contribute to the water volume. If the current bar's height is smaller,
it means the water will be contained at the level of the leftmost bar.
The leftmost bar helps determine the water height at each position.
It acts as a reference point for the water level, allowing us to calculate the water volume by taking the minimum
 of the leftmost bar's height and the maximum height to the right of each position.
By considering the leftmost bar first and then moving from left to right, we can calculate the water volume accurately
 based on the characteristics of the histogram and the relative heights of the bars.

 */
