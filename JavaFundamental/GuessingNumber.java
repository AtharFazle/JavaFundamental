import java.util.Scanner;

public class GuessingNumber {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int guess, secret;
    boolean isPass = false;

    secret = 1 + (int) +(Math.random() * 10);

    System.out.println("Selamat datang di Permainan tebak angka");
    System.out.println("Di permainan ini pemain akan punya 3 kesempatan");
    System.out.println(
      "Jika Pemain menebak dengan angka yang selisih 1 dengan angka yang ditebak akan muncul kata hot"
    );
    System.out.println("jika selisih 2 maka muncul kata warm");
    System.out.println("mari kita mulai");

    for (int i = 0; i <= 3; i++) {
      System.out.println("Baiklah tebak kata berikut");
      guess = input.nextInt();

      if (guess == secret) {
        System.out.println("Right");
        System.out.println("you won the game!!");
        isPass = true;
        break;
      } else if ((guess - secret) == 1) {
        System.out.println("Wow its Very hott!!");
      } else if ((guess - secret) == 2) {
        System.out.println("Warm here");
      } else {
        System.out.println("its Cold here,please turn on the fire");
      }
    }
    System.out.println("Fail !!");
    System.out.println("the correct number is = " + secret);
    System.out.println("Nice Try!!!;");
  }
}
