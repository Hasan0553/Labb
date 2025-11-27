package L3Uppgift2;

public class BookShelf {

    private String shelfName;
    private Book[] books;
    private int maximumNumberOfBooks;
    private int numberOfBooks;

    public BookShelf(String shelfName){

        this.shelfName = shelfName;
    }

    public String getBookByTitle(String title){

        return title;
    }

    public Book[] getAllBooks(){
    return this.books;
    }

    public boolean addBook(Book book) {
        this.books = new Book[]{book};

        for (int i= 0; i < books.length; i++){
            if (books[i] == null){
                books[i] = book;
                numberOfBooks++;
                return true;
            }
        }
        return false;
    }



    public String getShelfName(){
        return shelfName;
    }


}
