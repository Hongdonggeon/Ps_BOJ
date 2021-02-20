import java.util.ArrayList;
import java.util.Scanner;

public class Main1769 {
	static ArrayList<String> str = new ArrayList<String>();
	static int sum;
	
	static void rec (int n) {
		int sum=0;
		if(n==0)
			return;
				
		else {
			sum += Integer.parseInt(str.get(n));
			rec(n-1);
		}
		
		
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.next();
		
		for (int i = 0; i < s.length(); i++) {
			String st[] =s.split(""); 
			str.add(st[i]);
		}
		int n =input.nextInt();
		
		if(sum%ns==0)
			System.out.println("YES");
		else 
			System.out.println("NO");
		
		
		
	}
}
