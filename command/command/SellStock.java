package command.command;

import command.stock.Stock;

/**
 * Concrete comamand for action buy stock
 * This will recieve the Reciever from clien 
 * and the call correct method of reciever for this command
**/
public class SellStock implements OrderCommand {
    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
    
}
