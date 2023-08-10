package streamAPI;

import java.util.Objects;

public class Student {
    private String surname;
    private int averageGrade;

    public Student(String surname, int averageGrade) {
        this.surname = surname;
        this.averageGrade = averageGrade;
    }
    public Student() {

    }
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public  int getAverageGrade() {
        return averageGrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return averageGrade == student.averageGrade && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, averageGrade);
    }

    public void setAverageGrade(int averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student {" +
                "surname= '" + surname + '\'' +
                ", averageGrade= " + averageGrade +
                " }";
    }
}
