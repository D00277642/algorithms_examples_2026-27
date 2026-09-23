//conversation exercise class 2
//Exercise 1.2 Loops

package exercises.conversion;

import java.util.Scanner; //scanner being inputted

public class UserEntersTwoNumbers_Maths { //creating class
    static void main() {
        Scanner input = new Scanner(System.in); //allows me to access the terminal
        int sum = 0; //sum variable to add the numbers together
        int counter = 0; //counter variable to go through the numbers
        System.out.println("Enter the first number: ");
        int num1 = input.nextInt(); //stores the first number

        System.out.println("Enter the second number: ");
        int num2 = input.nextInt(); //stores the second number

        int smallest = Math.min(num1, num2); //finds the smallest number
        int biggest = Math.max(num1, num2); //finds the biggest number

        counter = smallest; //starts counter at the smallest number

        while (counter <= biggest) { //loop until counter reaches biggest number
            sum = sum + counter; //adds counter to sum
            counter = counter + 1; //increases counter by 1
        }

        System.out.println("The sum is " + sum); //prints the final sum
    }
}