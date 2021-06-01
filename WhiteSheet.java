import java.io.*;
import java.util.*;

public class WhiteSheet {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1, y1, x2, y2;
		x1 = in.nextInt();
		y1 = in.nextInt();
		x2 = in.nextInt();
		y2 = in.nextInt();
		Rect a = new Rect(x1, y1, x2, y2);
		x1 = in.nextInt();
		y1 = in.nextInt();
		x2 = in.nextInt();
		y2 = in.nextInt();
		Rect b = new Rect(x1, y1, x2, y2);
		x1 = in.nextInt();
		y1 = in.nextInt();
		x2 = in.nextInt();
		y2 = in.nextInt();
		Rect c = new Rect(x1, y1, x2, y2);
		if ((double) a.area() - (double) intersect(a, b) - (double) intersect(a, c) != 0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

	static int intersect(Rect a, Rect b) {
		// The math.max checks if the truck covers any of the billboard
		int x = Math.max(0, Math.min(a.x2, b.x2) - Math.max(a.x1, b.x1));
		int y = Math.max(0, Math.min(a.y2, b.y2) - Math.max(a.y1, b.y1));
		return x * y;
	}

	static class Rect {
		public int x1, y1, x2, y2;

		public Rect(int x1, int y1, int x2, int y2) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
		}

		public int area() {
			// long area = (y2 - y1) * (x2 - x1);
			return ((y2 - y1) * (x2 - x1));
		}
	}
}
