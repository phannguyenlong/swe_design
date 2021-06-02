package decorator.decorator;

import decorator.component.Window;

/**
 * Docrator class 
 * It is abstract so that it can allow derived class to override its function
 */
public abstract class WindowDecorator implements Window {
    private Window decoratedWindow; // window need to decorated

    protected WindowDecorator(Window window) {
        this.decoratedWindow = window;
    }

    @Override
    public void setDescription(String description) {
        decoratedWindow.setDescription(description);
    }

    @Override
    public void draw() {
        decoratedWindow.draw();
    }

    @Override
    public String getDescription() {
        return decoratedWindow.getDescription();
    }
}
