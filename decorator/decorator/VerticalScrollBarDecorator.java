package decorator.decorator;

import decorator.component.Window;

/**
 * Concrete decorator for vertical scroll bar
 */
public class VerticalScrollBarDecorator extends WindowDecorator{

    public VerticalScrollBarDecorator(Window window) {
        super(window);
    }

    private void drawVerticalScrollBar() {
        super.setDescription(super.getDescription() + " + vertical scrollbar");
    }


    @Override
    public void draw() {
        drawVerticalScrollBar();
        super.draw();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }
}
