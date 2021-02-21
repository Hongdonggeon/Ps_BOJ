import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Stack;

public class Main1874 {
	public static void main(String[] args) throws IOException {
		Stack<Integer> stk = new java.util.Stack<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		int ar[] = new int[num];

		for (int i = 0; i < num; i++) {
			ar[i] = Integer.parseInt(br.readLine());
		}

		int index = 0;
		int i = 1;
		int number = 1;

		while (true) {

			if (index >= num)
				break;

			if ((!(stk.isEmpty())) && stk.peek() == ar[index]) {
				stk.pop();
				sb.append('-' + "\n");
				++index;
				number--;
			} else if (number > num) {
				sb.delete(0, sb.length());
				sb.append("NO");
				break;
			}

			else {
				stk.push(i);
				sb.append('+' + "\n");
				i++;
				number++;
			}
		}
		System.out.print(sb);
	}
}
