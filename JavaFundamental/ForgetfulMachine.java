import java.util.Scanner;

public class ForgetfulMachine {
    public static void main(String[]args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("apa ibu kota francis");
        keyboard.next();
        System.out.println("6x7 adalah");
        keyboard.nextInt();
        System.out.println("Tuliskan 1 nomor antara 0.01 dan 0.05");
        keyboard.nextDouble();
    }
}
