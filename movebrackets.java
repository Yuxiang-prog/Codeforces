import java.util.Scanner;
import java.util.Arrays;

public class movebrackets {
	public static void main(String[] args) {
		Scanner bob = new Scanner(System.in);
		String c1 = "(";
		String c2 = ")";
		int numberoftimes = bob.nextInt();
		for (int z = 0; z < numberoftimes; z++) {
			int length = bob.nextInt();
			bob.nextLine();
			String[] arr = bob.nextLine().split("");
			int count = 0;
			for (int i = 0; i < length; i++) {
				for (int s = i + 1; s < length; s++) {
					String s1 = arr[i] + arr[s];
					if (s1.equals("()")) {
						arr[i] = " ";
						arr[s] = " ";
					}
				}
			}
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != " ") {
					count++;
				}
			}
			System.out.println(count / 2);
		}
	}
}
