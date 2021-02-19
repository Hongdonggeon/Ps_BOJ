import java.util.ArrayList;

public class Practice {
	public static void main(String[] args) {
		ArrayList<Character> ar = new ArrayList<Character>();
		ar.add('a');
		ar.add('b');
		ar.add('c');
		ar.add('a');
		ar.add('b');
		ar.add('c');
		
		for (int i = 0; i < ar.size(); i++) {
			char cs =ar.get(i);
			System.out.println(ar.lastIndexOf(cs)-i);
		}
	}
}
