import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class leastcommonmultiple {
	public static void main(String[] args) {
		Scanner bob = new Scanner(System.in);
		int numberoftimes = bob.nextInt();
		for (int f = 0; f < numberoftimes; f++) {
			int number = bob.nextInt();
			List<Integer> arrayList = new ArrayList<Integer>();
			int lcm = 0;
			for (int i = 1; i < number; i++) {
				int s = number - i;
				if (i + s == number) {
					lcm = (i > s) ? i : s;
					while (true) {
						if (lcm % i == 0 && lcm % s == 0) {
							arrayList.add(lcm);
							break;
						}
						++lcm;
					}
				}
			}
			Collections.sort(arrayList);
			for (int i = 0; i < number; i++) {
				for (int s = 0; s < number; s++) {
					if (i + s == number) {
						lcm = (i > s) ? i : s;
						while (true) {
							if (lcm % i == 0 && lcm % s == 0) {
								if (lcm == arrayList.get(0)) {
									if (i <= s) {
										System.out.print(i + " ");
										System.out.println(s);
									}
								}
								break;
							}
							++lcm;
						}
					}
				}
			}
		}
	}
}
