import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class baseball {
	public static void main(String[] args) {
		Scanner bob = new Scanner(System.in);
		int numberoftimes = bob.nextInt();
		for (int f = 0; f < numberoftimes; f++) {
			int t = 0;
			int length = bob.nextInt();
			int[] arr = new int[length];
			for (int i = 0; i < length; i++) {
				arr[i] = bob.nextInt();
			}
			int[] sortedarr = arr.clone();
			Arrays.sort(sortedarr);
			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				if (i != 0) {
					t = i - 1;
				}
				if (arr[i] != sortedarr[i] || arr[t] + 1 != arr[i]) {
					count++;
				}
			}
			if (count % 2 != 0) {
				count++;
			}
			System.out.println(count / 2);
		}
	}
}
