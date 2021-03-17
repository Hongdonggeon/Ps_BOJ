import java.util.*;
import java.io.*;

public class Main2309 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> ar = new ArrayList<Integer>();
		int sum =0;
		for (int i = 0; i < 9; i++) {
			ar.add(Integer.parseInt(br.readLine()));
			sum +=ar.get(i);
		}
		
		Collections.sort(ar);	
		for (int i = 0; i <ar.size()-1; i++) {
			for (int j = i+1; j < ar.size(); j++) {
				if((sum-ar.get(i)-ar.get(j)) == 100) {
					ar.remove(i);
					ar.remove(j-1);
					break;
				}
			}
		}
	for (int i = 0; i < ar.size(); i++) {
		System.out.println(ar.get(i));
	}
				
	}
}
