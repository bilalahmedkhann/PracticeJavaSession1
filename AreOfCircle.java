//Java program to know the area of circle

import java.util.Scanner;

public class AreOfCircle {
    public static void main(String[] args) {
        System.out.println("Enter the radius of the circle: ");
        Scanner s = new Scanner(System.in);
        double radius = s.nextDouble();
        System.out.println("Area of circle having radius "+ radius+" is \n"+(Math.PI*radius*radius ));

    }
}
