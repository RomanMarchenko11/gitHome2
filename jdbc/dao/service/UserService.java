package jdbc.dao.service;

import jdbc.dao.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO findById(Integer id);
    UserDTO save(UserDTO userDTO);
    UserDTO update(UserDTO userDTO);
    UserDTO delete(UserDTO userDTO);
    List<UserDTO> findAll();

}
