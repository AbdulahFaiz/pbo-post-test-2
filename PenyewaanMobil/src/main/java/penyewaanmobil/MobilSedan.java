package penyewaanmobil;

// Deklarasi kelas MobilSedan yang ditandai dengan "final," sehingga tidak dapat diwariskan lagi
public final class MobilSedan extends Mobil {
    public MobilSedan(String nama, String jenis, double hargaSewa) {
        super(nama, jenis, hargaSewa);
    }

    // Override metode abstrak hitungBiayaSewa dari kelas Mobil
    @Override
    public double hitungBiayaSewa(int lamaSewa) {
        return getHargaSewa() * lamaSewa;
    }
}
