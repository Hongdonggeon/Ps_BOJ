public class Book {
    String book_number;
    String name;
    String genre;
    int stock;

    public Book(String book_number, String name, String genre, int stock) {
        this.book_number = book_number;
        this.name = name;
        this.genre = genre;
        this.stock = stock;
    }

    public String getBook_number() {
        return book_number;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getStock() {
        return stock;
    }

    void updateStock(int new_stock) {
        this.stock += new_stock;
    }

    void AddStock() {
        this.stock += 1;
    }

    void SubstractStock() {
        this.stock -= 1;
    }
}
