package facade.firstImpl;

/**
 * Ціль: надати уніфікований інтерфейс замість деклькох інтрефейсів підсистеми
 *
 * Для чого використовується: для визначення интерфейсу високого рівня, який спрощує використання підсистеми
 *
 * Приклад:
 * -ізолювання клієнтів від компонентів підсистеми, спрошуючи роботу з підсистемою
 * -необхідність ослаблення зв'язаності підсистеми з клієнтами
 *
 * Моє розуміння: додатковий клас, який виконує всю роботу
 */

public class FacadeTest {
    public static void main(String[] args) {

        /**
         * Before facade
         */
        Job job = new Job();
        job.doJob();

        BugTracker bugTracker = new BugTracker();
        bugTracker.startSprint();
        Developer developer = new Developer();
        developer.doJobBeforeDeadline(bugTracker);

        bugTracker.finishSprint();
        developer.doJobBeforeDeadline(bugTracker);
//        Workflow workflow = new Workflow();
//
//        workflow.solveProblems();
    }
}
