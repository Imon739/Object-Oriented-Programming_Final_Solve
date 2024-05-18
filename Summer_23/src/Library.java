import java.util.ArrayList;

class Library {
    ArrayList< Book > books;
    Library(){
        books = new ArrayList<>();
    }
    void addBook(Book book){
        for(int i=0; i<books.size(); i++){
            if(books.get(i).title.equals(book.title)){return;}
        }
        books.add(book);
    }
    void buyBook(String bookTitle){
        for(int i=0; i<books.size(); i++){
            Book b = books.get(i);
            if(b.title.equals(bookTitle)){
            // Write your code here
                try {
                    b.buyBook();
                    books.set(i, new Book(b.title, b.author, b.numberOfAvailableCopies - 1));
                    break;
                }catch (BookOutOfStock e){
                    System.out.println(e.getMessage());
                    System.out.println("The book you are willing to order is unavailable");
                }
            }
        }
    }
}