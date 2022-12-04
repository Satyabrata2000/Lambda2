package Lambda2;

import java.util.ArrayList;

//Use a lambda expression in the ArrayList's forEach() method to print every item in the list
public class Example1 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
            numbers.add(4);
            numbers.add(1);
            numbers.add(5);
            numbers.forEach( (n) -> {
                System.out.println(n);
            });

    }
}
