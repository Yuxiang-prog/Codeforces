import java.util.Arrays;
import java.util.Scanner;

public class SumOfRoundNumbers {
	public static int logicalSize(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				count++;
			}
		}
		return count;
	}

	public static int logicalSize(String[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (Integer.parseInt(arr[i]) != 0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner bob = new Scanner(System.in);
		int numberoftimes = bob.nextInt();
		bob.nextLine();
		for (int n = 0; n < numberoftimes; n++) {
			int count = 1;
			int realcount = 0;
			String s1 = bob.nextLine();
			String[] arr = s1.split("");
			int[] permutations = new int[arr.length];
			for (int i = 0; i < arr.length; i++) {
				int temp = Integer.parseInt(arr[i]);
				if (temp != 0 && Integer.parseInt(arr[i]) != 0) {
					permutations[i] = (int) (temp * Math.pow(10, arr.length - count));
				}
				count++;
			}
			System.out.println(logicalSize(permutations));
			for (int i = 0; i < permutations.length; i++) {
				if (permutations[i] != 0) {
					System.out.printf("%.0f", (double) permutations[i]);
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
