package penyewaanmobil;

public abstract class Mobil {
    private String nama;
    private String jenis;
    private double hargaSewa;

    public Mobil(String nama, String jenis, double hargaSewa) {
        this.nama = nama;
        this.jenis = jenis;
        this.hargaSewa = hargaSewa;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    // Metode abstrak untuk menghitung biaya sewa
    public abstract double hitungBiayaSewa(int lamaSewa);
}
