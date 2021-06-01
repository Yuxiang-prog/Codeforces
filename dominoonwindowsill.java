import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class dominoonwindowsill {
	public static void main(String args[]) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int t = Integer.parseInt(in.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			int n = Integer.parseInt(st.nextToken());
			int k1 = Integer.parseInt(st.nextToken());
			int k2 = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(in.readLine());
			int w = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int max_w = Math.min(k1, k2) + Math.abs(k1 - k2) / 2;
			int max_b = n - Math.max(k1, k2) + Math.abs(k1 - k2) / 2;
			if (w <= max_w && b <= max_b)
				out.append("YES" + "\n");
			else
				out.append("NO" + "\n");
		}
		out.flush();
		out.close();
	}
}