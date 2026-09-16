//conversation exercise class 2
//Exercise 1.1 Loops
package exercises;

import java.util.Scanner; //scanner being inputted

public class SumAndAverageLoop { //creating class
    static void main (){
        Scanner input = new Scanner(System.in); //only need this Scanner line once per file. it allows us to access the terminal
        int target =-1; //target user has to guess
        int guess = 0; //guess int holder
        int sum = 0; //sum variable (add all users guesses together until they do '-1')
        int averageNumbers = 0; //int holder to help find the average later on
        int average = 0; //average variable to find the average of the users guesses before they guesses -1
        while(guess!= target){ //while loop to allow the user to guess multiple times until its correct.
            System.out.println("Guess the number!");
            guess = input.nextInt();//changing the guess amount to the amount the user has entered.

            if(guess == target){ //if statements. if the user did guess -1 this will happen
                System.out.println("Well Done, that's correct!"); //this will inform the user they are correct
                System.out.println("Here is your Sum of numbers entered " + sum); //this will show the user the sum of their guesses.
                average = sum / averageNumbers; //this is maths for their average the sum of their guesses divided by amount of guesses they made.
                System.out.println("Your average of numbers is "+average); //this prints out the users average
            }

            else {
                System.out.println("Try again"); //else statement to tell the user try again
                sum = sum + guess; //this is the maths of the sum of their guesses
                averageNumbers = averageNumbers + 1; //this is the amount of times they've guessed to be uses for the average.
            }
        }
        System.out.println("You're free!"); //this informs the user the program has terminated.
    }
}
