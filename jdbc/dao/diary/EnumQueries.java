package jdbc.dao.diary;

public enum EnumQueries {
    NOTE_INSERT("INSERT INTO notes (author, date, diary_id) VALUES (?, ?, ?)"),
    NOTE_UPDATE("UPDATE notes SET author = ?, date = ?, diary_id = ? WHERE ID = ?"),
    NOTE_DELETE("DELETE FROM notes WHERE id = ?"),
    NOTE_FIND_BY_ID("SELECT n.author, n.date, n.id as diary_id, d.id as diary_id " +
            "FROM NOTES n " +
            "JOIN diary d ON n.diary_id = d.id " +
            "WRERE n.id = ?"),
    NOTE_FIND_ALL("SELECT n.id as note_id, n.author as note_author, u.surname, u.id as diary_id, d.note as diary_note " +
            "FROM NOTES n " +
            "JOIN diary d ON u.diary_id = d.id " +
            "WRERE n.id = ?"),
    DIARY_INSERT("INSERT INTO diary (id, note) VALUES (?, ?)"),
    DIARY_UPDATE("UPDATE diary SET id = ?, note = ? WHERE ID = ?"),
    DIARY_DELETE("DELETE FROM diary WHERE id = ?"),
    DIARY_FIND_BY_ID("SELECT d.id, d.note as diary_id, d.id as diary_id " +
                            "FROM DIARY d " +
                            "JOIN diary d ON n.diary_id = d.id " +
                            "WRERE n.id = ?"),
    DIARY_FIND_ALL("SELECT u.id as user_id, u.name as user_name, u.surname, d.id as diary_id, d.note as diary_note " +
                          "FROM NOTES n " +
                          "JOIN diary d ON u.diary_id = d.id " +
                          "WRERE u.id = ?");

    private String name;
    EnumQueries(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
