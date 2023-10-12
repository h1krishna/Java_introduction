package Collections;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List li = new ArrayList();
		li.add("Harikrishna");
		li.add(01531);
		li.add("Devatha");
		li.add(2, "ram");
		li.contains("evatha");
		//System.out.println(li);

		List li1 = new ArrayList();
		li1.add("Saikumar");
		li1.add(01531);
		li1.add("Devatha");
		li.set(2, "sairam");

		li.addAll(li1);
		System.out.println(li);
		
		System.out.println(li.get(2));
	}

}
