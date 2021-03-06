import java.io.*;
import java.util.*;

public class Main2178 {
	static int n, m;
	static int map[][];
	static boolean[][] visit;
	static int[] dx = { 1, 0, 0, -1 };
	static int[] dy = { 0, -1, 1, 0 };
	static int cnt = 1;

	static void bfs() {
		Queue<Integer> qx = new LinkedList<Integer>();
		Queue<Integer> qy = new LinkedList<Integer>();
		qx.offer(0);
		qy.offer(0);
		visit[0][0] = true;
		while (!qx.isEmpty() && !qy.isEmpty()) {
			int x = qx.poll();
			int y = qy.poll();
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
					if (visit[nx][ny] == false && map[nx][ny] == 1) {
						cnt++;
						qx.offer(nx);
						qy.offer(ny);
						visit[nx][ny] = true;
						map[nx][ny] = map[x][y] + 1;
					}
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		map = new int[n][m];
		visit = new boolean[n][m];

		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			String[] sr = s.split("");
			for (int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(sr[j]);
			}
		}
		for (int i = 0; i < n; i++) {
			Arrays.fill(visit[i], false);
		}
		bfs();
		System.out.println(map[n - 1][m - 1]);

	}
}
