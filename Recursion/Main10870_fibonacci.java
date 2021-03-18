import java.io.*;

public class Main10870 {
	public static int Fibonacci(int x) {
		if(x==0)
			return 0;
		else if(x==1)
			return 1;
		else
			return Fibonacci(x-1) +Fibonacci(x-2);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(Fibonacci(n));
		
	}
}
