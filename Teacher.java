import javax.xml.namespace.QName;

public class Teacher {
//    1. Створити клас для опису викладача
    private String name;
    private String subject;
    private int age;
    public String getName() {
        return name;
    }
    public String getSubject() {
        return subject;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void setAge(int age) {
        if (age > 20 && age <60) {
            this.age = age;
        }
    }
}
