package flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Ціль: підтримка великої кількості об'єктів
 *
 * Для чого: для пітримки великої кількості об'єктів, використовуючи розподілення
 *
 * Приклади використання:
 * -коли використовуєш багато об'єктів
 * -велику к-кість об'єктів можна винести на поверхню?
 * -програма не залежить від ідентичонті об'єкта
 *
 * Як реалізовано:
 * -є фабрика, яка створює об'єкти по мірі надходження - перший раз, а потім їх просто перевикориствоує
 */


public class FlyweightTest {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();
        List<Developer> developers = new ArrayList<>();

        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("c++"));
        developers.add(developerFactory.getDeveloperBySpeciality("c++"));
        developers.add(developerFactory.getDeveloperBySpeciality("c++"));
        developers.add(developerFactory.getDeveloperBySpeciality("c++"));
        developers.add(developerFactory.getDeveloperBySpeciality("java"));

        Developer d1 = developerFactory.getDeveloperBySpeciality("java");
        Developer d2 = developerFactory.getDeveloperBySpeciality("java");


        for (Developer developer: developers) {
            developer.writeCode();
        }
    }
}
