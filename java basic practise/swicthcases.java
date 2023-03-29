import java.util.*;
public class swicthcases {
    public static void main(String[] args) {
        System.out.println("enter alphabets ");
        Scanner x=new Scanner(System.in);
        char y = x.next().charAt(0);
        switch (y) {
            case 'a','e','i','o','u' -> System.out.println("it is a vowel");

            default -> System.out.println("it is consonant ");
        }
    }
}
