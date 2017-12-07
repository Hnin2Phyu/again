package staticandpackages;

import static java.lang.Math.*;
import java.util.Arrays;
import java.util.Vector;

import sg.edu.nus.www.Employee;
import sg.edu.nus.www.Manager;

public class AllAboutStatic {
    private double radius;
    private static double PI = 3.141;
    private static int[] values = new int[10];
    private static Car c = new Car();

    public AllAboutStatic() {
        this.radius = 100.0 * Math.random();
    }

    static {
        System.out.println("Running initialization block.");
        for (int i = 0; i < values.length; i++) {
            values[i] = (int) (100.0 * Math.random());
        }
    }

    public static Manager[] extractManagers(Employee[] emp) {
        Vector v = new Vector();
        for (int i = 0; i < emp.length; i++) {
            if (emp[i] instanceof Manager) {
                v.add(emp[i]);
            }
        }
        Manager[] result = new Manager[v.size()];
        v.toArray(result);

        return (result);
    }

    public static void setValue(double x) {
        // this.radius = x; // ERROR!
        PI = x;
    }

    public static void main(String[] args) {

//        StringBuffer luckynum = new StringBuffer();
//        for (int i = 0; i < values.length; i++) {
//            luckynum.append(values[i] + ",");
//        }
//        System.out.println(luckynum.toString());

        System.out.println();
        AllAboutStatic st1 = new AllAboutStatic();
        AllAboutStatic st2 = new AllAboutStatic();
//        System.out.println(st1.c);
//        System.out.println(st2.c);
        System.out.println(st1.values[0]);
        System.out.println(st2.values[0]);
//        System.out.println(st1.radius);
//        System.out.println(st2.radius);

//        System.out.println();
//        Employee[] emp = new Employee[3];
//        emp[0] = new Manager();
//        emp[1] = new Employee();
//        emp[2] = new Employee();
//        Manager[] mgr = AllAboutStatic.extractManagers(emp);
//        for (int i = 0; i < mgr.length; i++) {
//            System.out.println(mgr[i].toString() + i);
//        }

    }

}
