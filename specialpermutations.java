import java.util.Scanner;

public class specialpermutations {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int z = 0; z < t; z++) {
			int count = 1;
			int n = in.nextInt();
			int[] arr = new int[n + 1];
			if (n % 2 == 0)
				for (int i = n; i > 0; i--)
					System.out.print(i + " ");
			else {
				for (int i = n; i > 0; i--) {
					arr[count] = i;
					if (count == i) {
						int temp = arr[count - 1];
						arr[count - 1] = arr[count];
						arr[count] = temp;
					}
					count++;
				}
				arrayPrinter(arr);
			}
			System.out.println();
		}
	}

	static void arrayPrinter(int[] arr) {
		for (int i = 1; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}
