package labwork4;

/**
 * Class Button that represents GUI element Button
 */

public class Button extends ElementGUI {
    /**
     * Receiving GUI library
     * @param library
     */
    public Button(Library library) {
        super(library);
    }

    /**
     * Overriding method from abstract class ElementGUI
     * Pointing out on Button element
     */
    @Override
    public void drawCurrentElement() {
        System.out.print("Button from ");
        super.library.drawElement();
    }

}
