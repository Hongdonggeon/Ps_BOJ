import java.io.*;
import java.util.*;

public class Main11724 {
	static int n, m;
	static int map[][];
	static boolean visit[];
	static int cnt;
	
	static void dfs(int index) {
		visit[index]=true;
		for (int i = 1; i < n+1; i++) {
			if(visit[i]== false && map[index][i] ==1)
				dfs(i);
		}
	}
	

public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		map = new int[n+1][n+1];
		visit = new boolean[n+1];
		for (int i = 0; i < n+1; i++) {
			Arrays.fill(map[i], 0);
		}
		Arrays.fill(visit, false);
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int s1 = Integer.parseInt(st.nextToken());
			int s2 = Integer.parseInt(st.nextToken());
			map[s1][s2]=1;
			map[s2][s1]=1;
		}
		

		for (int i = 1; i < n+1; i++) {
			if(visit[i]==false) {
			dfs(i);
			cnt++;
			}
			}
		System.out.println(cnt);
		
	}
}
