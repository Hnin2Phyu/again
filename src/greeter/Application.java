package greeter;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Application {

    private int a = 1;
    private int b = 2;
    private int y;

    public Application(int x) {
        this.a = x;
    }

    public Application() {
        this(8);
    }

    public void greet() {
        System.out.println("Hello World!");
    }

    public void greet(int x) {
        // y = y + 1;
        System.out.println("Before: " + x);
        x = 5;
        System.out.println("After: " + x);
    }

    public void greet(Car x) {
        System.out.println("Before: " + x);
        x.setColour("purple");
        x = new Car();
        System.out.println(x.getColour());
        x.setColour("Red");
        System.out.println("After: " + x);
        System.out.println(x.getColour());
    }

    public void finalize() {
    }

    public static String[] extendArraySize(String[] names) {
        String newNames[] = new String[10];
        for (int i = 0; i < names.length; i++) {
            newNames[i] = names[i];
        }
        return newNames;
    }

    public static void main(String[] args) {

        // -- Classes & Instances --//
        Application app = new Application();

        System.out.println("Hello SA!");
        System.out.println();
        System.out.println("---- Output -----");
        app.greet();
        System.out.println(app.a + app.b);
        System.out.println('\u0040'); // http://www.ascii-code.com/

        int k = 10;
        app.greet(k);
        System.out.println("Outside: " + k);

        Car j = new Car();
        System.out.println(j.getColour());
        app.greet(j);
        System.out.println("Outside: " + j);
        System.out.println("Outside: " + j.getColour());

        System.gc();

        // -- Language Basics --//
        float f = 2.331312f;
        double d = 2.323232;

        char c = 'a';
        char cc = '\u00AE'; // http://www.ascii-code.com/
        System.out.println(cc);

        long l = 1113;
        byte p = (byte) l;
        System.out.println(p);

        Integer i1 = new Integer(43);
        Integer i2 = 43;
        Integer i3 = k;

        System.out.println("Compare string with equals() and ==");
        String s1 = "I m string";
        String s2 = "I m string";
        String s211 = new String("I m string");
        String s212 = new String("I m string");
        System.out.println(s1.length());
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        System.out.println(s211.equals(s212));
        System.out.println(s211 == s212);
        
        System.out.println("Check empty string with equals()");
        String s11 = "";
        String s21 = null;
        System.out.println(("".equals(s11)));
        System.out.println(("".equals(s21)));

        String num1 = "123";
        String num2 = "321";
        System.out.println(num1 + num2);
        System.out.println(Integer.parseInt(num1) + Integer.parseInt(num2));

        String entry1 = "Chong,23,Student,";
        StringTokenizer st = new StringTokenizer(entry1, ",");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        String[] name = {"A", "B", "C"};

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }

        for (String s : name) {
            System.out.println(s);
        }

        name = Arrays.copyOf(name, 15);
        // name = extendArraySize(name);
        for (String s : name) {
            System.out.println(s);
        }

        int x = 5;
        int y = 12;
        System.out.println((x > y) ? x + 1 : y + 1);

        for (String s : args) {
            System.out.println(s);
        }
    }
}

class Car {
    private int x = 1;
    private String colour = "green";

    public void setColour(String c) {
        this.colour = c;
    }

    public String getColour() {
        return this.colour;
    }
}