package behavioralPatterns.chainOfResponsibility.loggerExample;

/**
 * Ціль: зв'язування об'єктів-отримувачів в ланцюг і передача запросів по ньому
 *
 * Для чого використовується: допомагає уникнути прив'язки відправника запросу до його отримувача, що дає можливість обробити
 * даний запрос кількома об'єктами
 *
 * Приклади використання:
 *
 * -послаблення прив'язаності (об'єкт не мусить знати, хто саме опрацює його запрос)
 * -додаткова гнучкість при розподіллі обов'язків між об'єктами
 */

public class ChainOfResponsibilityTest {
    public static void main(String[] args) {
        SMSLogger smsLogger = new SMSLogger(Level.ERROR);
        FileLogger fileLogger = new FileLogger(Level.DEBUG);
        EmailLogger emailLogger = new EmailLogger(Level.INFO);
        smsLogger.setNext(fileLogger);
        fileLogger.setNext(emailLogger);
        smsLogger.writeMessage("All is good.",Level.INFO);
        System.out.println("");
        smsLogger.writeMessage("debugging...", Level.DEBUG);
        System.out.println("");
        smsLogger.writeMessage("The system is down!", Level.ERROR);
    }
}

class Level {
    public static final int ERROR = 1;
    public static final int DEBUG = 2;
    public static final int INFO = 3;
}

abstract class Logger {
    private final int priority;
    private Logger next;

    public Logger(int priority) {
        this.priority = priority;
    }

    public void setNext(Logger next) {
        this.next = next;
    }

    void writeMessage(String message, int level) {
        if (level <= priority) {
            write(message);
        }
        if (next != null) {
            next.writeMessage(message, level);
        }
    }

    public abstract void write(String message);
}

class SMSLogger extends Logger {

    public SMSLogger(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("SMS: " + message);
    }
}

class FileLogger extends Logger {

    public FileLogger(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("File writing: " + message);
    }
}

class EmailLogger extends Logger {

    public EmailLogger(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Email message: " + message);
    }
}