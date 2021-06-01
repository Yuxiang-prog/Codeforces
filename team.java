import java.util.Scanner;

public class team {
	public static boolean checker(int n1, int n2, int n3) {
		int count = 0;
		boolean f4 = false;
		if (n1 == 1) {
			count++;
		}
		if (n2 == 1) {
			count++;
		}
		if (n3 == 1) {
			count++;
		}
		if (count >= 2) {
			f4 = true;
		}
		return f4;
	}

	public static void main(String[] args) {
		Scanner bob = new Scanner(System.in);
		int count = 0;
		int length = bob.nextInt();
		boolean[] arr = new boolean[length];
		for (int i = 0; i < length; i++) {
			int n1 = bob.nextInt();
			int n2 = bob.nextInt();
			int n3 = bob.nextInt();
			arr[i] = checker(n1, n2, n3);
		}
		for (int i = 0; i < length; i++) {
			if (arr[i]) {
				count++;
			}
		}
		System.out.println(count);
	}
}
