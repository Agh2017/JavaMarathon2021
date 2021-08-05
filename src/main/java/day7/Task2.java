package day7;


public class Task2 {


    public static void main(String[] args) {


        int baseStamina = 90;
        Player[] player = new Player[Player.getMaxCount()];

        for (int i = 0; i < Player.getMaxCount(); i++) {
            int newStamina = (int) Math.round(baseStamina + Math.random() * (Player.getMaxStamina() - baseStamina));
            player[i] = new Player(newStamina);
        }
        System.out.println(Player.getCountPlayers());
        Player.info();
        int k = (int) Math.round(Math.random() * (Player.getCountPlayers() - 1));
        do {
            player[k].run();
        }
        while (player[k].getStamina() > 0);

        Player.info();
        System.out.println(Player.getCountPlayers());
    }

}
