import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        int luckyNumber = 7;
        String helloMsg = "Enter number";
        String tryAgainMsg = "Try again !";
        String winMessage = "You win !!! Lucky number is: ";
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(helloMsg);
            int userNumber = scanner.nextInt();
            if(userNumber == luckyNumber) {
                System.out.println(winMessage + luckyNumber);
                break;
            } else {
                System.out.println(tryAgainMsg);
            }
        }


    }
}
