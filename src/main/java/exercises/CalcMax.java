//conversation exercise class 2
//Exercise 2.1 Loops

package exercises;

import java.util.Scanner;

public class CalcMax{

    static void main(){
        int number = getValidInteger("Please enter a number:"); //user input for an int
        System.out.println("You have entered: " + number); //if user has correctly entered a int it will print the number
    }

    public static int getValidInteger(String prompt){
        Scanner input = new Scanner(System.in);

        System.out.println(prompt);

        while (!input.hasNextInt()){ //while loop so the user can keep entering inputs until they correctly enter an int
            System.out.println("The info you've entered was inappropriate"); //print statement when user has incorrectly entered an int
            System.out.println(prompt);
            input.next(); //voids the invalid input without would be a spam
        }
        return input.nextInt(); //returns the valid number
    }
}
