# pbo-post-test-2
#### Abdulah Faiz Tedjo Putro (2209116026)


# Penjelasan Class Java

## Main.java

1. **Import Statements:**
   - Program mengimpor beberapa paket dan kelas yang diperlukan.
   - penyewaanmobil.* mengimpor semua kelas dari paket penyewaanmobil.
   - java.util.Scanner digunakan untuk menerima input dari pengguna.

2. **Fungsi Utama (main):**
   - Program utama dimulai dengan mendeklarasikan objek DaftarMobil dan Scanner untuk menerima input dari pengguna.

3. **Tambah Mobil ke Daftar:**
   - Dua objek Mobil (mobil1 dan mobil2) telah dibuat dengan informasi seperti nama, jenis, dan harga sewa per hari.
   - Mobil-mobil ini kemudian ditambahkan ke daftarMobil menggunakan metode tambahMobil.

4. **Menu Utama:**
   - Program akan menampilkan menu utama dengan enam opsi yang berbeda.
   - Pengguna diminta untuk memilih opsi dengan memasukkan angka 1 hingga 6.

5. **Switch Statement:**
   - Program menggunakan struktur switch untuk mengeksekusi aksi berdasarkan pilihan pengguna.

6. **Opsi 1 Tampilkan Mobil:**
   - Program memiliki beberapa opsi menu, seperti menampilkan mobil yang tersedia, menambahkan mobil baru, mencari mobil, mengupdate mobil, menghapus mobil, dan keluar dari program.

7. **Opsi 2 - Menambah Mobil Baru:**
   - Dalam opsi ini, pengguna diminta untuk memasukkan informasi tentang mobil baru, seperti nama, jenis, dan harga sewa per hari.
   - Objek Mobil baru dibuat dengan data yang dimasukkan, dan kemudian ditambahkan ke daftarMobil.

9. **Opsi 3 - Mencari Mobil:**
    - Dalam opsi ini, pengguna diminta untuk memasukkan nama mobil yang ingin dicari.
    - Program mencari mobil dengan nama yang sesuai dalam daftarMobil dan menampilkan informasi tentang mobil tersebut jika ditemukan.

9. **Opsi 4 - Update Mobil:**
    - Dalam opsi ini, pengguna diminta untuk memasukkan nama mobil yang ingin diupdate.
    - Program mencari mobil dengan nama yang sesuai, menampilkan informasi saat ini, dan meminta pengguna untuk memasukkan data baru.
    - Data mobil tersebut kemudian diupdate dengan data yang baru.

11. **Opsi 5 - Hapus Mobil:**
    - Dalam opsi ini, pengguna diminta untuk memasukkan nama mobil yang ingin dihapus.
    - Program mencari mobil dengan nama yang sesuai dalam daftarMobil dan menghapusnya dari daftar jika ditemukan.

11. **Opsi 6 - Keluar dari Program:**
    - Dalam opsi ini, program memberikan pesan terima kasih kepada pengguna, menutup Scanner, dan keluar dari program.

13. **Default:**
    - Jika pengguna memasukkan opsi yang tidak valid, program memberikan pesan bahwa pilihan tidak valid dan meminta pengguna untuk memilih lagi.


## DaftarMobil.java

1. **Import Statements:**
   - Kode mengimpor beberapa kelas dan antarmuka yang diperlukan, seperti ArrayList, Collections, dan List dari paket Java java.util.

2. **Kelas DaftarMobil:**
   - Ini adalah kelas final yang digunakan untuk mengelola daftar mobil.
   - Daftar mobil disimpan dalam sebuah objek ArrayList yang disebut mobilList.

4. **Konstruktor:**
   - Konstruktor DaftarMobil digunakan untuk inisialisasi objek mobilList saat objek DaftarMobil dibuat. Daftar mobil awalnya kosong.

4. **Metode tambahMobil:**
   - Metode ini digunakan untuk menambahkan objek Mobil ke daftar mobilList. Mobil yang ditambahkan disimpan dalam daftar.

6. **Metode getMobilList:**
   - Metode ini mengembalikan daftar mobil, tetapi menggunakan Collections.unmodifiableList() untuk membuat daftar mobil tidak dapat diubah (immutable). Ini melindungi daftar dari perubahan yang tidak sah.

