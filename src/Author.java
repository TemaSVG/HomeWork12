import java.util.Objects;

public class Author {
    private String nameAuthor;
    private String surnameAuthor;

    public Author(String nameAuthor, String surnameAuthor) {
        if (!(nameAuthor.isEmpty() || surnameAuthor.isEmpty())) {
            this.nameAuthor = nameAuthor;
            this.surnameAuthor = surnameAuthor;
        } else {
            throw new RuntimeException("Имя или Фамилия Автора не может быть пустыми");
        }
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public String getSurnameAuthor() {
        return surnameAuthor;
    }

    public String toString() {
        return nameAuthor + " " + surnameAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {

            return true;
        }
        if (!(o instanceof Author author)) {

            return false;
        }
        return Objects.equals(nameAuthor, author.nameAuthor) && Objects.equals(surnameAuthor, author.surnameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor, surnameAuthor);
    }
}
