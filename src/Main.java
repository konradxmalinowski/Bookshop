import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Add book");
            System.out.println("2. Remove book");
            System.out.println("3. Display all books");
            System.out.println("4. Find book by title");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: {
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    library.addBook(title, author);
                    System.out.println("✅ Book added successfully.");
                    break;
                }
                case 2: {
                    System.out.println("Enter title: ");
                    String title = scanner.nextLine();
                    library.removeBook(title);
                }
                case 3:
                    library.displayBooks();
                    break;
                case 4:
                    System.out.print("Enter title to search: ");
                    String searchTitle = scanner.nextLine();
                    library.findBookByTitle(searchTitle);
                    break;
                case 5:
                    System.out.println("Bye...");
                    System.exit(0);
                default:
                    System.out.println("Incorrect option.");
            }
        }
    }
}