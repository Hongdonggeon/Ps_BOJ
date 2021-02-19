import java.math.BigInteger;
import java.util.Scanner;

public class Noise {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	BigInteger A = new BigInteger(input.next());
	char op = input.next().charAt(0);
	BigInteger B = new BigInteger(input.next());
	
	switch (op) {
	case '+':
		System.out.println(A.add(B));
		break;

	case '*' :
		System.out.println(A.multiply(B));
		break;
	
	default:
		break;
	}
}
}
