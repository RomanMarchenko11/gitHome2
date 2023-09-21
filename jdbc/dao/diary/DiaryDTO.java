package jdbc.dao.diary;

import java.util.Objects;

public class DiaryDTO {
    private Integer id;
    private String note;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        DiaryDTO diaryDTO = (DiaryDTO) object;
        return Objects.equals(id, diaryDTO.id) && Objects.equals(note, diaryDTO.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, note);
    }

    @Override
    public String toString() {
        return "DiaryDTO{" +
                "id=" + id +
                ", note='" + note + '\'' +
                '}';
    }
}
