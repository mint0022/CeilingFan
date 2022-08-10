package org.example;

public class Main {

    public static void main(String[] args) {

        // Create user object
        UserPrompt user = new UserPrompt();

        // Get user info
        user.getUserInfo();

        // explain fan usage to user.
        user.explainFanUsage();

        // Create fan object. use ceiling fan.
        CeilingFan fan = new CeilingFan();
        fan.useFan();
//
    }
}
