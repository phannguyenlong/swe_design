package composite;

import composite.leaf.Eclipse;
import composite.leaf.Redtangle;

public class Client {
    public static void main(String[] args) {
        Eclipse eclipse1 = new Eclipse("1");
        Eclipse eclipse2 = new Eclipse("2");

        CompositeGraphic compositeGraphic1 = new CompositeGraphic("1");
        compositeGraphic1.add(eclipse1);
        compositeGraphic1.add(eclipse2);

        // compostie with 2 leaf
        System.out.println("\n// composite with 2 leaf");
        compositeGraphic1.print();

        Redtangle redtangle1 = new Redtangle("1");
        Redtangle redtangle2 = new Redtangle("2");
        
        CompositeGraphic compositeGraphic2 = new CompositeGraphic("2");
        compositeGraphic2.add(redtangle1);
        compositeGraphic2.add(redtangle2);

        // composite with 2 another leaf
        System.out.println("\n// composite with 2 another leaf");
        compositeGraphic2.print();

        // add composit2 to be child of composite1
        compositeGraphic1.AddCompositeGraphic(compositeGraphic2);

        // composite with 2 leaf a 1 child composite 
        System.out.println("\n// composite with 2 leaf a 1 child composite ");
        compositeGraphic1.print();
    }    
}
