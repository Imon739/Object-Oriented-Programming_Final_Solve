import java.util.ArrayList;
import java.util.List;
class Book {
    String title;
    String author;
    int numberOfAvailableCopies;

    public Book(String title, String author, int numberOfAvailableCopies) {
        this.title = title;
        this.author = author;
        this.numberOfAvailableCopies = numberOfAvailableCopies;
    }

    void buyBook() throws BookOutOfStock {// Complete the method}
        if (numberOfAvailableCopies == 0)
            throw new BookOutOfStock();
        System.out.println("Purchase successful");
        numberOfAvailableCopies--;
    }
}