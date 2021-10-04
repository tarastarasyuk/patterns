package labwork4;

/**
 * Class Window that represents GUI element Window
 */

public class Window extends ElementGUI {
    /**
     * Receiving GUI library
     * @param library
     */
    public Window(Library library) {
        super(library);
    }

    /**
     * Overriding method from abstract class ElementGUI
     * Pointing out on Window element
     */
    @Override
    public void drawCurrentElement() {
        System.out.print("Window from ");
        super.library.drawElement();
    }
}
