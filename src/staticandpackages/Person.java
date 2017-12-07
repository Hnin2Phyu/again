package staticandpackages;

public class Person {
	public Person(float weight, float height) {
		super();
		this.weight = weight;
		this.height = height;
	}

	private float weight;
	private float height;
	
	public float getBMI() {
		return weight/(height*height);
	}
	
	public static float getMyBMI(float w, float h){
		return w/(h*h);
	}
	



}
