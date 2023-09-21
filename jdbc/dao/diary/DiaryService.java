package jdbc.dao.diary;

import java.sql.SQLException;
import java.util.List;

public class DiaryService {
    private final DiaryDAO diaryDAO;
    private final DiaryMapper diaryMapper;

    public DiaryService() throws SQLException {
        this.diaryDAO = new DiaryDAOImpl();
        this.diaryMapper = new DiaryMapper();
    }

    public DiaryDTO findById(Integer id) {return diaryMapper.toDTO(diaryDAO.findById(id));}

    public DiaryDTO save(DiaryDTO diaryDTO) {return diaryMapper.toDTO(diaryDAO.save(diaryMapper.toEntity((diaryDTO))));}

    public DiaryDTO update(DiaryDTO diaryDTO) {return diaryMapper.toDTO(diaryDAO.save(diaryMapper.toEntity(diaryDTO)));}

    public DiaryDTO delete(DiaryDTO diaryDTO) {return diaryMapper.toDTO(diaryDAO.save(diaryMapper.toEntity(diaryDTO)));}

    public List<DiaryDTO> findAll() {return diaryMapper.toDTOList(diaryDAO.findAll());
    }
}
