import java.util.*;

public class Main2110 {
	public static boolean check(long[] a, long wifi2, long mid2) {
		int cnt = 1;
		long key = a[0] + mid2;

		for (int i = 0; i < a.length; i++) {
			if (a[i] >= key) {
				cnt++;
				key = a[i] + mid2;
			}
		}
		return cnt >= wifi2;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int home = input.nextInt();
		int wifi = input.nextInt();
		long[] ar = new long[home];

		for (int i = 0; i < home; i++) {
			ar[i] = input.nextLong();
		}
		Arrays.sort(ar);
		long max = ar[home - 1];
		long start = 1;
		long end = max - ar[0];
		long ans = 0;

		while (start <= end) {
			long mid = (start + end) / 2;
			if (check(ar, wifi, mid)) {
				ans = ans > mid ? ans : mid;
				start = mid + 1;
			} else
				end = mid - 1;
		}
		System.out.println(ans);
	}
}
