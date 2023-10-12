package Inheritance;



public class Cars  {
	String carname;
	int price;
	int milage;
	char rating;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars c = new Cars();

		c.setdata("baleno", 8000000, 25, '3');
		c.display();
		
		

	}

	void setdata(String name, int amount, int average, char starrating) {

		carname = name;
		price = amount;
		milage = average;
		rating = starrating;
	}

	void display() {

		System.out.println(carname);
		System.out.println(price);
		System.out.println(milage);
		System.out.println(rating);
	}
}
