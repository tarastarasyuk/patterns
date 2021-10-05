package behavioralPatterns.strategy;

/**
 * Ціль: взаємозаміна сімейств класів
 *
 * Для чого використовується: визначення сімейств класів, інкапсулювання кожного з них і огранізація їхньої взаємозамінності
 *
 * Приклал використання:
 *
 * -є декілька спроріднених класів, які відрізняються поведінкою
 * -необхідно мати декілька варіантів поведінки
 * -в класі є дані, про які не має знати клієнт
 * -за допомогою умовних операторів в класі визначено більша кількість можливих поведінок
 *
 *
 * Як можна побачити стратегію:
 * Є інтерфейс та його реалізації
 * Є клас клієнта, що агрегує інтерфейс, для цього поля має сетер
 * Також у клієнтському класі є метод для виконання роботи (execute)
 */

public class StrategyTest {
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.setActivity(new Sleeping());
        developer.executeActivity();

        developer.setActivity(new Training());
        developer.executeActivity();

        developer.setActivity(new Coding());
        developer.executeActivity();

        developer.setActivity(new Reading());
        developer.executeActivity();

        developer.setActivity(new Sleeping());
        developer.executeActivity();
    }
}
