package jdbc.dao.mapper;

import jdbc.dao.dto.UserDTO;
import jdbc.dao.entity.Department;
import jdbc.dao.entity.User;

import java.util.List;
import java.util.stream.Collectors;

public class UserMapper {
    public UserDTO toDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getID());
        userDTO.setName(user.getName());
        userDTO.setSurname(user.getSurname());
        userDTO.setDepartmentName(user.getDepartment().getName());
        return userDTO;
    }
    public User toEntity (UserDTO userDTO) {
        User user = new User();
        user.setID(userDTO.getId());
        user.setName(userDTO.getName());
        user.setSurname(userDTO.getSurname());
//        without id for example purpose
        Department department = new Department();
        department.setName(userDTO.getDepartmentName());
        user.setDepartment(department);
        return user;
    }

    public List<UserDTO> toDTOList(List<User> users) {
        return users.stream().map(
                this :: toDTO
        ).collect(Collectors.toList());
    }
}
