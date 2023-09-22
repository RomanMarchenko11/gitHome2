package jdbc.dao.diary;

public interface NoteDAO {
    Note findById(Integer id);
    Note update(Note note);
    Note save(Note note);
    Note delete(Note note);
}
