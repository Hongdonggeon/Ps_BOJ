import java.util.Scanner;


public class Gongyack {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int n = input.nextInt();
	int ar[] = new int[n];
	for (int i = 0; i < n; i++) {
		ar[i]=input.nextInt();
	}
	
	int max = ar[0];
	for(int i=0; i<n;i++) {
		if(max<ar[i]) max= ar[i];
	}
	
	int check[] = new int[max];
	for (int i = 0; i < check.length; i++) {
		check[i]= 0;
	}
	
	for (int i = 0; i < ar.length; i++) {
		for (int j = 1; j <= ar[i]; j++) {
			if(ar[i]%j ==0) {
				check[j-1]++;
			}
		}
	}
	
	for (int i = 0; i < check.length; i++) {
		if((n==2 && check[i]==2) || (n==3 && check[i]==3)) {
			System.out.println(i+1);
		}
	}
}
}
