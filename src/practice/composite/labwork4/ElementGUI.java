package practice.composite.labwork4;

/**
 * Abstraction for different GUI elements
 */

public abstract class ElementGUI {
    /**
     * Field library is created for GUI library that will draw element
     */
    protected Library library;

    /**
     * Getting GUI library
     * @param library
     */
    public ElementGUI(Library library) {
        this.library = library;
    }

    /**
     * Abstract method for drawing current GUI element
     */
    public abstract void drawCurrentElement();
}
