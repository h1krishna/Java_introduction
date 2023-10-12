package javaConcepts;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("PLEASE ENTER A NUMBER OF TABLE");
		int num = sc.nextInt();
		int i = num;
		for (int j = 1; j <= 20; j++) {
			System.out.println(i + "*" + j + "=" + (i * j));
		}

	}

}
