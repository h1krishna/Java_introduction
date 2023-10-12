package javaConcepts;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");

		int num = sc.nextInt();
		int temp = 0;

		while (num > 0) {

			temp = num % 10;
			num = num / 10;
			System.out.print(temp);
			
		}

	}

}
