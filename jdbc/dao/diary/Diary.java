package jdbc.dao.diary;

import java.util.Objects;
// Entity

/*
1. Створити щоденник
2. Щоденник повинен вміти - додавати / видаляти / оновлювати їх
3. Нотатка мала б мати автора і час коли була додана
 */
public class Diary {
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
        Diary diary = (Diary) object;
        return Objects.equals(id, diary.id) && Objects.equals(note, diary.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, note);
    }

    @Override
    public String toString() {
        return "Diary{" +
                "id=" + id +
                ", note='" + note + '\'' +
                '}';
    }
}
