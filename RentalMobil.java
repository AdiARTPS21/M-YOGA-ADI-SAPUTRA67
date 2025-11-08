import java.util.Scanner;

public class RentalMobil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("+ SISTEM RENTAL MOBIL +");
        System.out.print("Masukkan nama penyewa: ");
        String namaPenyewa = input.nextLine();

        Mobil[] daftarMobil = {
            new Mobil("Avanza", 300000),
            new Mobil("Innova", 400000),
            new Mobil("Fortuner", 500000),
            new Mobil("Honda Brio", 400000),
            new Mobil("Kijang", 2500000)
        };

        System.out.println("\nDaftar Mobil Tersedia:");
        for (int i = 0; i < daftarMobil.length; i++) {
            System.out.print((i + 1) + ". ");
            daftarMobil[i].tampilInfo();
        }

        System.out.print("\nPilih nomor mobil (1-5): ");
        int pilihan = input.nextInt();

        if (pilihan < 1 || pilihan > daftarMobil.length) {
            System.out.println("\nPilihan mobil tidak VALID!");
            System.out.println("Silakan jalankan ulang program dan pilih nomor yang benar.");
            input.close();
            return;
        }

        System.out.print("Masukkan lama sewa (hari): ");
        int lamaSewa = input.nextInt();

        Mobil mobilDipilih = daftarMobil[pilihan - 1];
        int totalBayar = mobilDipilih.hitungTotal(lamaSewa);

        System.out.println("\n>> STRUK INFORMASI PENYEWA RENTAL <<");
        System.out.println(" ");
        System.out.println("Nama Penyewa : " + namaPenyewa);
        System.out.println("Mobil Dipilih: " + mobilDipilih.nama);
        System.out.println("Lama Sewa    : " + lamaSewa + " hari");
        System.out.println("Total Bayar  : Rp " + totalBayar);
        System.out.println(" ");
        System.out.println("!!WARNING!!");
        System.out.println("TERIMA KASIH SUDAH MENYEWA!!");
        System.out.println("JANGAN LUPA MEMBAYAR, JANGAN ASAL DI BAWA KABUR!");

        input.close();
    }
}
