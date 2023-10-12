package ExceptionHandling;

public class Hari_UncheckedExceptions {
	public static void main(String[] args) {

		String s = null;
		int[] x = new int[7];
		// int a = 15 / 0;
		int b = 15 / 3;
		

		try {
			System.out.println(s.length());

		} catch (Exception e) {
			System.out.println(e);
		}

		try {

			x[8] = 6;
		} catch (Exception y) {
			x[5] = 15;
			System.out.println(y);
			System.out.println(x[5]);
		}
		try {
			int a = 15 / 0;
			System.out.println(a);
		} catch (Exception f) {
			System.out.println(f);
			
			System.out.println(b);

		}
		try {
			String str="Hari";
			int num=Integer.parseInt(str);
			System.out.println(num);
			
		}
		catch(Exception g) {
			System.out.println(g);
			System.out.println("Exception is Handled");
		}
		finally {
			System.out.println("Important code");
		}
		String st=new String("bike");
		Object o= (Object)st;
		System.out.println(o);
	}

}
