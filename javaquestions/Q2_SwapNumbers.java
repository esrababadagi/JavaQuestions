package javaquestions;

import java.util.Scanner;

public class Q2_SwapNumbers {

    public static void main(String[] args) {

    //Type a code to swap two integers.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number");
        double a = input.nextDouble();
        System.out.println("Please enter second number");
        double b = input.nextDouble();
        System.out.println("Before swapping=> first number: "+a +" and second number "+b);
        double c = 0;
        c=a;
        a=b;
        b=c;
        System.out.println("After swapping=> first number: "+a +" and second number "+b);
    }
}
