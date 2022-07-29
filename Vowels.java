//Java Program to know the char/word starting with vowel
import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        System.out.println("Enter any word or letter: ");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        boolean isVowel = false;
        switch(c) {


            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': isVowel = true;

        }
        if (isVowel) {
            System.out.println("Your word starts with vowel");
        }
        else {
            System.out.println("Your word doesn't starts with vowel");
        }
    }


}
