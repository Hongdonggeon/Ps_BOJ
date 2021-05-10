import java.util.Scanner;

public class LibraryManagementProgram {
    private static Scanner scanner = new Scanner(System.in);
    private static final String managerID = "0000";
    private static final String managerName = "홍길동";
    private static final String managerPWD = "1234";

    private static TotalLibraryManage libManager = new TotalLibraryManage();
    static Person currentPerson = null;

    public static void main(String[] args) {
        MemberManage m = new MemberManage();
        while (true) {
            printMainMenu();
            System.out.print("입력 >> ");
            int selectNum = scanner.nextInt();

            if (selectNum == 1) { // 관리자 모드
                System.out.println("------------------관리자 모드입니다. 로그인 하십시오.------------------------------");
                System.out.print("ID : ");
                String id = scanner.next();
                System.out.print("PW : ");
                String pw = scanner.next();
                if (id.equals(managerID) && pw.equals(managerPWD)) {
                    System.out.println("로그인 되었습니다.");
                    currentPerson = new Person(managerID, managerName, managerPWD);
                    while (true) {
                        printManagerMenu();
                        int select_manager_option = scanner.nextInt();
                        switch (select_manager_option) {
                            case 1:
                                libManager.ManageRun(currentPerson);
                                break;
                            case 2:
                                System.out.println("이전 화면을 돌아갑니다.");
                                break;
                        }
                        if (select_manager_option == 2)
                            break;
                    }
                } else {
                    System.out.println("관리자 아이디 혹은 비밀번호가 일치하지 않아 초기화면으로 돌아갑니다.");
                }
            } else if (selectNum == 2) { // 회원 메뉴
                Member member = null;
                while (true) {
                    printMemberMenu();
                    int select_member_option = scanner.nextInt();
                    switch (select_member_option) {
                        case 1:
                            m.signup();
                            break;
                        case 2:
                            member = m.Login();
                            break;
                        case 3:
                            if (member != null)
                                libManager.MemberRun(member);
                            else {
                                System.out.println("로그인 해야 이용할 수 있습니다.");
                            }
                            break;
                        case 4:
                            System.out.println("로그아웃 합니다.");
                            break;
                    }
                    if (select_member_option == 4)
                        break;

                }

            } else if (selectNum == 3) { // 종료
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }

    public static void printMainMenu() {
        System.out.println("------------------전북대학교 컴퓨터 공학과 도서관 관리 프로그램입니다.------------------------");
        System.out.println("1. 관리자 메뉴 | 2. 회원 메뉴 | 3. 종료");
        System.out.println("----------------------------------------------------------------------------------------------");

    }

    public static void printManagerMenu() {
        System.out.println("--------------관리자 모드----------------");
        System.out.println("1.도서 관리 | 2. 로그아웃");
    }

    public static void printMemberMenu() {
        System.out.println("---------------회원 모드----------------");
        System.out.println("1. 회원가입 | 2. 로그인 | 3. 도서 대출 | 4. 로그아웃");
        System.out.println("-----------------------------------------");
    }
}

