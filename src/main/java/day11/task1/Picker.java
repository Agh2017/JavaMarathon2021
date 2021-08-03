package day11.task1;


public class Picker implements Worker {

    private int salary;
    private boolean isPayed = false;
    private static final int WAGE_RATE = 80;
    private static final int BONUS = 70000, ORDERS = 10000;
    private Warehouse w;

    public Picker(Warehouse w) {
        this.w = w;
    }

    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        this.salary += WAGE_RATE;
        w.addPickedOrders();
    }

    @Override
    public void bonus() {
        if (isPayed == false && w.getCountPickedOrders()>= ORDERS) {
            salary += BONUS;
            isPayed = true;
        } else if (isPayed){
            System.out.println("Бонус уже был выплачен");
        } else {
            System.out.println("Бонус пока не доступен");
        }
    }
}
