package command.stock;

/**
 * This is the Reciever
 * It will has 2 method for 2 action (request of user)
 * Each CorrecteCommand will call method for suitable for that command
 */
public interface Stock {
    public void buy();
    
    public void sell();
}
