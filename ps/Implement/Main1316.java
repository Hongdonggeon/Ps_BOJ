import java.io.*;
import java.util.*;

public class Main1316 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		ArrayList<Character> ar = new ArrayList<Character>();
		while (n-- > 0) {
			String s =br.readLine();
			for (int i = 0; i < s.length(); i++) 
				ar.add(s.charAt(i));
			int k;
			for (k = 0; k < s.length(); k++) {
				char cs = s.charAt(k);
					if (ar.lastIndexOf(cs) - k > 1) 
						break;
					}
			if(k==s.length() || ar.isEmpty())
				cnt++;
			
			ar.clear();
			
		}
		System.out.println(cnt);
	}
}
