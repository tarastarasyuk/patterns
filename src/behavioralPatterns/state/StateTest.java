package behavioralPatterns.state;

/**
 * Ціль: керування поведінкою об'єкта в залженості від стану
 *
 * Для чого використовується: дозволяє керувати поведінкою об'єкта в залженості від
 * внутрішнього стану об'єкта
 *
 * Приклади застовсування:
 *
 * -поведінка об'єкта залежить від його стану і змінюється під час виконання
 * -коли зустрічається велика кілкість умовних операторів, коли вибір умови залежить від стану об'єкта
 *
 * Є два типи State
 *      1) коли стан змінюється в контексті (в даному випадку в класі Developer)
 *      2) зміна станів відбувається у самих станах
 *      (детальнішн у stateExample)
 */

public class StateTest {
    public static void main(String[] args) {
        Activity activity = new Sleeping();
        Developer developer = new Developer();

        developer.setActivity(activity);

        for (int i = 0; i < 10; i++) {
            developer.justDoIt();
            developer.changeActivity();
        }
    }
}
