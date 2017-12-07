package sg.edu.nus.iss;

public class Supervisor extends sg.edu.nus.www.Employee {

    public static void main(String[] args) {
        Supervisor s = new Supervisor();
        s.title = "Supervisor";
        
        System.out.println(s.title);
        System.out.println(s.getOrganisation());
    }

}
