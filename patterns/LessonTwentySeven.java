package patterns;

import patterns.Factory.Lego;
import patterns.Factory.LegoFabric;
import patterns.Factory.LegoTypes;
import patterns.proxy.DailyScheduleProxy;
import patterns.proxy.Schedule;
import patterns.singletone.Singleton;

public class LessonTwentySeven {
    /*
    1. Зробити реалізацію наступних патернів : фабрика / сінглтон
    2. Проксі
     */
    public static void main(String[] args) {
//    Fabric
        /*
        Абстрактна фабрика — це породжувальний патерн проектування, що дає змогу створювати сімейства
        пов’язаних об’єктів, не прив’язуючись до конкретних класів створюваних об’єктів.
         */

        LegoFabric fabric = new LegoFabric();
        Lego city = fabric.Choice(LegoTypes.CITY);
        city.carCreate();
        city.shipCreate();
        Lego mineCraft = fabric.Choice(LegoTypes.MINECRAFT);
        mineCraft.carCreate();
        mineCraft.shipCreate();
        Lego starWars = fabric.Choice(LegoTypes.STARWARS);
        starWars.carCreate();
        starWars.shipCreate();

//    Proxy
        /*
        Патерн Замісник застосовується в коді на Java тоді, коли потрібно замінити дійсний об’єкт його сурогатом,
        причому, непомітно для клієнтів цього об’єкта. Це дозволить виконати додаткові поведінки до або після основної
        поведінки дійсного об’єкта.
         */
        Schedule schedule = new DailyScheduleProxy();
        schedule.makeTask();

//    SingleTone
        /*
        Одинак — це породжувальний патерн проектування, який гарантує, що клас має лише один екземпляр,
        та надає глобальну точку доступу до нього.
        */
        Singleton single = Singleton.getInstance();
        Singleton tone = Singleton.getInstance();
        single.hello();
        tone.hello();

        System.out.println(single.counter);
        single.counter = 100;
        System.out.println(tone.counter);
    }

}
