package June6th;

public class SwappingNumbers {
    public static void swapNumbers(int a, int b){
        //swapping without temporary variables
        a = a + b; // add the values of a and b and store the result in a
        b = a - b; // subtract the original value of b from the updated value of a and store the result in b
        a = a-b; //subtract the updated value of b from the updated value of a and store the result in a

        //Print the swapped values
        System.out.println("After swapping: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        //print the original values
        System.out.println("Before swapping: ");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        //call the swapNumbers function
        swapNumbers(num1, num2);
    }

}

/*
Task 1
Write a function to swap a number in place (that is, without temporary variables).


 */
