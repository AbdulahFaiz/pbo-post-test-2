package penyewaanmobil;

public final class MobilSUV extends Mobil {
    public MobilSUV(String nama, String jenis, double hargaSewa) {
        super(nama, jenis, hargaSewa);
    }

    @Override
    public double hitungBiayaSewa(int lamaSewa) {
        return getHargaSewa() * lamaSewa;
    }
}
