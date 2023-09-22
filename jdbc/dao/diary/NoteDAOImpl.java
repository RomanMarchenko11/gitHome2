package jdbc.dao.diary;

import jdbc.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NoteDAOImpl implements  NoteDAO{
    private final Connection connection;
    public NoteDAOImpl() throws SQLException {
        this.connection = DatabaseConnection.getInstance().getConnection();
    }
    @Override
    public Note findById(Integer diaryId) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(EnumQueries.NOTE_FIND_BY_ID.getName())){
            preparedStatement.setInt(1, diaryId);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                Diary diary = new Diary();
                diary.setId(resultSet.getInt("diary_id"));
                diary.setNote(resultSet.getString("diary_note"));

                Note note = new Note();;
                note.setAuthor(resultSet.getString("author"));
                note.setDate(resultSet.getString("date"));
                note.setDiary(diary);
                return note;
            }
        } catch (SQLException e) {
            throw new RuntimeException();
        }
        return null;
    }

    @Override
    public Note update(Note note) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(EnumQueries.NOTE_UPDATE.getName())) {
            preparedStatement.setInt(1, note.getDiary().getId());
            preparedStatement.setString(2, note.getAuthor());
            preparedStatement.setString(3, note.getDate());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException();
        }
        return null;
    }

    @Override
    public Note save(Note note) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(EnumQueries.NOTE_INSERT.getName())) {
            preparedStatement.setInt(1, note.getDiary().getId());
            preparedStatement.setString(2, note.getAuthor());
            preparedStatement.setString(3, note.getDate());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException();
        }
        return null;
    }

    @Override
    public Note delete(Note note) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(EnumQueries.NOTE_DELETE.getName())){
            preparedStatement.setInt(1, note.getDiary().getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException();
        }
        return null;
    }
}
