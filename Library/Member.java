import java.util.HashMap;

public class Member extends Person {
    HashMap<String, Book> bookHash; // 대여중인 도서 저장

    public Member(String ID, String name, String password) {
        super(ID, name, password);
        this.bookHash = new HashMap<String, Book>();
    }

    public HashMap<String, Book> getBookHash() {
        return bookHash;
    }

    void PrintRentalList() {
        if (bookHash.isEmpty()) {
            System.out.println("대여한 책이 없습니다.");
        } else {
            for (String s : bookHash.keySet()) {
                System.out.println("도서번호 : " + bookHash.get(s).book_number + ", 도서명 :  " + bookHash.get(s).book_number + ", 도서 장르 : " + bookHash.get(s).genre);
            }
        }
    }
}
