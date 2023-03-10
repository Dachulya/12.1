import java.util.Objects;

public class Author {
    private String firstName;
    private String secondName;
    public Author(String firstName,String secondName){
        this.firstName=firstName;
        this.secondName=secondName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    @Override//переопределение что бы кракозябру не выводило
    public String toString(){
        return "Author name: "+firstName+" "+secondName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return firstName.equals(author.firstName) && secondName.equals(author.secondName);
    }


    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName);
    }

}