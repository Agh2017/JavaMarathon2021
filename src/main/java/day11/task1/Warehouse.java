package day11.task1;

public class Warehouse implements Worker {

    private int countPickedOrders;
    private int countDeliveredOrders;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "countPickedOrders=" + countPickedOrders +
                ", countDeliveredOrders=" + countDeliveredOrders +
                '}';
    }

    @Override
    public void doWork() {

    }

    public void addPickedOrders() {
        countPickedOrders += 1;
    }

    public void addDeliveredOrders() {
        countDeliveredOrders += 1;
    }

    @Override
    public void bonus() {

    }
}
