public class Main {
    public static void main(String[] args) {
        Book[] books = {new Book("Мастер и Маргарита", new Author("Михаил", "Булгаков"), 1967),
                        new Book("Война и мир", new Author("Лев", "Толстой"), 1869)};
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println(books[0].equals(books[0]));
        System.out.println(books[0].getAuthor().equals(books[1].getAuthor()));
        System.out.println(books[1].hashCode());
        System.out.println(books[0].getAuthor().hashCode());
    }
}