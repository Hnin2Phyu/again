package staticandpackages;

public class TestPerson {

	public static void main(String[] args) {
		Person p1 = new Person(55.0f, 1.66f);
		Person p2 = new Person(71.0f, 1.71f);
		
		System.out.println("p1: " + p1.getBMI());
		System.out.println("p2: " + p2.getBMI());
		
		System.out.println("My BMI: " + Person.getMyBMI(87.0f,1.85f));

	}

}
