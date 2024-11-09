package FlowOfProgram;

import java.util.Scanner;

public class FlowOfProgram {

    public static void main(String[] args) {
        askNumTillExit();
    }

    // 1. Input a year and find whether it is a leap year or not
    public static boolean checkIfItIsLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    };

    // 2.Take a number as input and print the multiplication table for it.
    public static void displayMultiplicationTable(int num){

//        Using for Loop
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(num + " x " + i + " = " + (num * i));
//        }

//        Using While loop
        int i = 1;
        while ( i <= 10){
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }

    }

    // 3. Take 2 numbers as inputs and find their HCF and LCM
    public static void calculateHCFAndLCM(int num1, int num2) {
        int dividend = 1;
        int divisor = 1;

        // Determine the larger and smaller of the two numbers
        if (num1 > num2) {
            dividend = num1;
            divisor = num2;
        } else {
            dividend = num2;
            divisor = num1;
        }

        int remainder = dividend % divisor;

        // Calculate HCF using the Euclidean algorithm
        while (remainder != 0) {
            dividend = divisor;
            divisor = remainder;
            remainder = dividend % divisor;
        }

        int hcf = divisor;
        System.out.println("HCF is " + hcf);

        // Calculate LCM using the formula: LCM = (num1 * num2) / HCF
        int lcm = (num1 * num2) / hcf;
        System.out.println("LCM is " + lcm);
    }

    // 4.Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all
    public static void  askNumTillExit(){

       try{

           int sum = 0;
           Scanner scanner = new Scanner(System.in);
           while(true){
               System.out.print("Enter the num: ");
               String userInput = scanner.next();

               if(userInput.equalsIgnoreCase("x")){
                   System.out.println("Program Ended");
                   break;
               } else {
                   int userInputNum = Integer.parseInt(userInput);
                   sum += userInputNum;
               }
           }

           System.out.println("The sum is " + sum);

       } catch (Exception e){
           System.out.println(e);
       }

    }
}

