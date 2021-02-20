import java.io.*;
import java.util.*;

public class Main1517 {
	static long buff[];
	static long sum;

	static void mergeSort(long[] a, int left, int right) {
		if (left < right) {
			int center = (left + right) / 2;
			int a_index = 0;
			int b_index = 0;
			int b_size = 0;
			int k = left;

			mergeSort(a, left, center);
			mergeSort(a, center + 1, right);

			for (a_index = left; a_index <= center; a_index++) {
				buff[b_size++] = a[a_index];
			}
			while (a_index <= right && b_index < b_size) {
				if (a[a_index] > buff[b_index]) {
					a[k++] = buff[b_index++];
					sum += b_size - b_index + 1;
				} else {
					a[k++] = a[a_index++];

				}

			}
			while (b_index < b_size) {
				a[k++] = buff[b_index++];
				sum++;
			}
		}
	}

	static void merge(long[] a, int n) {
		buff = new long[n];
		mergeSort(a, 0, n - 1);
		buff = null;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		long[] arnum = new long[n];

		for (int i = 0; i < n; i++) {
			arnum[i] = Long.parseLong(st.nextToken());
		}
		merge(arnum, n);
		System.out.println(sum);

	}
}
