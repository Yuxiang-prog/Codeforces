import java.util.*;

public class prefixflipeasy {
	static ArrayList<Integer> recursion(String num1, String num2, int length) {
		ArrayList<Integer> moves = new ArrayList<Integer>();
		int length2 = length;
		while (num1 != num2) {
			String temp = num1.substring(0, length2);
			moves.add(length2);
			reverse(num1);
			if (num1 == temp) {
				moves.remove(length2);
			}
			length2--;
			if (length2 == 0) {
				length2 = length;
			}
		}
		System.out.println(moves);
		return moves;
	}

	static String reverse(String num1) {
		StringBuilder sb = new StringBuilder();
		char[] arr = num1.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				arr[i] = 1;
			}
			if (arr[i] == 1) {
				arr[i] = 0;
			}
		}
		num1 = arr.toString();
		for (int i = num1.length() - 1; i >= 0; i--) {
			sb.append(num1.charAt(i));
		}
		String s1 = sb.toString();
		return s1;
	}

	public static void main(String[] args) {
		Scanner bob = new Scanner(System.in);
		int numberoftimes = bob.nextInt();
		for (int z = 0; z < numberoftimes; z++) {
			ArrayList<Integer> moves = new ArrayList<Integer>();
			int length = bob.nextInt();
			String num1 = bob.next();
			String num2 = bob.next();
			int count = 0;
			if (num1.compareTo(num2) != 0) {
				moves = recursion(num1, num2, (length - 1));
				System.out.println(moves);
			} else
				System.out.println(count);
		}
	}
}
