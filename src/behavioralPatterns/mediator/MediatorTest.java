package behavioralPatterns.mediator;

/**
 * Ціль: інкапсуляція способу взаємодії багатьох об'єктів
 *
 * Для чого використовуєься: для визначпення об'єкта, який інкапсулює спосіб взаємодії об'єктів і забезпечує
 * слабкого зв'язку між цими об'єктами
 *
 * Приклади використання:
 *
 * - зв'язки між об'єктами важкі та чітко визначені
 * - неможна повторно використовувати об'єкт, так як він обмінюється інформацією з іншмими об'єктами
 * - поведінка, розділена між декількома класами мусить легко налаштовуватися без створення підкласів
 */

public class MediatorTest {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();
        User admin = new Admin(chat, "Admin");
        User user1 = new SimpleUser(chat, "User 1");
        User user2 = new SimpleUser(chat, "User 2");
        User user3 = new SimpleUser(chat, "User 3");

        chat.setAdmin(admin);
        chat.addUserToChar(user1);
        chat.addUserToChar(user2);
        chat.addUserToChar(user3);

        user1.sendMessage("Hello, I am user 1!!!");

        admin.sendMessage("I'm admin. Be afraid of me!!!");

    }
}
