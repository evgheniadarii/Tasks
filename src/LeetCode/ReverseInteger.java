package LeetCode;

public class ReverseInteger {
    public static int reverse(int x) {
        //first we initialize a variable to store the reversed digits of x:
        long reversed = 0;

        //we start a loop, and it will continue until digits of x are processed
        while (x != 0) {
            int lastDigit = x % 10; //extracting the last digit of x using modulo operation
            reversed = (reversed * 10) + lastDigit; // append the last digit to the reversed number
            x = x/10; // removing the last digit from x
        }
        //now checking if the reversed value exceeds the 32-bit signed integer range using if statement
        if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE){
            return 0; ///will return zero if reversed is outside the valid range
        }

        return (int) reversed;//casting the reversed value back to int

    }

    public static void main(String[] args){
        int x = 1534236469; //adding an input number
        int reversed = reverse(x);//reversing the digits of x
        System.out.println(reversed);// printing the reversed value
    }
}

