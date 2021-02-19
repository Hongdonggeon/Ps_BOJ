import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int []arStudent=new int[30];
		boolean[]numStudent = new boolean[30];
		int[] notStudent =new int[2];
		for (int i = 0; i < arStudent.length; i++) {
			arStudent[i]=i+1;
			numStudent[i]=false;
		}
		int []canStudent=new int[28];
		for (int i = 0; i < canStudent.length; i++) {
			canStudent[i]=input.nextInt();
		}
		
		for (int i = 0; i < arStudent.length; i++) {
			for (int j = 0; j < canStudent.length; j++) {
				if(arStudent[i]==canStudent[j]) {
					numStudent[i]=true;
					}
			}
		}
		int index=0;
		for (int i = 0; i < numStudent.length; i++) {
			if(numStudent[i]==true) 
				continue;
			notStudent[index]=i+1;
			index++;
		}
		for (int i = 0; i < notStudent.length; i++) {
			System.out.println(notStudent[i]);
		}
		
		
		
	}
}
