import java.util.*;

public class boatscompetition {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int noc = in.nextInt();
		while (noc > 0) {
			int length = in.nextInt();
			int[] arr = new int[length + 1];
			for (int i = 0; i < length; i++) {
				int x = in.nextInt();
				// System.out.println(arr[x]);
				arr[x]++;
				// System.out.println(arr[x]);
			}
			System.out.println(Arrays.toString(arr));
			int ans = 0;
			for (int s = 2; s <= 2 * length; s++)
			/*
			 * The integer s is the total weight of the team and this for loop is
			 * calculating it The code starts at 2 because the sum can't be 1 or anywhere
			 * between 1 and 2 because the total weight can only be integers
			 */
			{
				int cur = 0;
				for (int i = 1; i < (s + 1) / 2; i++) {
					if (s - i > length)
						continue;
					cur += Math.min(arr[i], arr[s - i]);
				}
				if (s % 2 == 0)
					cur += arr[s / 2] / 2;
				ans = Math.max(ans, cur);
				/*
				 * This code is to calculate the number of even pairs for example if you have a
				 * count of 1 in 6, then two numbers of 3 could make a group
				 */
			}
			noc--;
			System.out.println(ans);
		}
	}
}
