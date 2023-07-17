public interface FlyingObject {
    /*
Створіть інтерфейс "FlyingObject" з методами "takeOff()", "land()" та "fly()".
Створіть інтерфейс "Steerable", який розширює "FlyingObject" та додає метод "steer()".
Створіть два класи: "Airplane" та "Bird", які реалізують інтерфейс "Steerable".
"Airplane" повинен мати додатковий метод "turnOnEngine()", а "Bird" - метод "nest()"
     */
    void takeoff();
    void land();
    void fly();
}
