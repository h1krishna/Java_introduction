package Statics;

public class Statics1 {

	void car() {
		
		System.out.println("Lamborgini");
	}
	static void bike(){
		System.out.println("Pulsar");
		

	}
	public static void main(String[] args) {
		bike();
		Statics1 statics1 = new Statics1();
		statics1.car();
	}
}
