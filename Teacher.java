public class Teacher {
//    1. Створити клас для опису викладача
    private String name;
    private String surname;
    private int age;
    private Student student = new Student();

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }
    public Student getStudent() { return student; }

    public void setName(String name) { this.name = name; }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setAge(int age) {
        if (age > 20 && age <60) {
            this.age = age;
        } else {
            System.out.println("Необхідно призначити нового вчителя.");
        }
    }
    public void setStudent(Student student) { this.student = student; }
}
