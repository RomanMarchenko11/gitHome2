package jdbc.dao.db;

import jdbc.dao.entity.User;

import java.util.List;

public interface UserDAO {
    User findByID(Integer id);
    User update(User user);
    User save(User user);
    User delete(User user);
    List<User> findAll();
}
