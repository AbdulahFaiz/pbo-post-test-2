package penyewaanmobil;

public class Penyewaan {
    private Mobil mobil;
    private int lamaSewa;
    private double biayaSewa;

    // Konstruktor Penyewaan yang menerima objek Mobil, durasi sewa, dan biaya sewa sebagai parameter
    public Penyewaan(Mobil mobil, int lamaSewa, double biayaSewa) {
        this.mobil = mobil;
        this.lamaSewa = lamaSewa;
        this.biayaSewa = biayaSewa;
    }


}
