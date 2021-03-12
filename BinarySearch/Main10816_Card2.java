import java.io.*;
import java.util.*;

public class Main10816 {
	public static void main(String[] args) throws IOException {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n1 = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < n1; i++) {
			int k =Integer.parseInt(st.nextToken());
			map.putIfAbsent(k, 0);
			map.computeIfPresent(k, (s,n) -> ++n);
			
		}
		int n2= Integer.parseInt(br.readLine());
		st= new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n2; i++) {
			int check =Integer.parseInt(st.nextToken());
			if(map.containsKey(check))
				sb.append(map.get(check)).append(" ");
			else
				sb.append(0).append(" ");
		}
		System.out.println(sb);
	}
}
