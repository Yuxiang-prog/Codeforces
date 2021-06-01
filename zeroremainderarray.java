import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class zeroremainderarray {
	public static boolean checker(int[] arr) {
		boolean n1 = true;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 != 0) {
				n1 = false;
			}
		}
		return n1;
	}

	public static void main(String[] args) {
		Scanner bob = new Scanner(System.in);
		int numberofcases = bob.nextInt();
		for (int z = 0; z < numberofcases; z++) {
			int x = 0;
			int length = bob.nextInt();
			int divisor = bob.nextInt();
			List<Integer> arr = new ArrayList<Integer>();
			int f = 0;
			int count = 0;
			for (int i = 0; i < length; i++) {
				arr.add(bob.nextInt());
			}
			for (int i = 0; i < arr.size(); i++) {
				if (arr.get(i) % 3 == 0) {
					arr.remove(arr.get(i));
				}
			}
			for (int i = 0; i < arr.size(); i++) {
				if ((arr.get(i) + x) % 3 == 0) {
					arr.add(i, (arr.get(i) + x));
					x++;
					i = 0;
					count++;
					// System.out.println(arr);
				} else {
					x++;
					count++;
					// System.out.println(arr);
				}
			}
			System.out.println(arr);
			System.out.println(count);
		}
	}
}
