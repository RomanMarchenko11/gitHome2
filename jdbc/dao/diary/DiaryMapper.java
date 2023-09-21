package jdbc.dao.diary;

import java.util.List;
import java.util.stream.Collectors;

public class DiaryMapper {

    public DiaryDTO toDTO(Diary diary) {
        DiaryDTO diaryDTO = new DiaryDTO();
        diaryDTO.setId(diary.getId());
        diaryDTO.setNote(diary.getNote());
        return diaryDTO;
    }

    public Diary toEntity(DiaryDTO diaryDTO) {
        Diary diary = new Diary();
        diary.setId(diaryDTO.getId());
        diary.setNote(diaryDTO.getNote());
        return diary;
    }

    public List<DiaryDTO> toDTOList(List<Diary> diaries) {
        return diaries.stream().map(this::toDTO).collect(Collectors.toList());
    }
}
