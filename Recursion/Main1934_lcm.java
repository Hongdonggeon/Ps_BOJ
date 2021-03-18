import java.util.*;
import java.io.*;

public class Main1934 {
	static public int euclid(int x, int y) {
		if (y == 0)
			return x;
		else
			return euclid(y, x % y);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int r = Integer.parseInt(br.readLine());
		while (r-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			int max = n1>n2 ? n1:n2;
			int min = n1>n2 ? n2: n1;
			int gcd = euclid(max, min);
			if(min==1)
				sb.append(max).append("\n");
			else {
				int lcm = gcd * (max/gcd) * (min/gcd);
				sb.append(lcm).append("\n");
			}
			
		}
		System.out.println(sb);
	}
}
