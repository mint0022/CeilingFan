package org.example;

import java.util.Scanner;

public class UserPrompt {

    // method to get user info. Not necessary but useful
    public void getUserInfo() {

        // Get user info with scanner object
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Ceiling Fan App. Please enter your first name.");
        String firstName = sc.nextLine();

        System.out.println("Please enter your last name.");
        String lastName = sc.nextLine();



    }

    // explains what options the user has when operating the ceiling fan.
    public void explainFanUsage() {

        System.out.println("""
                
                The ceiling fan functionality works as follows:
                The ceiling fan has 4 speeds. It can be at either speed 0, 1, 2, or 3.
                If you want to increase the speed of the fan, use pull cord #1.
                You can use pull cord #1 by asking to increase the speed.
                The ceiling fan can also spin in the opposite direction, depending
                on the speed. use pull cord #2 to operate the other direction.
                You can use pull cord #2 by asking to change direction.
                please note that the fan direction will not change at speed 0.""");

    }


}
