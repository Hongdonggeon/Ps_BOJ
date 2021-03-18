import java.io.*;
import java.util.*;
public class Main2750 {
	static void swap (int ar[],int idx1, int idx2) {
		int temp = ar[idx1];
		ar[idx1] = ar[idx2];
		ar[idx2] = temp;
	}
	static void bubblesort(int n, int ar[]) {
		for (int i = 0; i < n-1; i++) {
			int exchg =0;
			for (int j = n-1 ; j > i; j--) {
				if(ar[j-1] > ar[j]) {
					swap(ar, j-1, j);
					exchg++;
				}
			}
			if(exchg ==0)
				break;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int n = Integer.parseInt(br.readLine());
		int ar[] = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = Integer.parseInt(br.readLine());
		}
		bubblesort(n, ar);
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
}
