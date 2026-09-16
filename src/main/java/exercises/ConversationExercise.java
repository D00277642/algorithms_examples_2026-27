//conversation exercise class 2
//sample
package exercises;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ConversationExercise {
    static void main (){
        Scanner input = new Scanner(System.in);
        int target =25;
        int guess = -1;
        while(guess!= target){
            System.out.println("Guess the number! (between 1 and 30)");
            guess = input.nextInt();

            if(guess ==target){
                System.out.println("Well Done, that's correct!");}

            else {
                System.out.println("Try again");
            }
        }
        System.out.println("You're free!");
            }
        }
