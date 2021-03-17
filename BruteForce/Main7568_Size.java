import java.io.*;
import java.util.*;

public class Main7568 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[] rank = new int[n];
		int[][] arr = new int[n][2];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 2; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int cnt = 0;

		for (int i = 0; i < n; i++) {
			cnt = 0;
			for (int j = 0; j < n; j++) {
				if (i == j)
					continue;
				if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1])
					cnt++;

				rank[i] = cnt + 1;
			}
		}
		for (int i = 0; i < rank.length; i++) {
			System.out.print(rank[i] + " ");
		}
	}
}
