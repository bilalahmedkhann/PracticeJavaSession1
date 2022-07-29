//Java Program to know which year is leap year

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        System.out.print("Give any year to know whether it is leap year: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num%4==0 && num%100!=0){
            System.out.println("it is a leap year");

        } else if (num%4==0 || num%400==0) {
            System.out.println("it is a leap year");

        }
        else {
            System.out.println("Not a leap year");

        }
    }
}
