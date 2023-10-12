package Inheritance;

public class Harikrishna implements Interface1, Interface2 {

	@Override
	public void search_functionality() {
		// TODO Auto-generated method stub
		System.out.println("Product added t o cart succesfully");
	}

	@Override
	public void addto_cart() {
		// TODO Auto-generated method stub
		System.out.println("Item added to cart");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("your item ordered successfully");
	}

	@Override
	public void family_details() {
		// TODO Auto-generated method stub
		System.out.println("Harikrishna");
	}

	@Override
	public void employee_details() {
		// TODO Auto-generated method stub
		System.out.println("Emp id 01531");
	}

	public static void main(String[] args) {
		Harikrishna hk = new Harikrishna();
		hk.addto_cart();
		hk.employee_details();
		hk.search_functionality();
		hk.family_details();
		hk.display();
	}

}
