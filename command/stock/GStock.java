package command.stock;

public class GStock implements Stock{
    private int amount;

    public GStock(int amount) {
        this.amount = amount;
    }
    @Override
    public void buy() {
        System.out.println("Buy " + amount + " stock of google");        
    }

    @Override
    public void sell() {
        System.out.println("Sell " + amount + " stock of google");        
    }
}
