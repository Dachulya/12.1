public class Main {
        public  static void main(String[] args) {
            Book deadSouls= new Book("Dead souls", new Author("Nikolai"," Gogol"),1842);
            System.out.println("one book - "+deadSouls.getTitle());
            System.out.println("one book - "+deadSouls.getAuthor());
            System.out.println("one book - "+deadSouls.getDatePublication());
            deadSouls.setDatePublication(1841);
            System.out.println("one book - "+deadSouls.getDatePublication());

            Book catcherInTheRye=new Book("The catcher in the rye",new Author("Jeromed"," Salinger"),1951);
            System.out.println("two book - "+ catcherInTheRye.getTitle());
            System.out.println("two book - "+catcherInTheRye.getAuthor());
            System.out.println("two book - "+catcherInTheRye.getDatePublication());
            catcherInTheRye.setDatePublication(1950);
            System.out.println("two book - "+catcherInTheRye.getDatePublication());
        }
    }