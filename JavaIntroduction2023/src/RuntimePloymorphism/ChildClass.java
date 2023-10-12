package RuntimePloymorphism;

public class ChildClass extends ParentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClass obj=new ChildClass();
		obj.car();
		obj.bike();
		obj.cycle();
		obj.truck();
		
	}

	void plane() {
		System.out.println("child class-boing-735");
	}

	void ship() {
		System.out.println("child class- Titanic");
	}

	void truck() {
		System.out.println("child class- volvo");
	}

	void cycle() {
		System.out.println("child class- hero adventure");
	}
	void jet() {
		System.out.println("child class- spacex");
	}

	

}
