package org.example;


import java.util.Scanner;

public class CeilingFan {

    // instance variable sets the speed of the fan initially. used in methods.
    int baseSpeed = 0;

    /* sets the default direction of the fan. If true, fan is spinning clockwise. If false, fan is spinning
    counterclockwise.
     */
    boolean defaultDirection = true;

    // prints the direction to console for the user to be aware. Set to clockwise initially.
    String printableDirection = "Clockwise";

    // method used to change the speed of the fan.
    // Fan is set to default speed of 0.
    public void changeSpeed() {

        this.baseSpeed += 1;

        // if the base speed reaches 3, reset the speed to 0.
        if (this.baseSpeed > 3) {
            this.baseSpeed = 0;
        }

        System.out.println("The ceiling fan's speed is now: Speed " + this.baseSpeed + ". The direction of the ceiling fan is: " +
                this.printableDirection);


    }

    // method used to change the direction of the fan.
    // direction of fan will change unrelated to the speed that is set.
    public void changeDirection() {


        // If the base speed is 0, fan cannot change direction.
        if (this.baseSpeed == 0) {
            System.out.println("You cannot change direction at speed 0.");
        }

        // main code in else block. Change direction of fan here.
        else {
            // Prompt the user once more before changing fan direction. This fixed logical errors.
            System.out.println("\nThe ceiling fan is currently spinning: " + this.printableDirection + "\n" +
                    "You can only change to the opposite direction.\n" +
                    "To change the direction of the fan:\n\n" +
                    "Input number 1 for Clockwise.\nInput number O for Counterclockwise.");

            // get user to input yes or no.

            Scanner sc = new Scanner(System.in);
            int response = sc.nextInt();


            // Switches the direction of the ceiling fan depending on the initial direction of the fan.
            if (response == 0) {

                this.defaultDirection = false;

                // confirm if defaultDirection is false. set currentDirection to CounterClockwise if  false.
                if (!this.defaultDirection) {

                    // assign direction of fan to a printable instance variable.
                    this.printableDirection = "Counter-clockwise.";


                }
                // Let user know which direction the fan is spinning
                System.out.println("The ceiling fan is now spinning: " + this.printableDirection +
                        " The current ceiling fan speed is: "
                        + this.baseSpeed);

            }

            if (response == 1) {

                this.defaultDirection = true;

                // confirm if defaultDirection is true. set currentDirection to Clockwise if defaultDirection is false.
                if (this.defaultDirection) {


                    this.printableDirection = "Clockwise.";


                }
                // Let user know which direction the fan is spinning
                System.out.println("The ceiling fan is now spinning: " + this.printableDirection +
                        " The current ceiling fan speed is: "
                        + this.baseSpeed);

            }

        }


    }

    // use functionality of fan. Uses methods from CeilingFan class.
    public void useFan() {

        // variable used to run do while loop.
        int x = 1;

        // create fan object.
        CeilingFan fan = new CeilingFan();

        // user can decide how many times they want to change the speed of the fan, and/or the direction.
        do {
            // get user Input
            Scanner sc = new Scanner(System.in);

            System.out.println("\n\nInput 1 to change Speed.\nInput 2 to change Direction.\nEnter 0 to exit.");

            int userInput = sc.nextInt();

            if (userInput == 1) {
                fan.changeSpeed();
            } else if (userInput == 2) {
                fan.changeDirection();
            } else if (userInput == 0) {
                sc.close();
                x = 0;
            }

        } while (x > 0);

        System.out.println("Thanks for using CeilingFan. Take care.");

    }


}

