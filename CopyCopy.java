import java.util.Arrays;
import java.util.Scanner;

public class CopyCopy {
	public static int removeDuplicateElements(int arr[], int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n - 1];
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		return j;
	}

	public static void main(String[] args) {
		Scanner bob = new Scanner(System.in);
		int numberoftimes = bob.nextInt();
		for (int x = 0; x < numberoftimes; x++) {
			int count = 0;
			int[] arr = new int[bob.nextInt()];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = bob.nextInt();
			}
			Arrays.sort(arr);
			int length = arr.length;
			length = removeDuplicateElements(arr, length);
			System.out.println(length);
		}
	}
}
