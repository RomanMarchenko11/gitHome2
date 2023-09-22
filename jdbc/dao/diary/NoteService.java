package jdbc.dao.diary;

import java.sql.SQLException;
import java.util.List;

public class NoteService {
    private final NoteDAO noteDAO;
    private final NoteMapper noteMapper;

    public NoteService() throws SQLException {
        this.noteDAO = new NoteDAOImpl();
        this.noteMapper = new NoteMapper();
    }

    public NoteDTO findById(Integer id) {return noteMapper.toDTO(noteDAO.findById(id));}

    public NoteDTO save(NoteDTO noteDTO) {return noteMapper.toDTO(noteDAO.save(noteMapper.toEntity((noteDTO))));}

    public NoteDTO update(NoteDTO noteDTO) {return noteMapper.toDTO(noteDAO.save(noteMapper.toEntity(noteDTO)));}

    public NoteDTO delete(NoteDTO noteDTO) {return noteMapper.toDTO(noteDAO.save(noteMapper.toEntity(noteDTO)));}

}
