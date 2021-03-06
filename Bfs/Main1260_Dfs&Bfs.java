import java.util.*;
import java.io.*;

public class Main1260 {
	static int map[][];
	static boolean visit[];

	static void bfs(int s, int n) {
		Queue<Integer> que = new LinkedList<Integer>();
		que.offer(s);
		visit[s] = true;
		while (!que.isEmpty()) {
			int temp = que.poll();
			System.out.print(temp+" ");
			for (int i = 1; i <= n; i++) {
				if (map[temp][i] == 1 && visit[i] == false) {
					que.offer(i);
					visit[i] = true;
				}
			}
		}
	}

	static void dfs(int s, int n) {
		visit[s] = true;
		System.out.print(s + " ");
		for (int i = 1; i < n + 1; i++) {
			if (map[s][i] == 1 && visit[i] == false) {
				dfs(i, n);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		map = new int[n + 1][n + 1];
		visit = new boolean[n + 1];
		for (int i = 0; i < n + 1; i++) {
			Arrays.fill(map[i], 0);
		}
		Arrays.fill(visit, false);

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int s1 = Integer.parseInt(st.nextToken());
			int s2 = Integer.parseInt(st.nextToken());
			map[s1][s2] = 1;
			map[s2][s1] = 1;
		}
		dfs(s,n);
		System.out.println();
		Arrays.fill(visit, false);
		bfs(s,n);
	}
}
