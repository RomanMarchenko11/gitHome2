package jdbc.dao.service;

import jdbc.dao.db.UserDAO;
import jdbc.dao.db.UserDAOImpl;
import jdbc.dao.dto.UserDTO;
import jdbc.dao.mapper.UserMapper;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService{
    private final UserDAO userDAO;
    private final UserMapper userMapper;

    public UserServiceImpl() throws SQLException {
        this.userDAO = new UserDAOImpl();
        this.userMapper = new UserMapper();
    }
    @Override
    public UserDTO findById(Integer id) {
        return userMapper.toDTO(userDAO.findByID(id));
    }

    @Override
    public UserDTO save(UserDTO userDTO) {
        return userMapper.toDTO(userDAO.save(userMapper.toEntity((userDTO))));
    }

    @Override
    public UserDTO update(UserDTO userDTO) {
        return userMapper.toDTO(userDAO.save(userMapper.toEntity(userDTO)));
    }

    @Override
    public UserDTO delete(UserDTO userDTO) {
        return userMapper.toDTO(userDAO.save(userMapper.toEntity(userDTO)));
    }

    @Override
    public List<UserDTO> findAll() {

        return userMapper.toDTOList(userDAO.findAll());
    }
}
