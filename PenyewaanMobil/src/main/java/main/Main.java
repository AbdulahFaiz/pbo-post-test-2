package main;

import penyewaanmobil.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DaftarMobil daftarMobil = new DaftarMobil();
        Scanner input = new Scanner(System.in);

        // Tambah mobil ke daftar
        Mobil mobil1 = new MobilSedan("Civic", "Sedan", 100);
        Mobil mobil2 = new MobilSUV("HRV", "SUV", 150);
        daftarMobil.tambahMobil(mobil1);
        daftarMobil.tambahMobil(mobil2);

        //Menu utama
        while (true) {
            System.out.println("\n<< Sewa Mobil Berkah >>");
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan Mobil Tersedia");
            System.out.println("2. Tambah Mobil Baru");
            System.out.println("3. Cari Mobil");
            System.out.println("4. Update Mobil");
            System.out.println("5. Hapus Mobil");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu (1/2/3/4/5/6): ");
            int pilihan = input.nextInt();
            input.nextLine();

            // CRUD
            switch (pilihan) {
                case 1:
                    // Menampilkan mobil yang tersedia
                    daftarMobil.tampilkanMobilTersedia();
                    break;
                case 2:
                    // Menambahkan mobil baru
                    System.out.print("Masukkan nama mobil: ");
                    String namaMobil = input.nextLine();
                    System.out.print("Masukkan jenis mobil: ");
                    String jenisMobil = input.nextLine();
                    System.out.print("Masukkan harga sewa per hari: ");
                    double hargaSewa = input.nextDouble();
                    input.nextLine();  // Membuang newline dari nextDouble()

                    Mobil mobilBaru = new MobilSedan(namaMobil, jenisMobil, hargaSewa);
                    daftarMobil.tambahMobil(mobilBaru);
                    System.out.println("Mobil berhasil ditambahkan.");
                    break;
                case 3:
                    // Mencari mobil
                    System.out.print("Masukkan nama mobil yang akan dicari: ");
                    String namaCari = input.nextLine();
                    Mobil mobilCari = daftarMobil.cariMobil(namaCari);
                    if (mobilCari != null) {
                        System.out.println("Mobil ditemukan:");
                        System.out.println("Nama: " + mobilCari.getNama());
                        System.out.println("Jenis: " + mobilCari.getJenis());
                        System.out.println("Harga Sewa per Hari: " + mobilCari.getHargaSewa());
                    } else {
                        System.out.println("Mobil tidak ditemukan.");
                    }
                    break;
                case 4:
                    // Update Mobil
                    System.out.print("Masukkan nama mobil yang akan diupdate: ");
                    String namaUpdate = input.nextLine();
                    Mobil mobilUpdate = daftarMobil.cariMobil(namaUpdate);
                    if (mobilUpdate != null) {
                        System.out.println("Data mobil yang akan diupdate:");
                        System.out.println("Nama: " + mobilUpdate.getNama());
                        System.out.println("Jenis: " + mobilUpdate.getJenis());
                        System.out.println("Harga Sewa per Hari: " + mobilUpdate.getHargaSewa());

                        System.out.println("Masukkan data baru:");

                        System.out.print("Masukkan nama baru: ");
                        String namaBaru = input.nextLine();
                        System.out.print("Masukkan jenis baru: ");
                        String jenisBaru = input.nextLine();
                        System.out.print("Masukkan harga sewa per hari baru: ");
                        double hargaSewaBaru = input.nextDouble();
                        input.nextLine();  // Membuang newline dari nextDouble()

                        // Mengupdate data mobil
                        mobilUpdate.setNama(namaBaru);
                        mobilUpdate.setJenis(jenisBaru);
                        mobilUpdate.setHargaSewa(hargaSewaBaru);

                        System.out.println("Data mobil berhasil diupdate.");
                    } else {
                        System.out.println("Mobil tidak ditemukan.");
                    }
                    break;
                case 5:
                    // Hapus Mobil
                    System.out.print("Masukkan nama mobil yang akan dihapus: ");
                    String namaHapus = input.nextLine();
                    Mobil mobilHapus = daftarMobil.cariMobil(namaHapus);
                    if (mobilHapus != null) {
                        daftarMobil.hapusMobil(mobilHapus);
                        System.out.println("Mobil berhasil dihapus.");
                    } else {
                        System.out.println("Mobil tidak ditemukan.");
                    }
                    break;
                case 6:
                    // Keluar dari program
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    input.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                    break;
            }
        }
    }
}
