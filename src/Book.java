public class Book {
    private String title;
    private String author;
    static int counter = 0;
    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        Book.counter++;
    }
    
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void display() {
        System.out.printf("Title: %s, author: %s",  title, author);
    }

}
