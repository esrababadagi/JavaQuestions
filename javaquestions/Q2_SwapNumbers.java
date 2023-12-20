package javaquestions;

import java.util.Scanner;

public class Q2_SwapNumbers {

    public static void main(String[] args) {

    //Type a code to swap two integers.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number");
        int a = input.nextInt();
        System.out.println("Please enter second number");
        int b = input.nextInt();
        System.out.println("Before swapping=> first number: "+a +" and second number "+b);
        int c = 0;
        c=a;
        a=b;
        b=c;
        System.out.println("After swapping=> first number: "+a +" and second number "+b);
    }
}
