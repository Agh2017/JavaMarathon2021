package day11.task1;

public class Courier implements Worker {

    private int salary;
    private boolean isPayed = false;
    private static final int WAGE_RATE = 100;
    private static final int BONUS = 50000, ORDERS = 10000;
    private Warehouse w;


    public Courier(Warehouse w) {
        this.w = w;
    }

    @Override
    public void doWork() {

        salary += WAGE_RATE;
        w.addDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (isPayed == false && w.getCountDeliveredOrders() >= ORDERS) {
            salary += BONUS;
            isPayed = true;
        } else if (isPayed) {
            System.out.println("Бонус уже был выплачен");
        } else {
            System.out.println("Бонус пока не доступен");
        }
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }
}
