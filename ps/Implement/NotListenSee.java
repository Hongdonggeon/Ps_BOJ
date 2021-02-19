import java.util.*;
public class NotListenSee {
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

	public static void main(String[] args)  {
	      Scanner input= new Scanner(System.in);
	        int N = input.nextInt();
	        int M = input.nextInt();
	 

		String notL[] = new String[N];

		for (int i = 0; i < N; i++) {
			notL[i] =input.next();
		}

		String notS[] = new String[M];

		for (int i = 0; i < M; i++) {
			notS[i] = input.next();
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
