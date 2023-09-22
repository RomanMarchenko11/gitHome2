package jdbc.dao.diary;

import java.util.List;

public interface DiaryDAO {
    Diary findById(Integer diaryId);
    Diary update(Diary diary);
    Diary save(Diary diary);
    Diary delete(Diary diary);
    List<Diary> findAll();
}
