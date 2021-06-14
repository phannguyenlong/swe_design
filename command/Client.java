package command;

import command.command.BuyStock;
import command.command.SellStock;
import command.stock.FBStock;
import command.stock.GStock;

/**
 * Client has 2 main action is 
 * sell # stock 
 * buy # of stock
 */
public class Client {
    public static void main(String[] args) {
        // Create Stock
        FBStock fbStock = new FBStock(10); // 10 facebook stock
        GStock gStock = new GStock(5); // 5 google stock

        // creating Order command
        BuyStock buyFB = new BuyStock(fbStock); // add stock to command to point out which stock to interact with
        SellStock sellGoogle = new SellStock(gStock);

        // add command to Broker (which is invoker to execute each command)
        Broker broker = new Broker();

        broker.addOrder(buyFB);
        broker.addOrder(sellGoogle);
        
        // exeute order
        broker.executeOrder();
    }
}
