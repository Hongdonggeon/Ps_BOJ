import java.util.*;

public class Main17478 {
	
	static String s = "";
	public static void chatbot(int n) {	
		String locals = s;
		if (n == 0) {
			System.out.println(locals+"\"����Լ��� ������?\"");
			System.out.println(locals+"\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
			System.out.println(locals+"��� �亯�Ͽ���.");
			return;
		} else {
			System.out.println(locals+"\"����Լ��� ������?\"");
			System.out.println(locals+"\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
			System.out.println(locals+"���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
			System.out.println(locals+"���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
			}
		s+="____";
		chatbot(n-1);
		System.out.println(locals+"��� �亯�Ͽ���.");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
		chatbot(n);
	}
}
