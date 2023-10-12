package javaConcepts;

import java.util.Map;

public class OccuranceofString {

	public static <Charater> void main(String[] args, Object Map) {
		// TODO Auto-generated method stub
		String str = "Rangerover";
		int initialLenght = str.length();
		String str1 = str.replace(str, "");
		int finalLengh = str.length();
		System.out.println("Total number of occurnce" + str1 + "" + (finalLengh - initialLenght));

	}

}
