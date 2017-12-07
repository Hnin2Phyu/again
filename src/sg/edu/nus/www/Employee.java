package sg.edu.nus.www;

public class Employee {
    private float salary;
    protected String title = "Staff";
    String organisation = "NUS";

    public String getOrganisation() {
        return organisation;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