6. **Metode cariMobil:**
   - Metode ini digunakan untuk mencari mobil dalam daftar berdasarkan nama mobil yang diberikan. Jika mobil ditemukan, objek Mobil yang sesuai dikembalikan; jika tidak, null dikembalikan.

7. **Metode updateMobil:**
   - Metode ini memungkinkan pengguna untuk mengupdate data mobil yang ada dalam daftar. Pengguna memberikan objek Mobil yang akan diupdate, serta nama baru, jenis baru, dan harga sewa baru. Data mobil diupdate sesuai dengan informasi yang diberikan.

9. **Metode hapusMobil:**
    - Metode ini digunakan untuk menghapus mobil dari daftar. Pengguna memberikan objek Mobil yang akan dihapus, dan mobil tersebut dihapus dari mobilList.

9. **Metode tampilkanMobilTersedia:**
    - Metode ini digunakan untuk menampilkan daftar mobil yang tersedia ke layar. Ini mencetak nama mobil, jenis mobil, dan harga sewa per hari untuk setiap mobil dalam daftar.


## Mobil.java

1. **Kelas Abstrak Mobil:**
   - Ini adalah kelas abstrak yang digunakan sebagai dasar untuk semua jenis mobil dalam program penyewaan mobil.
   - Kelas ini memiliki tiga variabel instance: nama, jenis, dan hargaSewa yang digunakan untuk menyimpan informasi tentang mobil.

3. **Konstruktor:**
   - Konstruktor Mobil digunakan untuk inisialisasi objek Mobil saat objek kelas turunan dibuat. Ini menerima tiga parameter: nama mobil, jenis mobil, dan harga sewa per hari.

3. **Metode Getter:**
   - Kelas ini memiliki metode getter (getter methods) yang digunakan untuk mengambil nilai dari variabel instance. Metode-metode ini memungkinkan akses ke informasi tentang mobil, seperti nama, jenis, dan harga sewa.

5. **Metode Setter:**
   - Kelas ini memiliki metode setter (setter methods) yang digunakan untuk mengubah nilai dari variabel instance. Metode-metode ini memungkinkan pengubahan informasi tentang mobil, seperti mengubah nama, jenis, atau harga sewa.

5. **Metode Abstrak hitungBiayaSewa:**
   - Ini adalah metode abstrak yang harus diimplementasikan oleh kelas-kelas turunan dari Mobil. Metode ini menerima parameter lamaSewa (berapa lama mobil disewa) dan digunakan untuk menghitung biaya total sewa mobil selama periode tersebut. Metode ini akan berbeda untuk setiap jenis mobil, jadi kelas turunan harus memberikan implementasi khusus untuk metode ini.
  

## MobilSUV.java

1. **Kelas MobilSUV:**
   - Ini adalah kelas yang digunakan untuk merepresentasikan jenis mobil SUV dalam program penyewaan mobil.

3. **Kata Kunci final:**
   - Kelas MobilSUV ditandai dengan kata kunci final, yang berarti kelas ini tidak dapat diwariskan lagi. Ini artinya tidak dapat ada kelas lain yang menjadi turunan dari MobilSUV. Kelas ini merupakan implementasi akhir dari jenis mobil SUV.

3. **Konstruktor:**
   - Konstruktor MobilSUV digunakan untuk membuat objek MobilSUV saat objek kelas ini dibuat. Konstruktor ini menerima tiga parameter: nama mobil, jenis mobil, dan harga sewa per hari. Konstruktor ini memanggil konstruktor kelas induk (Mobil) menggunakan super untuk menginisialisasi variabel instance yang diwarisi dari kelas Mobil.

5. **Metode hitungBiayaSewa:**
   - Kelas MobilSUV meng-override (melakukan substitusi) metode abstrak hitungBiayaSewa yang dideklarasikan dalam kelas Mobil. Metode ini menerima parameter lamaSewa yang menunjukkan berapa lama mobil disewa. Implementasi metode ini menghitung biaya sewa total dengan mengalikan harga sewa per hari (getHargaSewa()) dengan lama sewa. Ini adalah implementasi khusus untuk jenis mobil SUV, yang dapat berbeda dari implementasi jenis mobil lainnya (misalnya, mobil sedan).



