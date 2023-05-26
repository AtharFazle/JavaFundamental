import java.util.Scanner;

public class PassingGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int average;
        int average1;
        int total;
        int nilaiMat;
        int nilaiBinggris;
        int nilaiBindo;

        System.out.println("Selamat Datang di PPDB SMK PADEPOKAN 79");

        System.out.println("Silahkan Masukkan nilai mat = ");
        nilaiMat = input.nextInt();

        System.out.println("Silahkan Masukkan nilai Binggris");
        nilaiBinggris = input.nextInt();

        System.out.println("Silahkan Masukkan Nilai Bindo");
        nilaiBindo = input.nextInt();

        total = nilaiMat + nilaiBinggris + nilaiBindo;

        average = total / 3;
        average1 = (nilaiBindo+nilaiBinggris)/2;

        System.out.println("Total nilai anda = "+total);
        System.out.println("Dengan Rata Rata = "+average);


        if(average>=73){
            System.out.println("Selamat Anda Diterima di SMK PADEPOKAN 79");
            if(average1>=75){
                System.out.println("Selamat Anda Diterima di Jurusan Sastra");
            }if(nilaiMat >80){
                System.out.println("Selamat Anda Keterima di jurusan TKJ");
            }
        }else{
            System.out.println("Mohon Maaf anda tidak diterima di SMK PADEPOKAN 79");
        }
    }
}

       
