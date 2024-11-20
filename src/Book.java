import java.util.Objects;

public class Book {
    private String publisher;
    private int publishingYear;
    private Author author;

    public Book(String publisher, Author author, int publishingYear) {
        this.publisher = publisher;
        this.publishingYear = publishingYear;
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return String.format("Книга %s, автор %s, год публикации %s.", publisher, author.toString(), publishingYear);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {

            return true;
        }
        if (!(o instanceof Book book)) {

            return false;
        }
        return publishingYear == book.publishingYear && Objects.equals(publisher, book.publisher) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publisher, publishingYear, author);
    }
}


