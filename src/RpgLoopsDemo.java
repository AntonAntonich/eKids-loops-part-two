import java.util.Scanner;

public class RpgLoopsDemo {
    public static void main(String[] args) {
        String playerOneName = "Aragorn";
        String playerTwoName = "Helga";
        String helloMsg = "Time to attack press 1";

        int playerOneHealth = 100;
        int playerTwoHealth = 100;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(helloMsg);
            scanner.next();

            //  ссылка на статью:
            // https://vertex-academy.com/tutorials/ru/generaciya-sluchajnyx-chisel-v-java/
            int minAttack = 1;
            int maxAttack = 11;
            int playerOneAttack = (int) ((Math.random() * (maxAttack - minAttack)) + minAttack);
            int playerTwoAttack = (int) ((Math.random() * (maxAttack - minAttack)) + minAttack);

            playerOneHealth -= playerTwoAttack;
            playerTwoHealth -= playerOneAttack;

            System.out.println(playerOneName + " health = " + playerOneHealth);
            System.out.println(playerTwoName + " health = " + playerTwoHealth);

            if (playerOneHealth <= 0 && playerTwoHealth > 0) {
                System.out.println(playerTwoName + " wins !");
                break;
            } else if (playerTwoHealth <= 0 && playerOneHealth > 0) {
                System.out.println(playerOneName + " wins !");
                break;
            } else if (playerOneHealth <= 0 && playerTwoHealth <= 0) {
                System.out.println("DRAW !!!!");
                break;
            }
        }
        System.out.println("Game over");
    }
}
