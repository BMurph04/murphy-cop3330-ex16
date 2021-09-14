/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Brendon Murphy
 */
package org.example;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        //input
        Scanner input = new Scanner(System.in);

        System.out.println("What is your age?");
        int userAge = input.nextInt();

        //checks to see if age is under 16
        String output = (userAge < 16)
        ? "You are not old enough to legally drive."
            : "You are old enough to legally drive.";

        //output
        System.out.println(output);
    }
}
