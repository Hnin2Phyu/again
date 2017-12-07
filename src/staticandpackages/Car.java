package staticandpackages;

public class Car {
    public static int number;
    private static String colour;
    private int capacity;


    public static void main(String[] args) {
           System.out.println(number);
           
           Car c = new Car();
           System.out.println(c.capacity);
    }
}
