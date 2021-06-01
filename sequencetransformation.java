import java.util.HashMap;
import java.util.Scanner;

public class sequencetransformation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int z = 0; z < t; z++) {
			int n = in.nextInt();
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			for (int i = 0; i < n; i++) {
				int num = in.nextInt();
				if (map.containsKey(num))
					map.put(num, map.get(num) + 1);
				else
					map.put(num, 1);
			}
			if (map.size() == 1)
				System.out.println(0);
			if (checker(map))
				System.out.println(1);
		}
	}

	static boolean checker(HashMap<Integer, Integer> map) {
		boolean n1 = true;
		for (int i : map.values()) {
			if (i != 1)
				n1 = false;
		}
		return n1;
	}
}
