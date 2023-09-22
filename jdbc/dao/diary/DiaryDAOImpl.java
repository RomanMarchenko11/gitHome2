package jdbc.dao.diary;

import jdbc.DatabaseConnection;
import jdbc.dao.constants.Queries;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DiaryDAOImpl implements DiaryDAO {
    private final Connection connection;

    public DiaryDAOImpl() throws SQLException {
        this.connection = DatabaseConnection.getInstance().getConnection();
    }

    @Override
    public Diary findById(Integer diaryID) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.USER_FIND_BY_ID.getName())) {
            preparedStatement.setInt(1, diaryID);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                Diary diary = new Diary();
                diary.setId(resultSet.getInt("diary_id"));
                diary.setNote(resultSet.getString("diary_note"));

                Note note = new Note();
                note.setDiary(diary);
                note.setAuthor(resultSet.getString("author"));
                note.setDate(resultSet.getString("date"));
                return diary;
            }
        } catch (SQLException e) {
            throw new RuntimeException();
        }
        return null;
    }

    @Override
    public Diary update(Diary diary) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(EnumQueries.DIARY_UPDATE.getName())) {
            preparedStatement.setInt(1, diary.getId());
            preparedStatement.setString(2, diary.getNote());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException();
        }
        return null;
    }

    @Override
    public Diary save(Diary diary) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(EnumQueries.DIARY_INSERT.getName())) {
            preparedStatement.setInt(1, diary.getId());
            preparedStatement.setString(2, diary.getNote());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException();
        }
        return null;
    }

    @Override
    public Diary delete(Diary diary) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(EnumQueries.DIARY_DELETE.getName())) {
            preparedStatement.setInt(1, diary.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException();
        }
        return null;
    }

    @Override
    public List<Diary> findAll() {
        List<Diary> diaryList = new ArrayList<>();
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(Queries.USER_FIND_ALL.getName())) {
            Diary diary = new Diary();
            diary.setId(resultSet.getInt("diary_id"));
            diary.setNote(resultSet.getString("diary_note"));

            Note note = new Note();
            note.setDiary(diary);
            note.setAuthor(resultSet.getString("note_author"));
            note.setDate(resultSet.getString("note_date"));

            diaryList.add(diary);
        } catch (SQLException e) {
            throw new RuntimeException();
        }
        return null;
    }
}
