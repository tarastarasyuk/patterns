package behavioralPatterns.observer;

/**
 * Ціль: визначення залежності "один до багатьох" між об'єктами
 *
 * Для чого використовується: визначення залежності "один до багатьох" таким чином, щоб
 * при зміні стану одного об'єкта всі залжені від нього об'єкти були повідомлені про це та обновилися
 *
 * Приклади використання:
 * - коли у моделі є два аспекти, один з яких залежить від іншого. Інкапсулювання цих аспектів
 * в різні класи дозволяють використовувати їх незлажено один від одного
 * - коли один об'єкт мусить сповіщати інші і не робити припущень - що це за об'єкти
 * - ослаблення зв'язків між об'єктами
 */

public class ObserverTest {
    public static void main(String[] args) {
        System.out.println("");
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();
        jobSite.addVacancy("First Java Position");
        jobSite.addVacancy("Second Java Position");

        Observer firstSubscriber = new Subscriber("Taras Tarasyuk");
        Observer secondSubscriber = new Subscriber("Anton Kuttsevych");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Third Java Position");

        jobSite.removeVacancy("First Java Position");

    }
}
