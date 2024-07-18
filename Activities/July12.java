import java.util.*;

public class July12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter a word, let's determine if it is a palindrome word:");
        String word = s.next();
        
        StringBuilder input = new StringBuilder(word);
        input.reverse();
        System.out.println(input);
        
        //di ko na alam next sir sori pu
    }
}
