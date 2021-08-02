package day7;

import java.util.Arrays;

public class Task2 {

    private static final int MAX_COUNT = 6;

    public static void main(String[] args) {


        int baseStamina = 90;
        Player[] player = new Player[MAX_COUNT];

        for (int i = 0; i < MAX_COUNT; i++) {
            int newStamina = (int) Math.round(baseStamina + Math.random() * (Player.getMaxStamina() - baseStamina));
            player[i] = new Player(newStamina);
            System.out.println(Player.getCountPlayers());
        }
        Player.info();
        int k = (int) Math.round(Math.random() * (Player.getCountPlayers() - 1));
        do {
            player[k].run();
        }
        while (player[k].getStamina() > 0);

        Player.info();
        System.out.println(Player.getCountPlayers());
    }

    public static int getMaxCount() {
        return MAX_COUNT;
    }
}
