public class Main {
    public static void main(String[] args) {
        Book[] books = {new Book("Мастер и Маргарита", new Author("Михаил", "Булгаков"), 1967),
                        new Book("Война и мир", new Author("Лев", "Толстой"), 1869)};
        for (Book book : books) {
            System.out.println(book);
        }

//        Author authorTheMAndM = new Author("Михаил", "Булгаков");
//        Book theMasterAndMargarita = new Book("Мастер и Маргарита", authorTheMAndM, 1967);
//        System.out.println(theMasterAndMargarita.getAuthor().getNameAuthor() + " " + theMasterAndMargarita.getAuthor().getSurnameAuthor());
//        System.out.println(theMasterAndMargarita.getPublisher());
//        System.out.println(theMasterAndMargarita.getPublishingYear());
//        Author authorTheWandP = new Author("Лев", "Толстой");
//        Book warAndPeace = new Book("Война и мир", authorTheWandP, 1869);
//        System.out.println(warAndPeace.getAuthor().getNameAuthor() + " " + warAndPeace.getAuthor().getSurnameAuthor());
//        System.out.println(warAndPeace.getPublisher());
//        System.out.println(warAndPeace.getPublishingYear());
//        warAndPeace.setPublishingYear(1870);
//        System.out.println(warAndPeace.getPublishingYear());
    }
}