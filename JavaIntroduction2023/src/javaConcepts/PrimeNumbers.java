package javaConcepts;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			int divcount = 0;
			for (int j = 1; j <= i; j++) {

				if (i % j == 0) {

					divcount++;

				}

			}

			if (divcount == 2) {
				System.out.println(i);
			}

		}

	}

}
