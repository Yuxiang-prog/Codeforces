import java.util.Scanner;

public class nextround {
	public static void main(String[] args) {
		Scanner bob = new Scanner(System.in);
		int length = bob.nextInt();
		int position = bob.nextInt();
		bob.nextLine();
		String[] fakearr = bob.nextLine().split(" ");
		int[] arr = new int[length];
		int count = 0;
		for (int i = 0; i < fakearr.length; i++) {
			arr[i] = Integer.parseInt(fakearr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= arr[position - 1] && arr[i] > 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
