import java.util.Scanner;

public class ScoreCount {
public static void main(String[] args) {
	int []arScore = new int[8]; //�Է¹޴� �迭
	int []sortAr = new int[8]; // ������ �迭
	int []index= new int[8]; // ���� ��ȣ
	int [] top=new int[5]; // ������ 5��
	int total =0;
	Scanner input = new Scanner(System.in);
	for (int i = 0; i < arScore.length; i++) {
		arScore[i] = input.nextInt();
		sortAr[i]=arScore[i];
		index[i]=i+1;
	}
	
	for (int i = 0; i < index.length-1; i++) {
		for (int j = i+1; j < index.length; j++) {
			if(sortAr[i]>sortAr[j]) {
				int temp=sortAr[i];
				sortAr[i] =sortAr[j];
				sortAr[j]=temp;
				int cnt =index[i];
				index[i]=index[j];
				index[j] = cnt;
			}
		}
	}
	for (int i = 0; i < index.length; i++) {
		System.out.println(index[i]);
	}
	for (int i = 3; i < index.length; i++) {
		total += sortAr[i];
	}
	
	for (int i = 0; i < top.length; i++) {
		top[i]=index[i+3];
	}
	
	for (int i = 0; i < top.length-1; i++) {
		for (int j = i; j < top.length; j++) {
			if(top[i]>top[j]) {
				int tmp = top[i];
				top[i] =top[j];
				top[j]=tmp;
			}
		}
	}
	System.out.println(total);
	for (int i = 0; i < top.length; i++) {
		System.out.println(top[i]);
	}
	
}
}
