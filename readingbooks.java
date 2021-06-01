import java.util.Scanner;

public class readingbooks {
	public static void main(String[] args) {
		Scanner bob = new Scanner(System.in);
		int length = bob.nextInt();
		int minimum = bob.nextInt();
		int[][] arr = new int[length][3];
		for (int i = 0; i < length; i++) {
			arr[i][0] = bob.nextInt();
			arr[i][1] = bob.nextInt();
			arr[i][2] = bob.nextInt();
		}
	}
}
