package command;

import java.util.ArrayList;
import java.util.List;

import command.command.OrderCommand;

/**
 * This one is Invoker
 * It will take all the command and execute each
 */
public class Broker {
    List<OrderCommand> orderList = new ArrayList<>();

    public void addOrder(OrderCommand order) {
        this.orderList.add(order);
    }

    public void executeOrder() {
        for (OrderCommand order : orderList)
            order.execute();
    }
}
