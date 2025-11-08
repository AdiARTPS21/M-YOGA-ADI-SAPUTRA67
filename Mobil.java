public class Mobil {
    String nama;
    int hargaPerHari;

    public Mobil(String nama, int hargaPerHari) {
        this.nama = nama;
        this.hargaPerHari = hargaPerHari;
    }

    // Method info mobil
    public void tampilInfo() {
        System.out.println(nama + " - Rp " + hargaPerHari + " / hari");
    }

    // Method total biaya sewa
    public int hitungTotal(int lamaSewa) {
        return hargaPerHari * lamaSewa;
    }
}
