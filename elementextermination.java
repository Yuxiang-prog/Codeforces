import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class elementextermination {
	public static boolean removeElement(List<Integer> arrayList, int i, int n) {
		boolean n1 = true;
		if (n == arrayList.size()) {
			n1 = false;
		} else {
			if (arrayList.get(n) > arrayList.get(i)) {
				arrayList.remove(i);
			}
		}
		if (arrayList.size() == 2 && (!(removeElement(arrayList, i, n)))) {
			return false;
		}
		return n1;
	}

	public static void main(String[] args) {
		Scanner bob = new Scanner(System.in);
		int numberofcases = bob.nextInt();
		for (int z = 0; z < numberofcases; z++) {
			int length = bob.nextInt();
			boolean n1 = true;
			List<Integer> arrayList = new ArrayList<Integer>();
			for (int i = 0; i < length; i++) {
				arrayList.add(bob.nextInt());
			}
			for (int i = 0; i < arrayList.size(); i++) {
				while (arrayList.size() != 0) {
					removeElement(arrayList, i, i + 1);
					if (!(removeElement(arrayList, i, i + 1)) && arrayList.size() != 0) {
						n1 = false;
						break;
					}
				}
			}
			if (n1) {
				System.out.println("YES");
			}
			if (!(n1)) {
				System.out.println("NO");
			}
		}
	}
}
