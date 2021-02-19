import java.util.Scanner;

public class Magic {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int raw = input.nextInt();
		int col = input.nextInt();
		char [][]pattern = new char[raw][col];
		for (int i = 0; i < pattern.length; i++) {
			String s =input.next();
			for (int j = 0; j < pattern[i].length; j++) {
				pattern[i][j] = s.charAt(j);
				}
		}
		char [][]card = new char[raw*2][col*2];
		for (int i = 0; i < pattern.length; i++) {
			for (int j = 0; j < pattern[i].length; j++) {
				card[i][j] = pattern[i][j];
			}
		}
		for (int i = raw; i < card.length; i++) {
			for (int j = 0; j <card[i].length/2; j++) {
				card[i][j]=pattern[card.length-1-i][j];
			}
		}
		
		for (int i = 0; i < card.length; i++) {
			for (int j = col; j < card[i].length; j++) {
				card[i][j] = card[i][card.length-1-j]; 
			}
		}
		
		int errorRaw =input.nextInt();
		int errorCol = input.nextInt();
		if(card[errorRaw-1][errorCol-1] == '#') {
			card[errorRaw-1][errorCol-1]='.';
		}
		else if(card[errorRaw-1][errorCol-1] == '.') {
			card[errorRaw-1][errorCol-1]= '#';
		}
		for (int i = 0; i < card.length; i++) {
			for (int j = 0; j < card[i].length; j++) {
				System.out.print(card[i][j]);
			}
			System.out.println();
		}
		}
}
