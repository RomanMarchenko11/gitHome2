public class Student {
//    Створити клас, який описує студента
    private String name;
    private String numStudentTicket;
    private double averageMark;
    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Error: Вкажіть ім'я студента");
        }
    }
    public void setNumStudentTicket(String numStudentTicket) {
        if (isNumeric(numStudentTicket)) {
            this.numStudentTicket = numStudentTicket;
        } else {
            System.out.println("Error: Вкажіть номер квитка студента");
        }
    }
    public void setAverageMark(double averageMark) {
        if (averageMark >= 0 && averageMark < 100) {
            this.averageMark = averageMark;
        } else {
            System.out.println("Error: Вкажіть середній бал студента (від 0 до 100)");
        }
    }
    public String getName() {
        return name;
    }
    public String getNumStudentTicket() {
        return numStudentTicket;
    }
    public double getAverageMark() {
        return averageMark;
    }
    private boolean isNumeric(String str) {
        return str.matches("\\d+");
    }
}

