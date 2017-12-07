package sg.edu.nus.www;


public class Manager extends Employee {
    public String toString() {
        return "M";
    }

    public static void main(String[] args) {
        Manager m = new Manager();
        m.organisation = "Yale-NUS";
        m.title = "Manager";
        System.out.println(m.organisation);
        System.out.println(m.title);
    }
    
    //git testing
}
