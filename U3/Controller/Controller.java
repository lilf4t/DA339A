package Controller;

import Model.*;
import View.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * Controller klassen används för att skapa olika beställningar via input, visar produkter som kan väljas till menyn
 * och ansvarar för kommunikation mellan view och model klasserna
 * Det finns instansvariabler för view - för att få tillgång till klassen Mainframe
 * newOrders - för att få tillgång till klassen Orders, man gör en ny beställning mha den.
 * ordersInfo - för att få tillgång till OrdersInfo klassen, för att få info om Orders
 * Sedan två arraylist, en av pizza och en av drinks, med hjälp av de, kan man skapa instanser.
 * @author Fatima Kadum
 */
public class Controller {
    private MainFrame view;
    private Orders newOrder;
    private OrdersInfo ordersInfo;
    private ButtonType currentLeftMenu = ButtonType.NoChoice;
    private ArrayList<Pizza> pizza;
    private ArrayList<Drinks> drinks;

    /**
     * Konstruktor för att kunna initiera objekt av instansvariablerna
     * Vi har metoderna order pizza/drinks, och vissa operationer från view för att bilda vår GUI
     */
    public Controller() {
        ordersInfo = new OrdersInfo();
        newOrder = new Orders(0);
        view = new MainFrame(1000, 500, this);
        orderPizza();
        orderDrinks();
        view.enableAllButtons();
        view.disableAddMenuButton();
        view.disableViewSelectedOrderButton();
    }

    /**
     * Metod för att bilda pizzorna man kan beställa mha arraylist
     */
    public void orderPizza() {
        pizza = new ArrayList<>();

        pizza.add(new Pizza("Kebab Pizza", 90, new Toppings[]{Toppings.Tomato_sauce,
                Toppings.Cheese, Toppings.Kebab}));

        pizza.add(new Pizza("Vegetarian Pizza", 75, new Toppings[]{Toppings.Tomato_sauce,
                Toppings.Cheese, Toppings.Olives, Toppings.Mushroom}));

        pizza.add(new Pizza("Margherita Pizza", 70, new Toppings[]{Toppings.Tomato_sauce,
                Toppings.Cheese}));

        pizza.add(new Pizza("Hawaii Pizza", 85, new Toppings[]{Toppings.Tomato_sauce,
                Toppings.Cheese, Toppings.Ham, Toppings.Pineapple}));

        pizza.add(new Pizza("Todays' Special", 80, new Toppings[]{Toppings.Tomato_sauce,
                Toppings.Cheese, Toppings.Kebab, Toppings.Olives, Toppings.Mushroom}));
    }

    /**
     * Metod för att bilda drickorna man kan beställa mha arraylist
     */
    public void orderDrinks() {
        drinks = new ArrayList<>();

        drinks.add(new Drinks("Water", 5));
        drinks.add(new Drinks("Soda", 25));
        drinks.add(new Drinks("Coffee", 20));

        drinks.add(new AlcoholicDrinks("Beer", 50, 10));
        drinks.add(new AlcoholicDrinks("Wine", 65, 15));
        drinks.add(new AlcoholicDrinks("Cocktail", 75, 25));
    }

