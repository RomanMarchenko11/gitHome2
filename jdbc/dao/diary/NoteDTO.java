package jdbc.dao.diary;

import java.util.Objects;

public class NoteDTO {
    private String author;
    private String date;
    private Integer diaryId;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getDiaryId() {
        return diaryId;
    }

    public void setDiaryId(Integer diaryId) {
        this.diaryId = diaryId;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        NoteDTO noteDTO = (NoteDTO) object;
        return Objects.equals(author, noteDTO.author) && Objects.equals(date, noteDTO.date) && Objects.equals(diaryId, noteDTO.diaryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, date, diaryId);
    }

    @Override
    public String toString() {
        return "NoteDTO{" +
                "author='" + author + '\'' +
                ", date='" + date + '\'' +
                ", diaryId=" + diaryId +
                '}';
    }
}
