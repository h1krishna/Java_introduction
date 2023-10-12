package javaConcepts;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "this is going to be adventurous";
		String[] words = str.split(" ");

		//String reverseword = "";
//		for (String w : words) {
//			StringBuilder sb = new StringBuilder(w);
//			sb.reverse();
//			reverseword = reverseword + sb.toString() + " ";
//		}
		String reversestring = "";
		for (String w : words) {
			String reverseword = "";
			for (int i = w.length() - 1; i >= 0; i--) {
				reverseword = reverseword + w.charAt(i);

			}
			reversestring = reversestring + reverseword +" ";
		}
		System.out.println(reversestring);
//	}
//		System.out.println(reverseword);
//	}
	}
}
