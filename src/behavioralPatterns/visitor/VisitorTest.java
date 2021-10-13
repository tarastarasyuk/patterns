package behavioralPatterns.visitor;

/**
 * Ціль: опис дій, які виконуються с кожним об'єктом в певній структурі
 *
 * Для чого використовується: опис операцій які виконуються з кожним об'єктом з певної структури. Дозволяє
 * визначити нову операцію без зміни класів цих об'єктів
 *
 * Приклад використання:
 *
 * -в структурі є об'єкти багатьох класів з різними інтерфейсами і нам необхідно виконати над ними
 * операції, які залежать від конкретних класів
 *
 * -необіхдно виконати не зв'язані між собою оперції  над об'єктами, які входять в склад структури і ми
 * не хочимо добавляти ці операції в класи
 *
 * -класи, які встановлюють структуру обє'ктів рідко змінюється, але часто добавляються нові операції над цією
 * структурою
 */

public class VisitorTest {
    public static void main(String[] args) {
        Project project = new Project();

        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();

        System.out.println("Junior in action");
        project.beWritten(junior);

        System.out.println("=====");

        System.out.println("Senior in action");
        project.beWritten(senior);
    }
}
