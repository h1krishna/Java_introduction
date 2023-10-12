package javaConcepts;

public class TaskToPrintMangos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 50;
		for (int i = 1; i <= num; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Mangos and Oranges");

			}

			else if (i % 3 == 0) {
				System.out.println("MANGOS");
			} else if (i % 5 == 0) {
				System.out.println("ORANGES");

			} else {
				System.out.println(i);
			}

		}

	}
}