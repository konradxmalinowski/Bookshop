import java.util.ArrayList;

public class Library {
    final private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(String title, String author) {
        books.add(new Book(title, author));
    }

    private int findBook(String title) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equalsIgnoreCase(title)) {
                return i;
            }
        }

        return books.size();
    }

    public void removeBook(String title) {
        int index = findBook(title);
        if (index == books.size()) {
            System.out.printf("Book '%s' was not found", title);
            return;
        }
        books.remove(index);
        System.out.println("Book removed successfully");
    }

    public void displayBooks() {
        System.out.println();
        for (Book book : books) {
            System.out.printf("Author: %s, title: %s", book.getAuthor(), book.getTitle());
        }
        System.out.println();
    }

    public void findBookByTitle(String title) {
        int index = findBook(title);
        if (index == books.size()) {
            System.out.printf("Book '%s' was not found", title);
            return;
        }
       books.get(index).display();
    }
}
