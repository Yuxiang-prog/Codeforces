import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class magicalsticks {
	static int[] toIntArray(List<Integer> list) {
		int[] arraylist = new int[list.size()];
		for (int i = 0; i < arraylist.length; i++) {
			arraylist[i] = list.get(i);
		}
		return arraylist;
	}

	public static int modeint(int[] sequence) {
		int maxValue = 0, maxCount = 0;
		for (int i = 0; i < sequence.length; ++i) {
			int count = 0;
			for (int j = 0; j < sequence.length; ++j) {
				if (sequence[j] == sequence[i])
					++count;
			}
			if (count > maxCount) {
				maxCount = count;
				maxValue = sequence[i];
			}
		}
		return maxValue;
	}

	public static void main(String[] args) {
		Scanner bob = new Scanner(System.in);
		int numberoftimes = bob.nextInt();
		for (int s = 0; s < numberoftimes; s++) {
			int number = bob.nextInt();
			List<Integer> total = new ArrayList<Integer>();
			int count = 0;
			for (int i = 1; i <= number; i++) {
				total.add(i);
			}
			for (int i = 1; i <= number; i++) {
				for (int f = i + 1; f <= number; f++) {
					total.add(i + f);
				}
			}
			int[] array = toIntArray(total);
			for (int i = 0; i < total.size(); i++) {
				if (total.get(i) == modeint(array)) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
