package javaConcepts;

import java.util.Scanner;

public class CountTheWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Enter a String:");// 
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count = 1;

		for (int i = 0; i < str.length() - 1; i++) {

			if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {

				count++;
			}

		}
		System.out.println("Number of words in a string:" + count);

	}

}
