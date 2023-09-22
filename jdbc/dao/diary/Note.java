package jdbc.dao.diary;

import java.util.Objects;

public class Note {
    private String Author;
    private String date;
    private Diary diary;

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Diary getDiary() {
        return diary;
    }

    public void setDiary(Diary diary) {
        this.diary = diary;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Note note = (Note) object;
        return Objects.equals(Author, note.Author) && Objects.equals(date, note.date) && Objects.equals(diary, note.diary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Author, date, diary);
    }

    @Override
    public String toString() {
        return "Note{" +
                ", Author='" + Author + '\'' +
                ", date='" + date + '\'' +
                ", diary=" + diary +
                '}';
    }
}
