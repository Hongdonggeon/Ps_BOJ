import java.util.*;

public class Main1654 {
	public static boolean check(int[] a, int num, int mid) {
		int cnt=0;
		for (int i = 1; i <= a.length; i++) {
			if(cnt > (a[i]-a[i-1]))
				cnt = (a[i]-a[i-1]);
		}
		return cnt >= num;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int have = input.nextInt();
		int need = input.nextInt();
		int ar[] = new int[have];
		int max=0;
		for (int i = 0; i < have; i++) {
			ar[i] = input.nextInt();
			 max = Math.max(max, ar[i]);
		}

		int start = 1;
		int end = max;
		int ans = 0;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (check(ar, need, mid)) {
				ans = Math.max(ans, mid);
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		System.out.println(ans);

	}
}
