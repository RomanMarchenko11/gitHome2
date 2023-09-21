package jdbc.dao.diary;

import java.util.List;
import java.util.stream.Collectors;

public class NoteMapper {

    public NoteDTO toDTO(Note note) {
        NoteDTO noteDTO = new NoteDTO();
        noteDTO.setAuthor(note.getAuthor());
        noteDTO.setDate(noteDTO.getDate());
        noteDTO.setDiaryId(note.getDiary().getId());
        return noteDTO;
    }

    public Note toEntity (NoteDTO noteDTO) {
        Note note = new Note();
        note.setAuthor(noteDTO.getAuthor());
        note.setDate(noteDTO.getDate());
//        without id for example purpose
        Diary diary = new Diary();
        diary.setId(noteDTO.getDiaryId());
        note.setDiary(diary);
        return note;
    }

    public List<NoteDTO> toDTOList(List<Note> notes) {
        return notes.stream().map(
                this :: toDTO
        ).collect(Collectors.toList());
    }
}
