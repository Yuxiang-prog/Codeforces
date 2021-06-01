import java.util.Scanner;
import java.util.Arrays;

public class signflipping {
	public static int[] checker(int[] arr) {
		int countg = 0;
		int countl = 0;
		int[] newarr = new int[2];
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				break;
			}
			if ((arr[i + 1]) - arr[i] >= 0) {
				countg++;
			}
			if ((arr[i + 1]) - arr[i] <= 0) {
				countl++;
			}
		}
		newarr[0] = countg;
		newarr[1] = countl;
		return newarr;
	}

	public static void main(String[] args) {
		Scanner bob = new Scanner(System.in);
		int numberoftimes = bob.nextInt();
		for (int s = 0; s < numberoftimes; s++) {
			int length = bob.nextInt();
			;
			int[] arr = new int[length];
			bob.nextLine();
			for (int i = 0; i < length; i++) {
				arr[i] = bob.nextInt();
			}
			int greatless = ((length - 1) / 2);
			int countg = 0;
			int countl = 0;
			int[] values = checker(arr);
			countg = values[0];
			countl = values[1];
			if (countg < greatless) {
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] < 0) {
						int temp1 = countg;
						int temp = arr[i];
						arr[i] = Math.abs(arr[i]);
						values = checker(arr);
						countg = values[0];
						countl = values[1];
						if (countg >= greatless && countl >= greatless) {
							break;
						}
						if (countg <= temp1) {
							arr[i] = temp;
						}
					}
					if (arr[i] > 0) {
						int temp1 = countg;
						int temp = arr[i];
						arr[i] = (arr[i] * -1);
						values = checker(arr);
						countg = values[0];
						countl = values[1];
						if (countg >= greatless && countl >= greatless) {
							break;
						}
						if (countg <= temp1) {
							arr[i] = temp;
						}
					}
				}
			}
			if (countl < greatless) {
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] < 0) {
						int temp1 = countl;
						int temp = arr[i];
						arr[i] = Math.abs(arr[i]);
						values = checker(arr);
						countg = values[0];
						countl = values[1];
						if (countg >= greatless && countl >= greatless) {
							break;
						}
						if (countl <= temp1) {
							arr[i] = temp;
						}
					}
					if (arr[i] > 0) {
						int temp1 = countl;
						int temp = arr[i];
						arr[i] = (arr[i] * -1);
						values = checker(arr);
						countg = values[0];
						countl = values[1];
						if (countg >= greatless && countl >= greatless) {
							break;
						}
						if (countl <= temp1) {
							arr[i] = temp;
						}
					}
				}
			}
			if (countg >= greatless && countl >= greatless) {
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
			}
			System.out.println();
		}
	}
}
