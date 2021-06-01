import java.util.Scanner;

public class WayTooLongWords {
	public static void main(String[] args) {
		Scanner bob = new Scanner(System.in);
		int numberoftimes = bob.nextInt();
		for (int x = 0; x < numberoftimes; x++) {
			String s1 = bob.next();
			if (s1.length() > 10) {
				System.out.print(s1.charAt(0));
				System.out.print(s1.length() - 2);
				System.out.println(s1.charAt(s1.length() - 1));
			} else {
				System.out.println(s1);
			}
		}
	}
}
