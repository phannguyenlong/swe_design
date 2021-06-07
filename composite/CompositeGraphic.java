package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite component
 * It is a note that has many leaf
 */
public class CompositeGraphic implements Graphic {
    private List<Graphic> childGraphic = new ArrayList<>();
    private String name;

    public CompositeGraphic(String name) {
        this.name = name;
    }

    /**
     * add leaf (which can't have child) to node
     */
    //add 1 leaf
    public void add(Graphic graphic) {
        childGraphic.add(graphic);
    }
    // add list of leafs
    public void add(List<Graphic> graphics) {
        childGraphic.addAll(graphics);
    }

    /**
     * This mean add another comosite (node) into this node
     * increase the tree level 
     */
    public void AddCompositeGraphic(CompositeGraphic compositeGraphic) {
        childGraphic.add(compositeGraphic);
    }
    
    @Override
    public void print() {
        System.out.println("I am compositeGraphic" + name);
        for (Graphic child : childGraphic) 
            child.print();
    }
}
