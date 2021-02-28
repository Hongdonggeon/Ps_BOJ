import java.util.Stack;
import java.util.*;

public class Main10733 {
	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<Integer>();
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int cnt = 0;
		while (cnt < n) {
			int number = input.nextInt();

			if ((number != 0))
				stk.push(number);

			else {
				if (!(stk.isEmpty()))
					stk.pop();
				}
			cnt++;
		}
		int sum = 0;
		Iterator<Integer> itr = stk.iterator();
		while (itr.hasNext()) {
			sum += itr.next();
		}
		System.out.println(sum);
	}
}
