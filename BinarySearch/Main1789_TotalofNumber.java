import java.util.Scanner;

public class Main1789{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Long n = input.nextLong();
		int cnt=0;
		for (int i = 1; i <= n; i++) {
			n-=i;
			cnt++;
		}
		System.out.println(cnt);
		System.out.println(n);
	}
}