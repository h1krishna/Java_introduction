package MethodOverriding;

public class Chandrayan3 {
	void missionGoal() {
		System.out.println("Exploring the Moon's south polar region ");
		System.out.println("Lunar landing on the Moon");
	}

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		Chandrayan3 c3 = new Chandrayan3();
		c3.missionGoal();
		Chandrayan1 c1= new Chandrayan1();
		c1.missionGoal();
		Chandrayan2 c2 = new Chandrayan2();
		Thread.sleep(3000);
		c2.missionGoal();
		
		
	}

}
