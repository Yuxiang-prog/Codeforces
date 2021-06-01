import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class uniquebidauction {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int z = 0; z < t; z++) {
			int n = in.nextInt();
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			for (int i = 0; i < n; i++) {
				int num = in.nextInt();
				if (map.containsKey(num)) {
					map.put(num, 0);
				} else
					map.put(num, i + 1);
			}
			Iterator<Integer> iterator = map.keySet().iterator();
			while (iterator.hasNext()) {
				int num = iterator.next();
				if (map.get(num) == 0) {
					iterator.remove();
				}
			}
			if (map.isEmpty()) {
				System.out.println(-1);
			} else {
				for (int i : map.keySet()) {
					System.out.println(map.get(i));
					break;
				}
			}
		}
	}
}
