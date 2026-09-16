//class 1 intro into java
package in_class;

import java.util.Scanner;

public class Security{
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please tell me your pets name: ");
        String name = input.nextLine();
        if (name.equals("Chester")){
            System.out.println("Autorized");
        }
        else {
            System.out.println("Authorization Failed");
        }
    }
}


