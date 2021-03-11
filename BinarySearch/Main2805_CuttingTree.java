import java.util.*;
public class Main2805 {
	public static boolean check(long[] a, long min2,long mid2) {
		long cnt=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>mid2)
			cnt += a[i]-mid2;
		}
		return cnt>=min2;
	}
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int tree= input.nextInt();
	long min = input.nextLong();
	long []ar =new long[tree];
	for (int i = 0; i < tree; i++) {
		ar[i]=input.nextLong();
	}
	
	Arrays.sort(ar);
	long max = ar[tree-1];
	
	long start =1;
	long end =max;
	long ans=0;
	
	while(start<=end) {
		long mid = (start+end)/2;
		if(check(ar,min,mid)) {
			ans= (ans>mid ? ans : mid);
			start=mid+1;
		}
		else
			end=mid-1;
	}
	System.out.println(ans);
	
	}
}
