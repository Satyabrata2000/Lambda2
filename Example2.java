package Lambda2;

import java.util.ArrayList;
import java.util.function.Consumer;

//Use Java's Consumer interface to store a lambda expression in a variable
public class Example2 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(1);
        Consumer<Integer> method = (n) -> {
            System.out.println(n);
        };
        numbers.forEach(method);
    }
}
