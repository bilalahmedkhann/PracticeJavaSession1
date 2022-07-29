//Java Program to know whether a number is even or odd

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        System.out.println("enter any number ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if (a%2==0){
            System.out.println("This is even number");

        }
        else {
            System.out.println("This is odd number");

        }
    }

}

