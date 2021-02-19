import java.util.Scanner;

public class Drink {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int have = input.nextInt();
		int take = input.nextInt();
		int value = input.nextInt();
		int sum=have+take;
		
		int total = 0;
		int cnt =0;
		while(sum>=value) {
			total +=sum/value;
			cnt= sum%value;
			sum = sum/value;
			sum= cnt+sum;
			}
		System.out.println(total);
	}
}
