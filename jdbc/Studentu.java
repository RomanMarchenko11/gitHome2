package jdbc;

import java.util.Objects;

public class Studentu {
    private String name;
    private String surname;
    private int age;
    private String groupID;

    public Studentu(String name, String surname, int age, String groupID) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.groupID = groupID;
    }
    public Studentu() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Studentu studentu = (Studentu) object;
        return age == studentu.age && Objects.equals(name, studentu.name) && Objects.equals(surname, studentu.surname) && Objects.equals(groupID, studentu.groupID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, groupID);
    }

    @Override
    public String toString() {
        return "Student {" +
                "name= '" + name + '\'' +
                ", surname= '" + surname + '\'' +
                ", age= " + age +
                ", groupID= '" + groupID + '\'' +
                '}';
    }
}
