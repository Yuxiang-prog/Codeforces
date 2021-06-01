import java.util.*;

public class powersequence {
	static long INF = (long) 1e17;

	static long mul(long a, long b) {
		return (INF / a > b ? a * b : INF);
	}

	static long add(long a, long b) {
		return (a + b >= INF ? INF : a + b);
	}

	static long total(long[] arr, long length) {
		long count = 0;
		for (int i = 0; i < length; i++) {
			count += arr[i];
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		long[] arr = new long[length];
		long sum = 0;
		for (int i = 0; i < length; i++) {
			arr[i] = in.nextLong();
		}
		Arrays.sort(arr);
		if (length <= 2)
			System.out.println(arr[0] - 1);
		else {
			sum = total(arr, arr.length) - length;
			for (int x = 1;; ++x) {
				long curPow = 1, curCost = 0;
				for (int i = 0; i < length; i++) {
					curCost = add(curCost, Math.abs(arr[i] - curPow));
					curPow = mul(curPow, x);
				}
				if (curPow == INF || curPow / x > sum + arr[length - 1])
					break;
				sum = Math.min(sum, curCost);
			}
			System.out.println(sum);
		}
		Arrays.sort(arr);
	}
}
