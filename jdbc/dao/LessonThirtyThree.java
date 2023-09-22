package jdbc.dao;

import jdbc.dao.diary.DiaryService;
import jdbc.dao.diary.NoteService;
import jdbc.dao.service.UserService;
import jdbc.dao.service.UserServiceImpl;

import java.sql.SQLException;

public class LessonThirtyThree {

    public static void main(String[] args) throws SQLException {
//    DAO
        UserService userService = new UserServiceImpl();
        userService.findAll();

        DiaryService diaryService = new DiaryService();
        NoteService noteService = new NoteService();
    }
}
