import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main2798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n =Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		ArrayList<Integer> ar = new ArrayList<Integer>();
		for (int i = 0; i <n ; i++) {
			ar.add(Integer.parseInt(st.nextToken()));
		}
		int bsum=0;
		int sum=0;
		
		for (int i = 0; i < ar.size()-2; i++) {
			for (int j = i+1; j < ar.size()-1; j++) {
				for (int k = j+1; k < ar.size(); k++) {
					sum = ar.get(i) + ar.get(j) + ar.get(k);
					if(bsum <sum && sum <= m ) {
						bsum =sum;
					}
				}
			}
		}
		System.out.println(bsum);
	}
}
