import java.util.Scanner;

public class multiplyby2divideby6 {
	public static void main(String[] args) {
		Scanner bob = new Scanner(System.in);
		int numberoftimes = bob.nextInt();
		for (int z = 0; z < numberoftimes; z++) {
			long number = bob.nextLong();
			boolean n1 = true;
			int count = 0;
			while (number != 1) {
				if (number % 6 == 0) {
					number = (number / 6);
					count++;
				}
				if (number % 6 != 0) {
					if ((number * 2) % 6 == 0) {
						number = (number * 2);
						count++;
						number = (number / 6);
						count++;
					}
					if (number == 1) {
						break;
					}
					if ((number * 2) % 6 != 0) {
						n1 = false;
						break;
					}
				}
				if (number == 1) {
					break;
				}
			}
			if (n1) {
				System.out.println(count);
			}
			if (!(n1)) {
				System.out.println("-1");
			}
		}
	}
}
