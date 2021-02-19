import java.util.Scanner;

public class SuperMario {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arPoint[]= new int[10];
		for (int i = 0; i < arPoint.length; i++) {
			arPoint[i]= input.nextInt();
		}
		boolean flag =true;
		int besum =0;
		int bdiffer =0;
		int differ=0;
		int sum =0;
		int aim =100;
		int i;
		for (i = 0; i < arPoint.length; i++) {
			sum+=arPoint[i];
			besum = sum-arPoint[i];
			
			if((aim-besum)>0) bdiffer= aim-besum;
			else bdiffer= besum - aim;
			if((aim-sum)>0) differ= aim-sum;
			else differ= sum - aim;
			
			if(bdiffer<differ) {
				flag = true;
				break;
			}
			else {
				flag = false;
				if(besum<=100 && sum >= 100) {
					flag = false;
					break;
				}
			}
			
		}
		if(flag) {
		System.out.println(besum);
		}
		else {
			System.out.println(sum);
		}
	}
}
