import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1764 {
	static ArrayList<String> all = new ArrayList<String>();

	public static void binarySearch(String str, String[] notS) {
		int start = 0;
		int end = notS.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (notS[mid].compareTo(str) == 0) {
				all.add(str);
				return;
			} else if (str.compareTo(notS[mid]) > 0) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
	}

	public static void main(String[] args) throws IOException {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        int N = Integer.parseInt(st.nextToken());
	        int M = Integer.parseInt(st.nextToken());
	 

		String notL[] = new String[N];

		for (int i = 0; i < N; i++) {
			notL[i] = new String(br.readLine());
		}

		String notS[] = new String[M];

		for (int i = 0; i < M; i++) {
			notS[i] = new String(br.readLine());
		}

		Arrays.sort(notS);

		for (int i = 0; i < N; i++) {
			binarySearch(notL[i], notS);
		}

		Collections.sort(all);
		System.out.println(all.size());
		for (String str : all)
			System.out.println(str);

	}
}
