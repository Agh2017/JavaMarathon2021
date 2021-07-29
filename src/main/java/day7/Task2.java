package day7;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {

        int maxCount = 6;
        int baseStamina = 90;
        Player[] player = new Player[maxCount];

        for (int i = 0; i < maxCount; i++) {
            int newStamina = (int) Math.round(baseStamina + Math.random() * (Player.getMaxStamina()-baseStamina));
            player[i] = new Player(newStamina);
            System.out.println(Player.getCountPlayers());
        }
        Player.info();
        int k = (int) Math.round(Math.random() * (Player.getCountPlayers()-1));
        do {
            player[k].run();
        }
        while (player[k].getStamina()>0);

        Player.info();
        System.out.println(Player.getCountPlayers());
    }
}
