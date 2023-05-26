import java.util.Scanner;

public class CalculateMoneySpent {
    public static void main(String[] args) {

        String name;
        int moneySpent;
        double average;
        int total;
        int totalDay = 7;

        Scanner input = new Scanner(System.in);

        System.out.println("Calculate your money");

        System.out.println("siapa nama mu?");
        name = input.nextLine();

        System.out.println("Berapa kau habiskan uang hari sennin?");
        moneySpent= input.nextInt();

        total = moneySpent;

        System.out.println("Berapa kau habiskan uang hari selasa?");
        moneySpent= input.nextInt();

        total = total+moneySpent;

        System.out.println("Berapa kau habiskan uang hari rabu?");
        moneySpent= input.nextInt();

        total = total+moneySpent;
        
        System.out.println("Berapa kau habiskan uang hari kamis?");
        moneySpent= input.nextInt();

        total = total+moneySpent;
        System.out.println("Berapa kau habiskan uang hari jumat?");
        moneySpent= input.nextInt();

        total = total+moneySpent;
        System.out.println("Berapa kau habiskan uang hari sabtu?");
        moneySpent= input.nextInt();

        total = total+moneySpent;
        System.out.println("Berapa kau habiskan uang hari minggu?");
        moneySpent= input.nextInt();

        total = total+moneySpent;

        average = (double) total/totalDay;

        System.out.println("Hai "+name);
        System.out.println("Total pengeluaran kamu minggu ini sejumlah"+total);
        System.out.println("dengan rata rata = "+average);

    }
}
