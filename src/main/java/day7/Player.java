package day7;

public class Player {

    private static final int MAX_STAMINA = 100, MIN_STAMINA = 0;
    private static int countPlayers;
    private int stamina;

    public Player(int stamina) {
        this.stamina = stamina;
        countPlayers += 1;
    }

    public static int getCountPlayers() {
        if (countPlayers > 6) {
            countPlayers = 6;
        }
        return countPlayers;
    }

    public int getStamina() {
        return stamina;
    }

    public static int getMaxStamina() {
        return MAX_STAMINA;
    }

    public void run() {
        if (stamina > 0) {
            stamina -= 1;
            if (stamina == MIN_STAMINA) {
                countPlayers -= 1;
            }
        }
    }

    public static void info() {

        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
