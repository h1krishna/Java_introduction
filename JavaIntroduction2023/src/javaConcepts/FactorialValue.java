package javaConcepts;

import java.util.Scanner;

public class FactorialValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Number");
		int num = sc.nextInt();
		int j = 1;
		for (int i = 1; i <= num; i++) {

			j = j * i;

		}
		System.out.println(j);
	}
}
