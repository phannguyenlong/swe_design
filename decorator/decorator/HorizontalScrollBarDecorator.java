package decorator.decorator;

import decorator.component.Window;

/**
 * Concrete decorator for horizontal scroll bar
 */
public class HorizontalScrollBarDecorator extends WindowDecorator{
    
    public HorizontalScrollBarDecorator(Window window) {
        super(window);

    }
    
    private void drawHorizontalScrollBar() {
        super.setDescription(super.getDescription() + " + horizontal scrollbar");
    }

    @Override
    public void draw() {
        drawHorizontalScrollBar();
        super.draw();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }
}
