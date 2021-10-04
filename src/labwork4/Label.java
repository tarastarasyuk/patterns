package labwork4;

/**
 * Class Label that represents GUI element Label
 */

public class Label extends ElementGUI{

    /**
     * Receiving GUI library
     * @param library
     */
    public Label(Library library) {
        super(library);
    }

    /**
     * Overriding method from abstract class ElementGUI
     * Pointing out on Label element
     */
    @Override
    public void drawCurrentElement() {
        System.out.print("Label from ");
        super.library.drawElement();
    }
}
