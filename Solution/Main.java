/**
 * This program does a few number operations.
 *
 * @author Mr. King
 * @version 9/14/2021
 */

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        // prompt and take input for name
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = in.nextLine();

        // call method that greets user by name and print instructions
        greetInstruct(name);

        // take input for four digit number
        int num = in.nextInt();

        // call method and print sum of digits
        int sum = sumOfDigits(num);
        System.out.println("Sum of digits: " + sum);

        // call method and print reversed digits
        int rev = reverse(num);
        System.out.println("Reversed: " + rev);
    }

    /**
     * Prints a greeting and instructions.
     *
     * @param name the name of the user
     */
    public static void greetInstruct(String n)
    {
        // greet user
        System.out.println("Hello, " + n);

        // prompt user to input a four-digit number
        System.out.print("Enter a number between 1000 and 9999: " );
    }

    /**
     * Calculates the sum of the digits.
     *
     * @param num the number to analyze
     * @return sum of the digits in num as an int
     */
    public static int sumOfDigits(int n)
    {
        int num = n;
        int ones = num % 10;
        num = num / 10;
        int tens = num % 10;
        num = num / 10;
        int hunds = num % 10;
        num = num / 10;
        int thou = num % 10;

        int sum = ones + tens + hunds + thou;

        return sum;
    }

    /**
     * Reverses the digits.
     *
     * @param num the number to analyze
     * @return the num with the digits reversed as an int
     */
    public static int reverse(int n)
    {
        int num = n;
        int ones = num % 10;
        num = num / 10;
        int tens = num % 10;
        num = num / 10;
        int hunds = num % 10;
        num = num / 10;
        int thou = num % 10;

        int rev = ones*1000 + tens*100 + hunds*10 + thou;

        return rev;

    }
}

