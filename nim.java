import java.util.*;

public class nim {
	public static void main(String[] args) {
		Scanner bob = new Scanner(System.in);
		int numberofcases = bob.nextInt();
		for (int z = 0; z < numberofcases; z++) {
			int length = bob.nextInt();
			int[] arr = new int[length];
			int count = 0;
			int count1 = 0;
			for (int i = 0; i < length; i++) {
				arr[i] = (bob.nextInt());
			}
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != 1) {
					count1++;
					if (count % 2 == 0) {
						System.out.println("First");
						break;
					} else {
						if (count % 2 != 0) {
							System.out.println("Second");
							break;
						}
					}
				}
				if (arr[i] == 1) {
					count++;
				}
			}
			if (count1 == 0) {
				if (arr.length % 2 != 0) {
					System.out.println("First");
				} else {
					if (arr.length % 2 == 0) {
						System.out.println("Second");
					}
				}
			}
		}
	}
}
