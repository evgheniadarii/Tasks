package LeetCode;

public class IntegerToRoman {
    public static String intToRoman(int num){
        //first we define the arrays for symbols and corresponded values
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        //creating an object of StringBuilder to build the resulting Roman numeral
        StringBuilder sb = new StringBuilder();

        //now iterating through symbols:
        for(int i = 0; i < values.length; i++){
            //now let's repeat the current symbol while the value is greater than or equal to the symbol's value
            while (num >= values[i]){
                num -= values[i]; // subtracting the symbol's value from the num
                sb.append(symbols[i]); // append the symbol to the StringBuilder
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int number = 1994;
        String romanNumeral = intToRoman(number);
        System.out.println(romanNumeral);
    }
}
