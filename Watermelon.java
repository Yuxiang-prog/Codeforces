import java.util.Scanner;

public class Watermelon {
	public static void main(String[] args) {
		Scanner bob = new Scanner(System.in);
		int n1 = bob.nextInt();
		if (n1 % 2 == 0 && n1 > 2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
