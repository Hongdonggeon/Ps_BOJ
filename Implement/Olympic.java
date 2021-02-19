import java.util.Scanner;

public class Olympic {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int cNumber = input.nextInt();
		int kNumber = input.nextInt();
		int [][] record = new int[cNumber][4];
		int [] rank = new int[4]; // 임시 저장 
		int [] list = new int[cNumber+1];
		int cnt =1;
		int index=0;
		int check =0;

		for (int i = 0; i < record.length; i++) {
			for (int j = 0; j < record[i].length; j++) {
				record[i][j]=input.nextInt();
			}
		}
		for (int i = 0; i < cNumber-1; i++) {
			for (int j = i+1; j < cNumber; j++) {
				if(record[i][1]<record[j][1]) {
					rank = record[i];
					record[i]=record[j];
					record[j]=rank;

				}
				if (record [i][1] == record[j][1]) {
					if(record[i][2]<record[j][2]) {
						rank =record[i];
						record[i]=record[j];
						record[j]=rank;
					}
					else if(record[i][2] == record[j][2]) {
						if(record[i][3]<record[j][3]) {
							rank =record[i];
							record[i]=record[j];
							record[j]=rank;
						}
					}
				}
			}
		}
	for (int i = 0; i < cNumber; i++) {
			index = record[i][0];
			list[index] =cnt;
			if(i<cNumber-1) {
				check =0;
				for (int j = 1; j < 4; j++) {
					if(record[i][j] != record[i+1][j]) {
						check++;
					}
				}
			}
			if(check>0) {
				cnt++;
			}
		}
		System.out.println(list[kNumber]);


	}
}