    /**
     * Metod för vilka options man kan välja i meny med buttonType
     * @param button
     */
    public void buttonPressed(ButtonType button) {
        switch (button) {
            case Add:
                addItemToOrder(view.getSelectionLeftPanel());
                break;

            case Food:
                setToFoodMenu();
                break;

            case Drinks:
                setToDrinkMenu();
                break;

            case OrderHistory:
                setToOrderHistoryMenu();
                break;

            case Order:
                placeOrder();
                break;

            case ViewOrder:
                viewSelectedOrder();
                break;
        }
    }
    /**
     * Metod som visar info av pizza, mha arraylist av Pizza
     * @return
     */
    private String[] getPizzasStrings() {
        String[] strings = new String[pizza.size()];
        for (int j = 0; j < strings.length; j++) {
            strings[j] = pizza.get(j).toString();
        }
        return strings;
    }
    /**
     * Metod som visar info av drinks, mha arraylist av Drinks
     * @return
     */
    private String[] getDrinksString() {
        String[] strings = new String[drinks.size()];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = drinks.get(i).toString();
        }
        return strings;
    }
    /**
     * Metod som visar info av orders, array av orders, nbr + pris
     * @return
     */
    private String[] getOrdersInfoString() {
        Orders[] orders = ordersInfo.getOrders();
        String[] strings = new String[orders.length];
        for (int i = 0; i < orders.length; i++) {
            strings[i] = orders[i].toString();
        }
        return strings;
    }
    /**
     * När man trycker på Add, ser till att man tryckt på antingen case Food, elr case Drinks med selectionindex
     * om det är på food, vi kallar på addProduct som lägger till och kollar om det är en instans av Pizza och får pris
     * om det är >=18 så ska den läggas till på samma sätt, om inte så får man felmeddelande
     * else, om det är en vanlig drycka, så ska den läggas till.
     * @param selectionIndex
     */
    public void addItemToOrder(int selectionIndex) {
        if (selectionIndex != -1) { // if something is selected in the left menu list
            switch (currentLeftMenu) { // This might need to change depending on architecture
                case Food:
                    newOrder.addProduct(pizza.get(selectionIndex));
                    break;
                case Drinks:
                    if (drinks.get(selectionIndex) instanceof AlcoholicDrinks) {
                        String message = JOptionPane.showInputDialog("Please input your age.");
                        if (Integer.parseInt(message) >= 18) {
                            newOrder.addProduct(drinks.get(selectionIndex));
                        } else if (Integer.parseInt(message) < 18) {
                            JOptionPane.showMessageDialog(null,
                                    "You have to be 18 or above in order to purchase alcoholic drinks.");
                        }
                    } else {
                        newOrder.addProduct(drinks.get(selectionIndex));
                        break;
                    }
            }
            view.populateRightPanel(newOrder.getInfoAboutOrder()); // update left panel with new item - this takes a shortcut in updating the entire information in the panel not just adds to the end
            view.setTextCostLabelRightPanel("Total cost: " + newOrder.getPrice()); // set the text to show cost of current order
        }
    }
    /**
     * När man väljer View Order på menyn, Om man trycker på knappen, samt att man är i Order History
     * vi går in i getOrders[selectionIndex] var man har tryckt
     */
    public void viewSelectedOrder() {
        int selectionIndex = view.getSelectionLeftPanel();
        view.setTextCostLabelRightPanel("Total cost of order: No order chosen");
        if ((selectionIndex != -1) && currentLeftMenu == ButtonType.OrderHistory) {
            Orders orders = ordersInfo.getOrders()[selectionIndex];
            view.populateRightPanel(orders.getInfoAboutOrder());
            view.setTextCostLabelRightPanel("Total cost: " + orders.getPrice()); // set the text to show cost of current order
        }
    }
    /**
     * När man väljer Food på menyn, kallar på getPizzasStrings som visar array av alla pizzor
     * kallar på metod från klassen Orders för att få ut info om order
     */
    public void setToFoodMenu() {
        currentLeftMenu = ButtonType.Food;
        view.populateLeftPanel(getPizzasStrings());
        view.populateRightPanel(newOrder.getInfoAboutOrder()); // update left panel with new item - this takes a shortcut in updating the entire information in the panel not just adds to the end
        view.setTextCostLabelRightPanel("Total cost: " + newOrder.getPrice()); // set the text to show cost of current order
        view.enableAllButtons();
        view.disableFoodMenuButton();
        view.disableViewSelectedOrderButton();
    }
    /**
     * När man väljer Drinks på menyn, kallar på getDrinksString som visar array av alla drinks
     * kallar på metod från klassen Orders för att få ut info om order
     */
    public void setToDrinkMenu() {
        currentLeftMenu = ButtonType.Drinks;
        view.populateLeftPanel(getDrinksString());
        view.populateRightPanel(newOrder.getInfoAboutOrder()); // update left panel with new item - this takes a shortcut in updating the entire information in the panel not just adds to the end
        view.setTextCostLabelRightPanel("Total cost: " + newOrder.getPrice()); // set the text to show cost of current order
        view.enableAllButtons();
        view.disableDrinksMenuButton();
        view.disableViewSelectedOrderButton();
    }
    /**
     * När man väljer Order History på menyn, kallar på ordersInfoString som visar array av info
     */
    public void setToOrderHistoryMenu() {
        currentLeftMenu = ButtonType.OrderHistory;
        view.clearRightPanel();
        System.out.println(Arrays.toString(getOrdersInfoString()));
        view.populateLeftPanel(getOrdersInfoString());
        view.enableAllButtons();
        view.disableAddMenuButton();
        view.disableOrderButton();
    }

    /**
     * Metod så att efter man tryckt på Order, så ska det börjas om på nytt inför nästa beställning
     * används i placeOrder metoden
     */
    public void resetOrders() {
        newOrder = new Orders(0);
        view.clearRightPanel();
        view.enableAllButtons();
    }

    /**
     * Metod för att beställa, kollar först isOk alltså att man beställer minst 1 pizza,
     * annars visas felmeddelande
     */
    public void placeOrder() {
        if (newOrder.isOk()) {
            view.populateRightPanel(newOrder.getInfoAboutOrder());
            view.setTextCostLabelRightPanel("Total cost: " + newOrder.getPrice());
            ordersInfo.addingOrder(newOrder);
            //resetorder
            resetOrders();
            view.enableAllButtons();
            view.disableAddMenuButton();
            view.disableViewSelectedOrderButton();
        } else {
            JOptionPane.showMessageDialog(null, "You have to purchase at least 1 pizza.");
        }
    }
}
