import java.io.*;
import java.util.*;

public class Main2667 {
	static int n;
	static int map[][];
	static boolean visit[][];
	static int danji;
	static int dx[] = {-1,0,0,1};
	static int dy[] = {0,-1,1,0};
	static ArrayList<Integer> ar = new ArrayList<Integer>();
	
	
	static void dfs(int idx1, int idx2) {
		visit[idx1][idx2] = true;
		for (int i = 0; i < 4; i++) {
			int nx = dx[i]+idx1;
			int ny = dy[i]+idx2;
			
			if(nx>=0 && ny>=0 &&nx<n&&ny<n) {
				if(visit[nx][ny]==false && map[nx][ny]==1) {
					danji++;
					dfs(nx,ny);
				}
			}
		}
			
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		map = new int[n][n];
		visit = new boolean[n][n];
		
		for (int i = 0; i <n; i++) {
			Arrays.fill(visit[i], false);
		}
		
		for (int i = 0; i < n; i++) {
			String st = br.readLine();
			for (int j = 0; j < n; j++) {
				String[] s = st.split("");
				map[i][j] = Integer.parseInt(s[j]);
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(visit[i][j]==false && map[i][j]==1) {
					danji =1;
					dfs(i,j);
					ar.add(danji);
				}
			}
		}
		Collections.sort(ar);
		System.out.println(ar.size());
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		

	

	}
}
