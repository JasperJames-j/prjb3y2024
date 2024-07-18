//Create a program where user inputs two numbers and perform 4 basic arithmetic operations using 4 methods with return types and print the result

import java.util.Scanner;

public class July18 {
    static double Addition(double num1, double num2){
        return num1 + num2;
    }
    
    static double Subtraction(double num1, double num2){
        return num1 - num2;
    }
    
    static double Multiplication(double num1, double num2){
        return num1 * num2;
    }
    
    static double Division(double num1, double num2){
        return num1 / num2;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double input1 = s.nextDouble();
        
        System.out.print("Enter second number: ");
        double input2 = s.nextDouble();
        
        double add = Addition(input1, input2);
        double sub = Subtraction(input1, input2); 
        double times = Multiplication(input1, input2);
        double div = Division(input1, input2); 
        
        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + times);
        System.out.println("Division: " + div); 
    }
}
