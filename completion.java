import java.util.Scanner;

public class completion {
	public static void main(String[] args) {
		Scanner bob = new Scanner(System.in);
		int numberoftimes = bob.nextInt();
		for (int f = 0; f < numberoftimes; f++) {
			int length = bob.nextInt();
			int count = 1;
			int total = 0;
			total += count;
			for (int i = 0; i < length; i++) {
				count += 2;
				total += count;
				System.out.print((count) + " ");
				if (total >= 1000) {
					count = 1;
					total = 0;
				}
			}
			System.out.println();
		}
	}
}
