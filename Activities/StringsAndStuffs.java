

import java.util.Scanner;

public class StringsAndStuffs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = s.next();
        
        int len = word.length();
        
        System.out.println("The length of the word is: "+len);
        System.out.println("It's upper case value: " + word.toUpperCase());
        System.out.println("It's lower case value: " + word.toLowerCase());
        System.out.println("The first letter of it: " + word.charAt(0));
        System.out.println("The last letter of it: " + word.charAt(word.length()-1));
        System.out.println("The substring of the word from 2nd letter to it's 5th letter: " + word.substring(1, 4));  
    }
}
