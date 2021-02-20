import java.util.Stack;
import java.util.*;
import java.io.*;

public class Main1406 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringBuilder sb = new StringBuilder(s);
		int r = Integer.parseInt(br.readLine());
		int p = sb.length();
		while (r-- > 0) {
			String op = br.readLine();
			if ("L".equals(op)) {
				if (p == 0)
					return;
				else
					p--;
			}

			else if ("D".equals(op)) {
				if (p == sb.length())
					return;
				else
					p++;
			}

			else if ("B".equals(op)) {
				if (p == 0)
					return;
				else 
					sb.delete(p-1, p);
				
			}

			else if (op.contains("P")) {
				String plus = op.substring(2);
				if (p == 0)
					sb.append(plus, 0, 1);
				else {
					int d = p - 1;
					sb.append(plus, d, d + 1);
				}
			}
		}
		System.out.println(sb);
	}
}
