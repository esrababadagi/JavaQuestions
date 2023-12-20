import java.util.Scanner;

public class Q1_FindDuplicate {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine().toLowerCase();
        System.out.println("Enter a character");
        char ch = input.next().toLowerCase().charAt(0);

        int count =0;

        int i = 0;
        while (i<name.length()){
            if(name.charAt(i)==ch){
                count++;
            }
            i++;
        }
        System.out.println("We have "+count+" times "+ch);
    }
}
