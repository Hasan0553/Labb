package L3Uppgift2;

public class Book {

    private String title;
    private String location;
    private String author;
    private int numberOfPages;

    public void Book(String title, String author, int numberOfPages){
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public void setLocation(String newLocation){
        this.location = newLocation;
    }

    public String getLocation(){
        return this.location;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getTitle(){
        return this.title;
    }

    public int getNumberOfPages(){
        return this.numberOfPages;
    }

    public String toString(){
        return title + " " + author + " " + numberOfPages;
    }

}
