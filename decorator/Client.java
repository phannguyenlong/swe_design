package decorator;

import decorator.component.SimpleWindow;
import decorator.component.Window;
import decorator.decorator.HorizontalScrollBarDecorator;
import decorator.decorator.VerticalScrollBarDecorator;

public class Client {
    public static void main(String[] args) {
        Window simpleWindow = new SimpleWindow();
        Window anotherSimpleWindow = new SimpleWindow();

        System.out.println("\n===================Simple window===================");
        // simple window
        simpleWindow.draw();
        System.out.println("Description: " + simpleWindow.getDescription());

        System.out.println("\n====================with Verical==================");
        // simpel window with vertical scrollbar
        Window vScrollWindow = new VerticalScrollBarDecorator(simpleWindow);
        vScrollWindow.draw();
        System.out.println("Description: " + vScrollWindow.getDescription());

        /**
         * Cause java pass object by refference 
         * ==> simpleWindow object update over decorator
         */
        System.out.println("\n===================with vertical and horizontal===================");
        // simple window with fulll scrollbar
        Window fullWindow= new HorizontalScrollBarDecorator(simpleWindow);
        fullWindow.draw();
        System.out.println("Description: " + fullWindow.getDescription());
        
        System.out.println("\n===================with horizontal===================");
        // simple window with horizontal scrollbar
        Window hScrollWindow = new HorizontalScrollBarDecorator(anotherSimpleWindow);
        hScrollWindow.draw();
        System.out.println("Description: " + hScrollWindow.getDescription());
    }    
}
