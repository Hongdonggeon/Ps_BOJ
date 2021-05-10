import java.util.HashMap;
import java.util.Scanner;

public class MemberManage {
    private Scanner scanner;
    private HashMap<String, Member> memberHash;

    public MemberManage() {
        this.scanner = new Scanner(System.in);
        this.memberHash = new HashMap<String, Member>();
    }

    public void signup() {
        while (true) {
            System.out.print("ID : ");
            String id = scanner.next();
            System.out.print("이름 : ");
            String name = scanner.next();
            System.out.print("비밀번호 : ");
            String pw = scanner.next();

            if (memberHash.containsKey(id)) {
                System.out.println("이미 존재하는 ID 입니다.");
            } else {
                System.out.println("회원가입 완료");
                memberHash.put(id, new Member(id, name, pw));
                break;
            }
        }
    }

    public Member Login() {
        Member member = null;
        System.out.print("ID : ");
        String member_id = scanner.next();
        System.out.print("비밀번호 : ");
        String pw = scanner.next();
        if (!memberHash.containsKey(member_id)) {
            System.out.println("아이디가 존재하지 않습니다.");
            return null;
        } else if (memberHash.containsKey(member_id) && !(pw.equals(memberHash.get(member_id).getPassword()))) {
            System.out.println("비밀번호가 틀렸습니다.");
            return null;
        } else {
            System.out.println("로그인 되었습니다.");
            member = memberHash.get(member_id);
            return member;
        }
    }

    public void PrintMemberList() {
        if (memberHash.isEmpty()) {
            System.out.println("멤버가 없습니다.");
        } else {
            for (String s : memberHash.keySet()) {
                System.out.println("ID : " + memberHash.get(s).getID() + ", 이름 : " + memberHash.get(s).getName());
            }
        }
    }
}
