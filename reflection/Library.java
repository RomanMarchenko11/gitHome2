package reflection;

import java.util.Objects;

@AnnotateValidate
public class Library {
    /*
    Написати свою анотацію для валідації і імплементатор
     */
    @IfYouRead
    private boolean readBooks;
    private String clientName;

    public Library(String clientName, boolean readBooks) {
        this.readBooks = readBooks;
        this.clientName = clientName;
    }

    public boolean isReadBooks() {
        return readBooks;
    }

    public void setReadBooks(boolean readBooks) {
        this.readBooks = readBooks;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Library library = (Library) object;
        return readBooks == library.readBooks && Objects.equals(clientName, library.clientName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(readBooks, clientName);
    }

    @Override
    public String toString() {
        return "Library{" +
                "readBooks=" + readBooks +
                ", clientName='" + clientName + '\'' +
                '}';
    }
}
