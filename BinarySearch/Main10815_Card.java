import java.io.*;
import java.util.*;

public class Main10815 {
	public static boolean check(int[] ar, int key) {
		int start = 0;
		int end = ar.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (key == ar[mid])
				return true;
			else if (key > ar[mid])
				start = mid + 1;
			else
				end = mid - 1;
		}
		return false;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		int[] have = new int[num];
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for (int i = 0; i < have.length; i++) {
			have[i] = Integer.parseInt(st1.nextToken());
		}

		int size = Integer.parseInt(br.readLine());
		int[] check = new int[size];
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for (int i = 0; i < check.length; i++) {
			check[i] = Integer.parseInt(st2.nextToken());
		}

		Arrays.sort(have);

		for (int i = 0; i < check.length; i++) {
			if (check(have, check[i]))
				sb.append(1).append(" ");
			else
				sb.append(0).append(" ");
		}
		System.out.println(sb);
	}
}
