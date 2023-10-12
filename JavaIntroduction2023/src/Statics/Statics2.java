package Statics;

public class Statics2 {
	
	 static void car() {
		System.out.println("tata indica");
	}
 void bike() {
	 System.out.println("pulsar");
	 
 }
 void animal() {
	 bike();
	 car();
	 }
 public static void main(String[] args) {
	 Statics2 s=new Statics2();
	 s.animal();
}
}
