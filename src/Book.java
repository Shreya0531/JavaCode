public class Book {
    /* Member Variables */
    private String name;
    private static String binding = "Paperback"; // Static Field
    private String category;
    private String author;

    /* Constructor */
    public Book(String name,
                String category,
                String author) {
        this.name = name;
        this.category = category;
        this.author = author;
    }

    public String getBookDetails() {
        return String.format("Book %s belongs to %s, is written by %s and with a binding => %s <=", name, category, author, binding);
    }

    public static void main(String[] args) {
        // Binding, is available to both objects
        Book book1 = new Book("Harry and friends", "Fiction", "Ronald");
        Book book2 = new Book("Getting Started with Java", "Programming", "Robin");

        System.out.println(book1.getBookDetails());
        System.out.println(book2.getBookDetails());
    }
}
