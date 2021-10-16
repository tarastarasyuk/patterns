package behavioralPatterns.memento;

/**
 * Ціль: зберегти внутрішній стан об'єкту за його межі
 *
 * Для чого використовується: фіксування внутрішнього стану об'єкта за його межами не порушуючи
 * інкапсуляцію і відновлення об'єкта у випадку необхідності
 *
 * Приклад використання:
 *
 * -необхідно зберегти поточний стан об'єкта або його чатини і відновити в майбутньому, але
 * пряме отримання стану розкриває деталі реалізації і порушує інкапсуляцію об'єкта
 *
 *
 * (ХРАНИТЕЛЬ)
 */

public class MementoTest {
    public static void main(String[] args) {
        Project project = new Project();
        GitHubRepo gitHubRepo = new GitHubRepo();

        System.out.println("Creating a new project. Version 1.0");
        project.setVersionAndDate("Version 1.0");
        System.out.println(project);

        System.out.println("Saving current version to github...");
        gitHubRepo.setSave(project.save());

        System.out.println("Updating project to Version 1.1");

        System.out.println("Writing poor code...");

        project.setVersionAndDate("Version 1.1");

        System.out.println(project);

        System.out.println("Sth went wrong...");

        System.out.println("Rolling back to version 1.1");

        project.load(gitHubRepo.getSave());

        System.out.println("Project after rollback:");
        System.out.println(project);
    }
}
