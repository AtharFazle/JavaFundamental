import java.util.Scanner;

public class CafeReservation {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String name, gender, ReservationDay;
    int money, age, attractive;

    System.out.println("Welcome to Reservation Cafe");

    System.out.println("Please insert your name?");
    name = input.nextLine();

    System.out.println("What is your gender?");
    gender = input.nextLine();

    System.out.println("What day do you want to make a reservation?");
    ReservationDay = input.nextLine();

    System.out.println("How Much your money?");
    money = input.nextInt();

    System.out.println("How old are you?");
    age = input.nextInt();

    System.out.println("How attractive are you?");
    attractive = input.nextInt();

    if (ReservationDay.equalsIgnoreCase("monday")) {
      if (age >= 20 && age <= 30 && money >= 500) {
        System.out.println(
          "Hi " +
          name +
          " Thank You for using our Application,.\n Following Results for your Reservation : You can Order on Monday,Young Night"
        );
      } else {
        System.out.println(
          "Hi " +
          name +
          " Thank You for using our Application,Following Results for your Reservation : Sorry You cant Order on Monday,Because it is for Young Night"
        );
      }
    } else if (ReservationDay.equalsIgnoreCase("tuesday")) {
      if (age >= 31 && age <= 50 && money >= 250) {
        System.out.println(
          "Hi " +
          name +
          " Thank You for using our Application,Following Results for your Reservation : You can Order on Tuesday,oldest Night"
        );
      } else {
        System.out.println(
          "Hi " +
          name +
          " Thank You for using our Application,Following Results for your Reservation : Sorry You cant Order onTuesday,Because it is for oldest Night"
        );
      }
    } else if (ReservationDay.equalsIgnoreCase("wednesday")) {
      if (
        age >= 20 &&
        age <= 35 &&
        money >= 350 &&
        gender.equalsIgnoreCase("female") &&
        attractive >= 7
      ) {
        System.out.println(
          "Hi " +
          name +
          " Thank You for using our Application,Following Results for your Reservation : You can Order on wednesday,ladies Night"
        );
      } else {
        System.out.println(
          "Hi " +
          name +
          " Thank You for using our Application,Following Results for your Reservation : Sorry You cant Order on wednesday,Because it is for ladies Night"
        );
      }
    } else if (ReservationDay.equalsIgnoreCase("thursday")) {
      if (
        gender.equalsIgnoreCase("female") &&
        age >= 21 &&
        age <= 30 &&
        money >= 300
      ) {
        System.out.println(
          "Hi " +
          name +
          " Thank You for using our Application,Following Results for your Reservation : You can Order on thursday,single party Night"
        );
      } else if (
        gender.equalsIgnoreCase("male") &&
        age >= 21 &&
        age <= 30 &&
        money >= 1000
      ) {
        System.out.println(
          "Hi " +
          name +
          " Thank You for using our Application,Following Results for your Reservation : You can Order on thursday,single party Night"
        );
      } else {
        System.out.println(
          "Hi " +
          name +
          " Thank You for using our Application,Following Results for your Reservation : Sorry You can Order on thursday,single party Night"
        );
      }
    } else if (ReservationDay.equalsIgnoreCase("friday")) {
      if (
        gender.equalsIgnoreCase("female") &&
        age >= 31 &&
        age <= 45 &&
        money >= 1000
      ) {
        System.out.println(
          "Hi " +
          name +
          " Thank You for using our Application,Following Results for your Reservation : You can Order on friday,its a Women Night"
        );
      } else if (gender.equalsIgnoreCase("male") && age >= 21 && age <= 25) {
        System.out.println(
          "Hi " +
          name +
          " Thank You for using our Application,Following Results for your Reservation : You can Order on friday,its a Women Night"
        );
      } else {
        System.out.println(
          "Hi " +
          name +
          " Thank You for using our Application,Following Results for your Reservation : Sorry You can Order on friday,its a Women Night"
        );
      }
    } else if (
      ReservationDay.equalsIgnoreCase("saturday") ||
      ReservationDay.equalsIgnoreCase("Sunday") ||
      ReservationDay.equalsIgnoreCase("weekend")
    ) {
      if (age >= 18 && age <= 60 && money >= 100) {
        System.out.println(
          "Hi " +
          name +
          " Thank You for using our Application,Following Results for your Reservation : You can Order on Saturday or Sunday (Weekend),Its a Weekend Freedom Night"
        );
      } else {
        System.out.println(
          "Hi " +
          name +
          " Thank You for using our Application,Following Results for your Reservation : Sorry You can Order on Saturday or Sunday (Weekend),Its a Weekend Freedom Night"
        );
      }
    }
  }
}
