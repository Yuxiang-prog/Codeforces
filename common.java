import java.util.*;

public class common {
	public static void main(String[] args) {
		Scanner bob = new Scanner(System.in);
		int numberoftimes = bob.nextInt();
		for (int z = 0; z < numberoftimes; z++) {
			int length = bob.nextInt();
			int[] arr = new int[length];
			int length2 = bob.nextInt();
			int[] arr2 = new int[length2];
			boolean n1 = false;
			for (int i = 0; i < arr.length; i++) {
				arr[i] = bob.nextInt();
			}
			for (int i = 0; i < arr2.length; i++) {
				arr2[i] = bob.nextInt();
			}
			// System.out.println(Arrays.toString(arr2));
			for (int i : arr) {
				for (int x : arr2) {
					if (i == x) {
						System.out.println("YES");
						System.out.println(1 + " " + i);
						n1 = true;
						break;
					}
				}
				if (n1) {
					break;
				}
			}
			if (!n1) {
				System.out.println("NO");
			}
		}
	}
}
