package command.stock;

public class FBStock implements Stock {
    private int amount;

    public FBStock(int amount) {
        this.amount = amount;
    }
    @Override
    public void buy() {
        System.out.println("Buy " + amount + " stock of facebook");        
    }

    @Override
    public void sell() {
        System.out.println("Sell " + amount + " stock of facebook");        
    }
    
}
