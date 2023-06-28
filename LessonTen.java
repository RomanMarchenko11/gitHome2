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

    }
}
