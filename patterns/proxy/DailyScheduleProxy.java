package patterns.proxy;

public class DailyScheduleProxy implements Schedule{
    Schedule schedule = new DailySchedule();
    public void makeTask(){
        System.out.println("Виконання Proxy завдань!");
        schedule.makeTask();
    }
}
