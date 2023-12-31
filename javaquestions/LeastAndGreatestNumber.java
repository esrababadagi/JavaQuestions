package javaquestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeastAndGreatestNumber {

    public static void main(String[] args) {

        //Find the sum of the least and the greatest price given in a String list
        //Example: List<String> myList = new List<String>{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.70

        List<String> prices2 = new ArrayList<>();
        prices2.add("$12.99");
        prices2.add("$8.25");
        prices2.add("$23.60");
        prices2.add("$54.45");

        List<Double> pricesDouble = new ArrayList<>();

        for (String w : prices2) {
            Double price2 = Double.valueOf(w.replace("$", ""));
            pricesDouble.add(price2);
        }
        Collections.sort(pricesDouble);

        double sum22 = pricesDouble.get(0) + pricesDouble.get(pricesDouble.size() - 1);
        System.out.println(sum22);

    }
}
