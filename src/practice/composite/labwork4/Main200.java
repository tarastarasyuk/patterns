package practice.composite.labwork4;

/**
 * Class Main200 with entry point
 * Main200 demonstrates work of Bridge pattern
 * @author Taras
 */

public class Main200 {
    public static void main(String[] args) {
        /**
         * Example of changing realization of the element:
         */
        System.out.println("===========");
        ElementGUI button1 = new Button(new QtImpl());
        button1.drawCurrentElement();

        button1 = new Button(new GTKImpl());
        button1.drawCurrentElement();

        System.out.println("===========");

        ElementGUI window1 = new Window(new QtImpl());
        ElementGUI label1 = new Label(new QtImpl());
        ElementGUI window2 = new Label(new GTKImpl());
        ElementGUI label2 = new Label(new GTKImpl());

        window1.drawCurrentElement();
        label1.drawCurrentElement();
        window2.drawCurrentElement();
        label2.drawCurrentElement();

    }
}
