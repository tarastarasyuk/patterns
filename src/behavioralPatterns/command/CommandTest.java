package behavioralPatterns.command;

/**
 * Ціль: інкапсулювання запросу об'єкта
 *
 * Для чого використовується: щоб задати параметри клієнтів для обробки певних запросів, створення черги з цих запросів
 * або їх контролю і підтримки відміни операцій
 *
 * Приклад використання:
 *
 * -параметризація об'єктів певною дією
 * -визначити запрос, поставити в чергу або виконати його в різний час
 */

public class CommandTest {
    public static void main(String[] args) {
        Database database = new Database();

        Developer developer = new Developer(
                new InsertCommand(database),
                new SelectCommand(database),
                new UpdateCommand(database),
                new DeleteCommand(database)
        );

        developer.insertRecord();
        developer.updateRecord();
        developer.selectRecord();
        developer.deleteRecord();
    }
}
