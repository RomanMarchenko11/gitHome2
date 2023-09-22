package jdbc.dao.constants;

public enum Queries {
    USER_INSERT("INSERT INTO users (name, surname, department_id) VALUES (?, ?, ?)"),
    USER_UPDATE("UPDATE users SET name = ?, surname = ?, department_id = ? WHERE ID = ?"),
    USER_DELETE("DELETE FROM users WHERE id = ?"),
    USER_FIND_BY_ID("SELECT u.id, u.name, u.surname, d.id as department_id, d.name as department_name " +
            "FROM USERS u " +
            "JOIN departments d ON u.department_id = d.id " +
            "WRERE u.id = ?"),
    USER_FIND_ALL("SELECT u.id as user_id, u.name as user_name, u.surname, d.id as department_id, d.name as department_name " +
            "FROM USERS u " +
            "JOIN departments d ON u.department_id = d.id " +
            "WRERE u.id = ?");


    private String name;
    Queries(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
