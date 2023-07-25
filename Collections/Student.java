package Collections;

public class Student {
    String name;
    String surname;
    int course;


    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
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

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Студент {" +
                "ім'я = '" + name + '\'' +
                ", фамілія = '" + surname + '\'' +
                ", курс = " + course +
                "}";
    }
}
