import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Stack;

public class Main4949 {
	static Stack<Character> stk = new Stack<Character>();

	public static boolean check(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '[' || s.charAt(i) == '(')
				stk.push(s.charAt(i));

			else if (s.charAt(i) == ')') {
				if (stk.isEmpty() || stk.peek() != '(')
					return false;
				else
					stk.pop();
			}

			else if (s.charAt(i) == ']') {
				if (stk.isEmpty() || stk.peek() != '[')
					return false;
				else
					stk.pop();
			}

		}
		return stk.isEmpty();

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String s = br.readLine();
			stk.clear();
			if (s.equals(".")) 
				break;
			
			if (check(s))
				System.out.println("yes");

			else
				System.out.println("no");

		}
	}
}
