package penyewaanmobil;

public final class MobilSedan extends Mobil {
    public MobilSedan(String nama, String jenis, double hargaSewa) {
        super(nama, jenis, hargaSewa);
    }

    @Override
    public double hitungBiayaSewa(int lamaSewa) {
        return getHargaSewa() * lamaSewa;
    }
}
