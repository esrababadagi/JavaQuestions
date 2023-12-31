package javaquestions;

import java.util.ArrayList;
import java.util.List;

public class CheckUniqueElementInList {


    public static void main(String[] args) {

        //Check if all elements are unique in an integer List by using loops.

        List<Integer> myList22 = new ArrayList<>();
        myList22.add(10);
        myList22.add(31);
        myList22.add(15);
        myList22.add(7);
        myList22.add(12);
        myList22.add(23);

        int counter = 0;
        for (int w : myList22) {
            for (int k : myList22) {
                if (w == k) {
                    counter++;
                }
            }
        }

        if (counter == myList22.size()) {
            System.out.println("All elements are unique");
        } else {
            System.out.println("There are some repeated elements");
        }
    }
}
