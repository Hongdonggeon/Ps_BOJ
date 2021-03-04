import java.util.Deque;
import java.util.LinkedList;
import java.io.*;

public class Main18258 {
	public static void main(String[] args) throws IOException {
		Deque<Integer> que = new LinkedList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int max = Integer.parseInt(br.readLine());

		while (max-- > 0) {
			String s = br.readLine();

			if (s.contains("push"))
				que.offer(Integer.parseInt(s.substring(5)));

			else if ("pop".equals(s)) {
				if (que.isEmpty())
					sb.append(-1 + "\n");
				else
					sb.append(que.poll() + "\n");
			}

			else if ("size".equals(s))
				sb.append(que.size() + "\n");

			else if ("empty".equals(s)) {
				if (que.isEmpty())
					sb.append(1 + "\n");
				else
					sb.append(0 + "\n");
			}

			else if ("front".equals(s)) {
				if (que.isEmpty())
					sb.append(-1 + "\n");
				else
					sb.append(que.peekFirst() + "\n");
			} else if ("back".equals(s)) {
				if (que.isEmpty())
					sb.append(-1 + "\n");
				else
					sb.append(que.peekLast() + "\n");
			}

		}
		System.out.println(sb);
	}
}
