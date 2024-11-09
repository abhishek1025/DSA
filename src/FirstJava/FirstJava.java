package FirstJava;

public class FirstJava {
    public static void main(String[] args) {
        System.out.println(checkArmStrongNum(9474));
    }

//  1. To calculate Fibonacci Series up to n numbers
    public static void printFibonacciSeries(int n){
        int num1 = -1;
        int num2 = 1;

        for (int i = 0; i < n; i++) {
            int nextNum = num1 + num2;

            num1 = num2;
            num2 = nextNum;

            System.out.print(nextNum + " ");
        }
    }

//  2. To find out whether the given String is Palindrome or not
    public static boolean checkPalindrome(String word){
        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }

        return reversedWord.equalsIgnoreCase(word);
    };

//  3. To find Armstrong Number between two given number
    public static boolean checkArmStrongNum(int num){
        String numIntoStr = "" + num;

        int sum = 0;

        for (int i = 0; i < numIntoStr.length(); i++) {
            int eachNum = Character.getNumericValue(numIntoStr.charAt(i));

            sum += Math.pow(eachNum, numIntoStr.length());
        }

        return sum == num;
    }
}
