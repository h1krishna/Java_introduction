package javaConcepts;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Harikrishna";
		String s1="";
		int s2 = s.length();
		
		for(int i=s2-1;i>=0;i--) {
			
			s1=s1+s.charAt(i);
		}
System.out.println(s1);
	}

}
