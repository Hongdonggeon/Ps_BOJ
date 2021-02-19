import java.util.Scanner;

public class ColorPaper {
public static void main(String[] args) {
	int size =10;
	Scanner input = new Scanner(System.in);
	int number = input.nextInt(); // 색종이의 개수 
	int total = 0;
	int [][]location = new int[number][2];
	
	boolean [][]check = new boolean[100][100];
	
	for (int i = 0; i < check.length; i++) {
		for (int j = 0; j < check[i].length; j++) {
			check[i][j]=false;
		}
	}
	
	for (int i = 0; i < location.length; i++) {
		for (int j = 0; j < location[i].length; j++) {
			location[i][j] = input.nextInt();
			}
	}
	
	for(int i=0; i<number ;i++) {
		int x=location[i][0];
		int y =location[i][1];
		for (int j = 0; j < size; j++) {
			for (int j2 = 0; j2 < size; j2++) {
				if(check[x+j][y+j2] == false) {
				check[x+j][y+j2]=true;
				total++;
				}
			}
		}
	}
	System.out.println(total);

	}
}
