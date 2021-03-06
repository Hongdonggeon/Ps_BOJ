import java.io.*;
import java.util.*;

public class Main2606 {
	static int n;
	static int e;
	static int map[][];
	static boolean visit[];
	static int cnt=0;
	
	static void bfs() {
		Queue<Integer> que = new LinkedList<Integer>();
		que.offer(1);
		visit[1]=true;
		while(!que.isEmpty()) {
			int temp=que.poll();
			for (int i = 2; i < n+1; i++) {
				if(visit[i] == false && map[temp][i] ==1) {
					que.offer(i);
					visit[i]=true;
					cnt++;
				}
			}
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n =Integer.parseInt(br.readLine());
		e =Integer.parseInt(br.readLine());
		map = new int[n+1][n+1];
		visit = new boolean[n+1];
		for (int i = 0; i <n+1; i++) {
			Arrays.fill(map[i], 0);
		}
		Arrays.fill(visit, false);
		
		for (int i = 0; i < e; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int s1=Integer.parseInt(st.nextToken());
			int s2 = Integer.parseInt(st.nextToken());
			map[s1][s2] =1;
			map[s2][s1]=1;
		}
		bfs();
		System.out.println(cnt);
	
	}
}
