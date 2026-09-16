// Class 1 into to java
package in_class;

import java.util.Scanner;

public class DemoID {
    static void main() {
        Scanner input = new Scanner(System.in); //made this once, because its in the same class(can keep reusing it.
        System.out.println("Please enter your name: ");

        String name = input.nextLine();
        System.out.println("Hello there, " + name);

        if (!name.equals("admin")){
            System.out.println("You're banned, get out!");
        }
        else {
            System.out.println("Please enter your age: ");  //sout tab to get this auto.
            int age = input.nextInt();

            if (age < 18) { //brackets around the if terms
                System.out.println("You're to young, get out!");
            } //curly bracket to show the start and end of certain lines/sections of code
            else if (age < 25) {
                System.out.println("No car retal for you!");
            } else {
                System.out.println("Welcome in!");
            }
        }
    }
}