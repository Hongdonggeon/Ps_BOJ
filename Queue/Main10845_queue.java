import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10845 {
	static int[] que;
	static int size = 0;
	static int front = 0;
	static int rear = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		que = new int[num];
		int i = 0;
		int index=0;
		while (i < num) {
			String s = br.readLine();
			
			if (s.contains("push")) {
				que[index] = Integer.parseInt(s.substring(5));
				size++;
				rear++;
				index++;
			}

			else if ("pop".equals(s)) {
				if (size == 0)
					System.out.println(-1);
				else {
					System.out.println(que[front]);
					front++;
					size--;
				}
			} 
			else if ("size".equals(s))
				System.out.println(size);
			else if ("empty".equals(s)) {
				if (size == 0)
					System.out.println(1);
				else
					System.out.println(0);
			} else if ("front".equals(s)) {
				if (size==0)
					System.out.println(-1);
				else
					System.out.println(que[front]);
			} else if ("back".equals(s)) {
				if (size==0)
					System.out.println(-1);
				else
					System.out.println(que[rear-1]);
			}
			i++;
		}

	}
}
