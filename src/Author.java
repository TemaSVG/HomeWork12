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

}
