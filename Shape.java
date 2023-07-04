public class Shape {
    /*
                Створіть базовий клас Shape з методом area(). Створіть дочірні класи Rectangle та Circle,
            поля (довжину, висота)
             які перевизначають метод area(довжину,висота*2).
             які перевизначають метод area(довжину,висота*3).
     */
    protected int widht = 4;
    protected int lenght = 5;

//    public Shape(int widht, int lenght) {
//        this.widht;
//        this.lenght;
//    }
    public void area () {
        System.out.println("Main Area: " + widht * lenght);
    }
}
