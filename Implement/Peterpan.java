import java.util.Scanner;

public class Peterpan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String word =input.next();
		char peter = '#';
		char wendy = '*';
		int index =0;
		
		char [][] paint = new char[5][4*word.length()+1];
		for (int i = 0; i < paint.length; i++) {
			int r1 =10;
			int rl2= 9;
			int rr2 = 11;
			int rl3=8;
			int rr3 =12;
			for (int j = 0; j < paint[i].length; j++) {
				//2青 4青老锭
				if(i%2==1) {
					if(j==rl2) {
						System.out.print(wendy);
						rl2+=12;
						}
					else if(j==rr2) {
						System.out.print(wendy);
						rr2+=12;
					}
					else if(j%2==1) {
						System.out.print(peter);
					}
					else
						System.out.print(".");
				}

				//3青老锭
				else if(i==2) {
					if(j==rl3) {
						System.out.print(wendy);
						rl3+=12;
					}
					else if(j==rr3) {
						System.out.print(wendy);
						rr3+=12;
					}
					else if(j%4==2) {
						System.out.print(word.charAt(index));
						index++;
					}
					else if(j%4==0) {
						System.out.print(peter);
					}
					else
						System.out.print(".");
				} 

				//1青, 5青老锭
				else {
					if(j==r1) {
						System.out.print(wendy);
						r1+=12;
					}
					else if(j%4==2) {
						System.out.print(peter);
					}
					else {
						System.out.print(".");
					}
				}

			}
			System.out.println();
		}
	}
}
