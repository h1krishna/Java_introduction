
package Inheritance2;

import Inheritance.Cars;
import Inheritance.HerosList;

public class Animals1 extends HerosList {
  
	String name="pug";
	int price=25000;
	
	
     void show() {
	
	System.out.println("name of pet is:" +name);
	System.out.println("cost of pet is:" +price);
}
     public static void main(String[] args) {
    	 Animals1 an=new Animals1();
    	 an.show();
    	 an.heroNames();
	}
}
