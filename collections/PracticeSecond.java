package collections;

import java.util.LinkedList;

public class PracticeSecond implements PracticeTask {
    /*
    2 Журнал останніх дій" (LinkedList)
Спробуйте створити програму, яка використовує LinkedList для створення журналу останніх дій користувача.
Користувач може виконувати дії та записувати їх в журнал, причому максимальний розмір журналу
повинен бути обмежений (наприклад, 5 дій). Коли користувач додає нову дію, і якщо розмір журналу перевищує
максимальний розмір, то найстаріша дія видаляється з журналу.
Програма також повинна надавати можливість користувачу переглянути останні дії.
 */
    private static final int MAX_ACTIONS = 5;
    private LinkedList<String> actions = new LinkedList();

    @Override
    public void task() {
        addAction("1");
        addAction("2");
        addAction("3");
        addAction("4");
        addAction("5");
        printAction();
        addAction("6");
        printAction();
    }

    private void addAction (String action) {
        if (actions.size() == MAX_ACTIONS) {
            actions.removeFirst();
        }
        actions.addLast(action);
    }

    private void printAction() {
        System.out.println("Останні дії:");
        for (String action: actions) {
            System.out.print(action + " ");
        }
        System.out.println();
    }
}
