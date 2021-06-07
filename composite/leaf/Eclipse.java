package composite.leaf;

import composite.Graphic;

public class Eclipse implements Graphic {
    private String name;
    
    public Eclipse(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("I am ecplise" + name);       
    }
}
