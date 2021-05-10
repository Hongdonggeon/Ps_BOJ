import java.util.HashMap;
import java.util.Scanner;

public class BookManage {

    private Scanner scanner;
    private HashMap<String, Book> bookHash;

    public BookManage() {
        this.scanner = new Scanner(System.in);
        this.bookHash = new HashMap<String, Book>();
    }

    void printBookList() {
        if (bookHash.isEmpty()) {
            System.out.println("책이 없습니다.");
        } else {
            for (String s : bookHash.keySet()) {
                System.out.println("도서번호 : " + bookHash.get(s).getBook_number() + ", 도서명 :  " + bookHash.get(s).getName() + ", 도서 장르 : " + bookHash.get(s).getGenre() + ", 재고 : " + bookHash.get(s).getStock());
            }
        }
    }

    boolean AddBook() {
        String book_num;
        String book_name;
        String book_genre;
        int book_stock;
        System.out.print("도서 번호 : ");
        book_num = scanner.next();
        System.out.print("도서 이름 : ");
        book_name = scanner.next();
        System.out.print("도서 장르 : ");
        book_genre = scanner.next();
        System.out.print("도서 수량 : ");
        book_stock = scanner.nextInt();


        if (book_stock > 0 && !bookHash.containsKey(book_num) || bookHash.isEmpty()) {
            Book b = new Book(book_num, book_name, book_genre, book_stock);
            bookHash.put(book_num, b);
            return true;
        } else
            return false;

    }

    boolean UpdateBookStock() {
        System.out.print("추가하고자 하는 도서 번호 : ");
        String update_stock_booknumber = scanner.next();
        System.out.print("추가하고자 하는 수량 : ");
        int update_stock = scanner.nextInt();
        int i;


        if (bookHash.containsKey(update_stock_booknumber) && update_stock > 0) {
            bookHash.get(update_stock_booknumber).updateStock(update_stock);
            return true;
        } else
            return false;


    }

    boolean ReturnBook(Member member) {
        System.out.print("도서 번호 : ");
        String returnbook_num = scanner.next();
        boolean member_coincidence_flag = false;
        int i;
        Book b = null;
        HashMap<String, Book> m = member.getBookHash();
        if (m.containsKey(returnbook_num)) {
            b = m.get(returnbook_num);
        }
        if (b != null) {
            bookHash.get(returnbook_num).AddStock();
            m.remove(returnbook_num);
            return true;
        } else
            return false;

    }

    boolean RentalBook(Member member) {
        System.out.print("도서 번호 : ");
        String lendbook_num = scanner.next();
        boolean book_exist_flag = false;
        int i;
        Book b = null;
        if (bookHash.containsKey(lendbook_num)) {
            b = bookHash.get(lendbook_num);
        }

        HashMap<String, Book> m = member.getBookHash();
        if (b != null && b.getStock() > 0) {
            b.SubstractStock();
            m.put(lendbook_num, b);
            return true;

        } else
            return false;


    }
}
