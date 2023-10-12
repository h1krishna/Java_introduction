package javaConcepts;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int year= 2018;
       
       if(year % 4==0 && year % 100!=0 || year % 400==0) {
    	   
    	   System.out.println("the given year is a leap year");
    	   
       }
       else  {
    	   System.out.println("The given year is not a leap year");
       }
	}

}
