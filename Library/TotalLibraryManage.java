import java.util.HashMap;
import java.util.Scanner;

public class TotalLibraryManage {
    MemberManage memberManage;
    BookManage bookManage;

    private Scanner scanner;

    public TotalLibraryManage() {
        memberManage = new MemberManage();
        bookManage = new BookManage();
        scanner = new Scanner(System.in);
    }

    public MemberManage getMemberManage() {
        return memberManage;
    }

    public BookManage getBookManage() {
        return bookManage;
    }

    public void ManageRun(Person person) {
        int choice = 0;
        while (true) {
            System.out.println("----------------------------------------------------");
            System.out.println("1. 전체 도서 목록 출력 | 2. 도서 등록 | 3. 도서 재고 추가 | 4. 회원 목록 보기 |5. 종료");
            System.out.println("----------------------------------------------------");
            System.out.println("<선택>");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bookManage.printBookList();
                    break;
                case 2:
                    boolean addflag = bookManage.AddBook();
                    if (addflag) ;
                    else {
                        System.out.println("추가가 불가능 합니다.");
                    }
                    break;
                case 3:
                    boolean stockupdate = bookManage.UpdateBookStock();
                    if (stockupdate) ;
                    else {
                        System.out.println("입력하신 책 번호는 존재하지 않습니다. 추가가 불가능 합니다.");
                    }
                    break;
                case 4:
                    memberManage.PrintMemberList();
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    break;
            }
            if (choice == 5)
                break;
        }
    }

    public void MemberRun(Person person) {
        int choice = 0;
        Member member = (Member) person;
        while (true) {
            System.out.println("----------------------------------------------------");
            System.out.println("1. 전체 도서 목록 출력 | 2. 도서 대여 | 3. 도서 반납 | 4. 대여 도서 목록 | 5. 돌아가기");
            System.out.println("----------------------------------------------------");
            System.out.println("<선택>");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bookManage.printBookList();
                    break;
                case 2:
                    boolean lendflag = bookManage.RentalBook(member);
                    if (lendflag) ;
                    else {
                        System.out.println("대여가 불가능합니다.");
                    }
                    break;
                case 3:
                    boolean returnflag = bookManage.ReturnBook(member);
                    if (returnflag) ;
                    else {
                        System.out.println("대여하지 않은 책 번호를 입력하였습니다.");
                    }
                    break;
                case 4:
                    member.PrintRentalList();
                    break;
                case 5:
                    System.out.println("이전 화면으로 돌아갑니다.");
                    break;
            }
            if (choice == 5)
                break;
        }
    }


}
