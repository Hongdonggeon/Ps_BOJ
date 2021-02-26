import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Stack;

public class Main9012  {
	public static void main(String[] args) throws IOException {
		Stack<Character> stk = new Stack<Character>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int cnt = 0;
		while (cnt < n) {
			int ptr = 0;
			String str = new String(br.readLine());

			for (int i = 0; i < str.length(); i++) {
				if ('(' == str.charAt(i)) {
					stk.push('(');
					++ptr;
				} else {
					if (')' == str.charAt(i)) {

						if (!(stk.isEmpty()))
							stk.pop();
						--ptr;
					}
				}
			}
			cnt++;
			if (stk.isEmpty() && (ptr >=0))
				System.out.println("YES");
			else
				System.out.println("NO");
			stk.removeAllElements();
		}

	}
}
