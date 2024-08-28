package Model;

import java.util.ArrayList;

/**
 * Denna klassen lagrar och hanterar info av Orders
 * @author Fatima
 */
public class OrdersInfo {
    private ArrayList<Orders> orders;

    /**
     * Konstruktor
     * Skapar en array list för att få information om användarens val från GUI
     */
    public OrdersInfo() {
        orders = new ArrayList<>();
    }
    /**
     * Konstruktor, skapar orders och ger nummer till instansen
     * sparar order man beställer i arraylist
     * @param order - själva beställningen man har, har också en orderId för att lägga till nummer för instansen
     */
    public void addingOrder(Orders order) {
        int orderId = orders.size();
        order.setNbr(orderId);
        this.orders.add(order);
    }
    /**
     * InfoStrings som lagrar info från Orders
     * @return retOrder , strings av info
     */
    public Orders[] getOrders() {
        Orders[] retOrder = new Orders[orders.size()];
        for (int i = 0; i < orders.size(); i++) {
            retOrder[i] = orders.get(i);
        }
        return retOrder;
    }
}
