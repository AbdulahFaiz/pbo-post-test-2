package penyewaanmobil;

public abstract class Mobil {
    // Variabel instance
    private String nama;
    private String jenis;
    private double hargaSewa;

    //Constuctor
    public Mobil(String nama, String jenis, double hargaSewa) {
        this.nama = nama;
        this.jenis = jenis;
        this.hargaSewa = hargaSewa;
    }

    // Metode getter (untuk mengambil nilai variabel instance)
    public String getNama() {
        return nama;
    }

    public String getJenis() {
        return jenis;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    // Metode setter (untuk mengubah nilai variabel instance)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    // Metode abstrak yang harus diimplementasikan oleh kelas turunan
    public abstract double hitungBiayaSewa(int lamaSewa);
}