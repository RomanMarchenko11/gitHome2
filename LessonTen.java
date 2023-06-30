public class LessonTen {
    public static void main(String[] args) {
//        Визначаємо викладача
        Teacher teacher = new Teacher();
        teacher.setName("Олег Степанович");
        teacher.setSubject("Хімія");
        teacher.setAge(45);
        System.out.println("Предмет: " + teacher.getSubject() + ". Викладач: " + teacher.getName() + ", " + teacher.getAge() +  " років.\n");
//        Визначаємо студентів
        Student valiko = new Student();
        valiko.setName("Валентин");
        valiko.setNumStudentTicket("345");
        valiko.setAverageMark(55.57);
        System.out.println("Студенти курсу:");
        System.out.println(valiko.getName() + ", квиток № " + valiko.getNumStudentTicket() + ", середній бал: " + valiko.getAverageMark() + "\n");

        Student ryslan = new Student();
        ryslan.setName("");
        ryslan.setNumStudentTicket("R342");
        ryslan.setAverageMark(110);

//        Створюємо групу студентів (10 чол.)
        Student[] groupOfStudents = new Student[10];

        groupOfStudents[0] = new Student();
        groupOfStudents[0].setName("Августін");
        groupOfStudents[0].setNumStudentTicket("350");
        groupOfStudents[0].setAverageMark(55);

        groupOfStudents[1] = valiko;

        groupOfStudents[2] = new Student();
        groupOfStudents[2].setName("Назар");
        groupOfStudents[2].setNumStudentTicket("400");
        groupOfStudents[2].setAverageMark(65);

        groupOfStudents[3] = new Student();
        groupOfStudents[3].setName("Микита");
        groupOfStudents[3].setNumStudentTicket("402");
        groupOfStudents[3].setAverageMark(70);

        System.out.println("Група стундентів:");
        for (int i = 0; i <4; i++) {
            System.out.print("Студент: " + groupOfStudents[i].getName());
            System.out.print(", № квитка: " + groupOfStudents[i].getNumStudentTicket());
            System.out.print(", Середня річна оцінка: " + groupOfStudents[i].getAverageMark()+";\n");
        }
    }
}
