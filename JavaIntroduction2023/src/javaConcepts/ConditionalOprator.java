package javaConcepts;

public class ConditionalOprator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// conditional AND,OR
		int x = 75; 
		int y = 150;
		int z = 200;
		System.out.println(x > y && y < z && z > x); //x>y is false
		System.out.println(x < y && y > z && z > x); // y>x is false
		System.out.println(x < y && y < z && z > x); 
		System.out.println(x < y || y > z || z < x);  //x<y is true
		System.out.println((x!=y)?400:500);
		y=(x==75)?150:200;
		z=(y==200)?150:200;
		System.out.println("value of y is :" +y);
		System.out.println("value of z is :" +z); 
	
	}

}
