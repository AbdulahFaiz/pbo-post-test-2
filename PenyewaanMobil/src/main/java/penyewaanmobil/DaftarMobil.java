package penyewaanmobil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class DaftarMobil {
    private final List<Mobil> mobilList;

    public DaftarMobil() {
        mobilList = new ArrayList<>();
    }

    // Metode untuk menambahkan mobil ke daftar
    public final void tambahMobil(Mobil mobil) {
        mobilList.add(mobil);
    }

    // Metode untuk mendapatkan daftar mobil
    public final List<Mobil> getMobilList() {
        return Collections.unmodifiableList(mobilList);
    }

    // Metode untuk mencari mobil berdasarkan nama
    public final Mobil cariMobil(String nama) {
        for (Mobil mobil : mobilList) {
            if (mobil.getNama().equalsIgnoreCase(nama)) {
                return mobil;
            }
        }
        return null;
    }

    // Metode untuk mengupdate data mobil
    public final void updateMobil(Mobil mobilToUpdate, String namaBaru, String jenisBaru, double hargaSewaBaru) {
        mobilToUpdate.setNama(namaBaru);
        mobilToUpdate.setJenis(jenisBaru);
        mobilToUpdate.setHargaSewa(hargaSewaBaru);
    }

    // Metode untuk menghapus mobil dari daftar
    public final void hapusMobil(Mobil mobilToDelete) {
        mobilList.remove(mobilToDelete);
    }

    // Metode untuk menampilkan mobil yang tersedia
    public final void tampilkanMobilTersedia() {
        System.out.println("Daftar Mobil Tersedia:");
        for (Mobil mobil : mobilList) {
            System.out.println(mobil.getNama() + " - " + mobil.getJenis() + " - Harga Sewa per Hari: " + mobil.getHargaSewa());
        }
    }
}
