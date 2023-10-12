package javaConcepts;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter marks:");
		int marks = sc.nextInt();
		if (marks < 35) {

			System.out.println("Result :'Fail'");

		} else if (marks >= 35 && marks <= 40) {

			System.out.println("Result :'PASS'");

		}

		else if (marks >= 40 && marks <= 60) {

			System.out.println("Grade is : ' C '");

		}

		else if (marks >= 60 && marks <= 75) {
			System.out.println("Grade is : ' B '");
		}
		else if (marks >= 75 && marks <= 85) {
			
			System.out.println("Grade is : ' A '");

		}

		else if (marks >= 85 && marks <= 100) {
			System.out.println("Grade is : ' A+ '");

		}

		else if (marks >= 100) {
			System.out.println("Invalid Student");

		}

	}
}