## MobilSedan.java

1. **Kelas MobilSedan:**
   - Ini adalah kelas yang digunakan untuk merepresentasikan jenis mobil sedan dalam program penyewaan mobil.

3. **Kata Kunci final:**
   - Kelas MobilSedan ditandai dengan kata kunci final, yang berarti kelas ini tidak dapat diwariskan lagi. Ini artinya tidak dapat ada kelas lain yang menjadi turunan dari MobilSedan. Kelas ini merupakan implementasi akhir dari jenis mobil sedan.

3. **Konstruktor:**
   - Konstruktor MobilSedan digunakan untuk membuat objek MobilSedan saat objek kelas ini dibuat. Konstruktor ini menerima tiga parameter: nama mobil, jenis mobil, dan harga sewa per hari. Konstruktor ini memanggil konstruktor kelas induk (Mobil) menggunakan super untuk menginisialisasi variabel instance yang diwarisi dari kelas Mobil.

5. **Metode hitungBiayaSewa:**
   - Kelas MobilSedan meng-override (melakukan substitusi) metode abstrak hitungBiayaSewa yang dideklarasikan dalam kelas Mobil. Metode ini menerima parameter lamaSewa yang menunjukkan berapa lama mobil disewa. Implementasi metode ini menghitung biaya sewa total dengan mengalikan harga sewa per hari (getHargaSewa()) dengan lama sewa. Ini adalah implementasi khusus untuk jenis mobil sedan, yang dapat berbeda dari implementasi jenis mobil lainnya (misalnya, mobil SUV).


## PenyewaanMobilException.java

1. **Kelas PenyewaMobilException:**
   - Ini adalah kelas yang digunakan untuk mendefinisikan pengecualian (exception) khusus yang terkait dengan penyewaan mobil dalam program.
   - Kelas ini merupakan turunan dari kelas Exception, yang adalah salah satu kelas dasar dalam hierarki pengecualian Java.

2. **Konstruktor:**
   - Kelas ini memiliki satu konstruktor, yaitu PenyewaMobilException(String message). Konstruktor ini menerima pesan (message) yang akan digunakan untuk menjelaskan alasan terjadinya pengecualian.
   - Konstruktor ini memanggil konstruktor kelas induk (Exception) menggunakan super untuk menginisialisasi pesan pengecualian.


# Output

## Menu awal
![image](https://github.com/AbdulahFaiz/pbo-post-test-2/assets/121870536/1048ab11-0a28-4cdc-9bef-3c254e25d188)

## Tampilkan Mobil
![image](https://github.com/AbdulahFaiz/pbo-post-test-2/assets/121870536/ae828179-efbe-4c6d-b9d3-2224320ac612)

## Tambah Mobil
![image](https://github.com/AbdulahFaiz/pbo-post-test-2/assets/121870536/271fee07-1bad-48df-a038-f344f296a3b8)
![image](https://github.com/AbdulahFaiz/pbo-post-test-2/assets/121870536/eed82bfc-08ab-47d8-a737-a45cec969415)

## Cari Mobil
![image](https://github.com/AbdulahFaiz/pbo-post-test-2/assets/121870536/b3c3ad62-e712-4b8e-8633-da977a77dfda)

## Update Mobil
![image](https://github.com/AbdulahFaiz/pbo-post-test-2/assets/121870536/86f6b3b0-d245-42b6-95c1-198bb9c33095)
![image](https://github.com/AbdulahFaiz/pbo-post-test-2/assets/121870536/c243f76d-6019-4fe5-9a14-e4e4b9251f0a)

## Hapus Mobil
![image](https://github.com/AbdulahFaiz/pbo-post-test-2/assets/121870536/9f080187-52b4-4ce7-974f-75941aac8fbb)
![image](https://github.com/AbdulahFaiz/pbo-post-test-2/assets/121870536/77ec3f4c-148a-42e9-bcc4-62be59edeb40)

## Keluar
![image](https://github.com/AbdulahFaiz/pbo-post-test-2/assets/121870536/c45e4cda-9165-4819-aca0-9455e93cd012)


