package behavioralPatterns.iterator;

/**
 * Ціль: отримання послідовного доступу до всіх елементів складного об'єкта.
 *
 * Для чого використовується: для отримання доступу до всіх елементів складного об'єкту, ховаючи його внутрішнє предсталвення
 */

public class IteratorTest {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate", "Maven", "PostgreSQL"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Taras", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.println("Skills ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString() + " ");
        }
    }
}
