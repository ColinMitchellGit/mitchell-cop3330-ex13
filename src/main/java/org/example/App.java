/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Colin Mitchell
 */

package org.example;
import java.util.Scanner;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;
import static java.lang.Math.pow;
public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the principal amount? ");
        String principal_string = input.nextLine();

        System.out.print("What is the rate? ");
        String rate_string = input.nextLine();

        System.out.print("What is the number of years? ");
        String years_string = input.nextLine();

        System.out.print("What is the number of times the interest is compounded per year? ");
        String compounded_string = input.nextLine();

        int principal = parseInt(principal_string);
        double rate = parseDouble(rate_string) / 100;
        int years = parseInt(years_string);
        int compounded = parseInt(compounded_string);

        double calculation = principal * pow((1 + (rate / compounded)), (compounded * years));
        String final_amount = String.format("%.2f", calculation);

        System.out.println("$" + principal_string + " invested at " + rate_string + "% for " + years_string + " years compounded " + compounded_string + " times per year is $" + final_amount + ".");
    }
}
