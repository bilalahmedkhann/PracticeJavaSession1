//Adding Two Numbers

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Enter any two number: ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = a + b;
        System.out.println(c);
    }
}
