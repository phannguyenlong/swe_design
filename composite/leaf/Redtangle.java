package composite.leaf;

import composite.Graphic;

public class Redtangle implements Graphic {
    private String name;

    public Redtangle(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("I am redtangle" + name);
    }
}
