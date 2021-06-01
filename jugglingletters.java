import java.util.*;

public class jugglingletters {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numoftimes = in.nextInt();
		for (int z = 0; z < numoftimes; z++) {
			boolean b1 = true;
			HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			int number = in.nextInt();
			for (int i = 0; i < number; i++) {
				String s1 = in.next();
				for (int f = 0; f < s1.length(); f++) {
					Character s = s1.charAt(f);
					if (map.containsKey(s)) {
						int n = map.get(s);
						map.put(s, n + 1);
					} else
						map.put(s, 1);
				}
				// System.out.println(map);
			}
			for (Character s : map.keySet()) {
				int n = map.get(s);
				if (n % number != 0) {
					b1 = false;
					break;
				}
			}
			if (!b1)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
	}
}
