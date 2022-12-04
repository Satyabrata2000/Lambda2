package Lambda2;

//Create a method which takes a lambda expression as a parameter
public interface Example3 {

    String run(String str);
}
class Main{

    public static void main(String[] args) {

            Example3 exclaim = (s) -> s + "!";
            Example3 ask = (s) -> s + "?";
            printFormatted("Hello", exclaim);
            printFormatted("Hello",  ask);
    }

    public static void printFormatted(String str, Example3 format){
        String result = format.run(str);
        System.out.println(result);
    }
}
