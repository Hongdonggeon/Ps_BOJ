import java.io.*;


public class Main2751 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int [] ar = new int[2000001];
		for (int i = 0; i < n; i++) {
			ar[1000000+Integer.parseInt(br.readLine())]++;
		}
		
		for (int i = 0; i < ar.length; i++) {
		if(ar[i]>0) 
			sb.append(i-1000000).append("\n");
		}
		System.out.println(sb);
	}
}
