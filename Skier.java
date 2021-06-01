import java.util.Arrays;
import java.util.Scanner;

public class Skier {
	public static void main(String[] args) {
		Scanner bob = new Scanner(System.in);
		int ncount = 0;
		int scount = 0;
		int ecount = 0;
		int wcount = 0;
		int newcount = 0;
		int numberoftimes = bob.nextInt();
		for (int i = 0; i < numberoftimes; i++) {
			int total = 0;
			String s1 = bob.next();
			String[] s2 = new String[numberoftimes];
			s2[newcount] = s1;
			int[][] arr = new int[numberoftimes][4];
			for (int x = 0; x < s1.length(); x++) {
				if (s1.charAt(x) == 'N') {
					ncount++;
					arr[i][0] = ncount;
				}
				if (s1.charAt(x) == 'S') {
					scount++;
					arr[i][1] = scount;
				}
				if (s1.charAt(x) == 'E') {
					ecount++;
					arr[i][2] = ecount;
				}
				if (s1.charAt(x) == 'W') {
					wcount++;
					arr[i][3] = wcount;
				}
			}
			if (ncount - arr[i][0] == 0) {
				total += (arr[i][0] * 5);
			} else if ((ncount - arr[i][0]) != 0) {
				total += (arr[i][0] * 1);
			}
			if (scount - arr[i][1] == 0) {
				total += (arr[i][1] * 5);
			} else if ((scount - arr[i][1]) != 0) {
				total += (arr[i][1]);
			}
			if (ecount - arr[i][2] == 0) {
				total += (arr[i][2] * 5);
			} else if (ecount - arr[i][2] == 0) {
				total += (arr[i][2]);
			}
			if (wcount - arr[i][3] == 0) {
				total += (arr[i][3] * 5);
			} else if (wcount - arr[i][3] != 0) {
				total += (arr[i][3]);
			}
			System.out.println(total);
		}
	}
}
