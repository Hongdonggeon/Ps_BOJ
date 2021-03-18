import java.io.*;

public class Main11729 {
	static int cnt =1;
	static StringBuilder sb = new StringBuilder();
	
	public static void Hanoi(int no, int x, int y) {
		if(no>1) {
		Hanoi(no-1, x, 6-x-y);
		cnt++;
		}
		sb.append(x).append(" ").append(y).append("\n");
		
		if(no>1) {
			Hanoi(no-1, 6-x-y, y);
			cnt++;
		}
		}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Hanoi(Integer.parseInt(br.readLine()), 1, 3);
		System.out.println(cnt);
		System.out.println(sb);
	}
}
