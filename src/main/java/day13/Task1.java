package day13;

import java.util.Date;

public class Task1 {
    public static void main(String[] args) {

        User user1 = new User("P.Asand");
        User user2 = new User("L.Parker");
        User user3 = new User("D.Tiny");
        user1.sendMessage(user2, "Привет parker!");
        user1.sendMessage(user2, "Чернила есть?");
        user2.sendMessage(user1, "Ха ха");
        user2.sendMessage(user1, "Как здоровье?");
        user2.sendMessage(user1, "Привет");
        user3.sendMessage(user1, "Hi");
        user3.sendMessage(user1, "P - Piter?");
        user3.sendMessage(user1, "or Pitbull?");

        user1.sendMessage(user3, "Привет D.Ass )");
        user1.sendMessage(user3, "Как дела?");
        user1.sendMessage(user3, "Uhh");
        user3.sendMessage(user1, "By");

        MessageDatabase.showDialog(user1, user3);

    }
}
