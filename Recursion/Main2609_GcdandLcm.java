import java.io.*;
import java.util.*;

public class Main2609 {
	static public int Euclid(int x, int y) {
		if(y==0)
			return x;
		else
			return Euclid(y, x%y);
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		int gcd = Euclid(n1, n2);
		int lcm = gcd* (n1/gcd) * (n2/gcd);
		sb.append(gcd).append("\n").append(lcm);
		System.out.println(sb);
		
		
	}
}
