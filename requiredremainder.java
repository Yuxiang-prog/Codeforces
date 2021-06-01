import java.util.Scanner;

public class requiredremainder {
	public static void main(String[] args) {
		Scanner bob = new Scanner(System.in);
		int numberoftimes = bob.nextInt();
		for (int z = 0; z < numberoftimes; z++) {
			int divisor = bob.nextInt();
			int remainder = bob.nextInt();
			long maximum = bob.nextLong();
			if (maximum - maximum % divisor + remainder <= maximum) {
				System.out.println(maximum - maximum % divisor + remainder);
			} else {
				System.out.println(maximum - maximum % divisor - (divisor - remainder));
			}
		}
	}
}
