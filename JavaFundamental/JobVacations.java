import java.util.Scanner;

public class JobVacations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama,lulusan,jenisKelamin;
        boolean reqKoor1,reqKoor2,reqAdmin1,reqAdmin2;
        boolean isPassingKoor,isPassingAdmin;
        int penampilan,pengalaman,umur;

        System.out.println("Selamat Datang di Lowongan Kerja PT. SECRET SEMUT");

        System.out.println("input nama anda di bawah sini");
        nama =input.nextLine();

        System.out.println("input jenisKelamin anda di bawah sini");
        jenisKelamin =input.nextLine();

        System.out.println("Input Lulusan anda");
        lulusan = input.nextLine();

        System.out.println("Input umur anda disini");
        umur = input.nextInt();

        System.out.println("Input Pengalaman kerja anda");
        pengalaman = input.nextInt();

        System.out.println("Penampilan anda dari 1-10");
        penampilan = input.nextInt();

        System.out.println("Ini adalah Biodata anda" );
        System.out.println("nama = "+nama);
        System.out.println("jenisKelamin = "+jenisKelamin);
        System.out.println("umur = "+umur);
        System.out.println("lulusan = "+lulusan);
        System.out.println("pengalaman = "+pengalaman);
        System.out.println("penampilan = "+penampilan);

        reqKoor1 = jenisKelamin.equalsIgnoreCase("pria") && umur>=21 && umur <=30 && (lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3")&&pengalaman>=2);

        reqKoor2 = jenisKelamin.equalsIgnoreCase("pria") && umur >=30 && lulusan.equalsIgnoreCase("S1") && pengalaman >=5;

        reqAdmin1 = jenisKelamin.equalsIgnoreCase("wanita") && umur>=20 && umur <=25 && lulusan.equalsIgnoreCase("D3") && (pengalaman >=1 || penampilan >=7);

        reqAdmin2 = jenisKelamin.equalsIgnoreCase("wanita") && umur>=25 && lulusan.equalsIgnoreCase("S1") && pengalaman >=7 && pengalaman>=5;

        isPassingAdmin = reqAdmin1 || reqAdmin2;
        isPassingKoor = reqKoor1 || reqKoor2;
        System.out.println(nama + "Terima kasih sudah mengikuti Lowongan kerja di PT.SECRET SEMUT 79.\n");
        System.out.println("Berikut adalah Hasil dari rekruitment untuk koordinator dan admin");
        System.out.println("Hasil Kelulusan untuk Kordinator : "+isPassingKoor);
        System.out.println("Hasil Kelulusan untuk Admin : " +isPassingAdmin);
}
}
