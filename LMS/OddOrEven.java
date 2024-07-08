/* create a program that will determine if a number is Odd or even? positive or 
negative? or zero? */

package oddoreven;

import java.util.Scanner;

public class OddOrEven {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter a number");
        int num = s.nextInt();
        
        if (num > 0 && num % 2 == 0) {
            System.out.println("The number is a positive even number");
        }
        else if (num < 0 && num % 2 == 0) {
            System.out.println("The number is a negative even number");
        }
        else if (num > 0 && num % 2 != 0) {
            System.out.println("The number is a positive odd number");
        }
        else if (num < 0 && num % 2 != 0) {
            System.out.println("The number is a negative odd number");
        }
        else
            System.out.println("The number is zero");
    }
    
}
