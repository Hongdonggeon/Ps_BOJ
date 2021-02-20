import java.util.*;

public class Main1300 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int [] ar = new int[N*N];
		int k=1;
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				ar[k-1]= i*j;
				k++;
			}
		}
		Arrays.sort(ar);
		int key = input.nextInt();
		System.out.println(ar[key]);
		
//		int start = 0;
//		int end = ar.length-1;
//		int ans =0;
//		
//		while(start<=end) {
//			int mid = (start+end)/2;
//			if(ar[mid] == ar[key]) {
//				ans = ar[mid];
//				break;
//			}
//			else if(ar[mid]<key)
//				start =mid+1;
//			else
//				end =mid-1;
//		}
		
		
		
	}
}
