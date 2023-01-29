import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int datePublication;
    public Book(String title, Author author,int datePublication) {
        this.title=title;
        this.author=author;
        this.datePublication=datePublication;}

    public String getTitle(){
        return this.title;
    }
    public Author getAuthor(){
        return this.author;
    }
    public int getDatePublication(){
        return this.datePublication;
    }
    public  void setDatePublication(int datePublication){
        this.datePublication=datePublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return datePublication == book.datePublication && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, datePublication);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", datePublication=" + datePublication +
                '}';
    }
}