import java.util.*;
import java.io.*;

public class Main2231 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int i;
		for (i = 1; i < 999961; i++) {
			int sum = 0;
			sum = i / 100000 + (i % 100000) / 10000 + (i % 10000) / 1000 + (i % 1000) / 100 + (i % 100) / 10 + i % 10
					+ i;
			if (sum == n)
				break;
		}
		if (i != 999961)
			System.out.println(i);
		else
			System.out.println(0);
	}
}
