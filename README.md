# PBO_Praktikum
Program Java sederhana untuk sistem pencatatan barang preloved menggunakan konsep CRUD dengan ArrayList, percabangan, dan perulangan.

---

## Tema: Sistem Pencatatan Barang Preloved
###### Nama: Adella Putri
###### Kelas: A, Sistem Informasi 2024

#### Deskripsi Singkat Program
Program ini merupakan implementasi sistem CRUD (Create, Read, Update, Delete) sederhana untuk pencatatan barang preloved.
Program dibuat menggunakan bahasa Java dengan beberapa ketentuan:

 - Menggunakan ArrayList untuk menyimpan data barang dan daftar barang yang sudah sold out.
 - Menggunakan percabangan (switch-case) untuk pemilihan menu.
 - Menggunakan perulangan (do-while dan for) agar program terus berjalan sampai user memilih keluar, serta untuk menampilkan daftar data.
   
Dengan program ini, pengguna bisa menambahkan barang baru, mengupdate data barang, menghapus barang sekaligus memindahkannya ke daftar sold out, serta melihat daftar barang yang tersedia maupun yang sudah terjual.

---

### Alur Program
#### 1. Opening
Ketika dijalankan, program terlebih dahulu menampilkan sambutan pembuka berupa nama aplikasi dan tujuan singkatnya. Hal ini berfungsi sebagai pengantar sebelum pengguna masuk ke menu utama.


#### 2. Menu Utama
Setelah itu, pengguna akan diberikan enam pilihan menu yang dapat dijalankan. 
Menu tersebut meliputi:

1. Lihat Semua Barang
2. Tambah Barang
3. Update Barang
4. Hapus Barang (Sold Out)
5. Lihat Daftar Sold Out
6. Keluar

Pemilihan menu dilakukan dengan cara memasukkan angka sesuai dengan pilihan yang tersedia.

#### 3. Lihat Semua Barang (Read)
Jika pengguna memilih menu untuk melihat semua barang, sistem akan menampilkan daftar barang yang ada di dalam ArrayList. Apabila ternyata daftar masih kosong, program akan memberikan informasi bahwa belum ada barang yang tersedia. Untuk menampilkan data, program menggunakan perulangan for sehingga setiap barang ditampilkan secara berurutan dengan nomor indeks.

#### 4. Tambah Barang (Create)
Pada saat memilih menu tambah barang, pengguna diminta untuk mengisi beberapa informasi seperti:
- Nama barang,
- Kategori,
- Kondisi (baru atau second),
- Serta harga.
  
Data yang sudah diinput kemudian digabung menjadi satu kesatuan string dan dimasukkan ke dalam ArrayList barang. Setelah itu, program memberikan notifikasi bahwa barang baru berhasil ditambahkan.

#### 5. Update Barang (Update)
Fitur update diawali dengan menampilkan seluruh daftar barang yang ada. Selanjutnya, pengguna diminta memilih nomor barang yang ingin diperbarui. Jika nomor yang dimasukkan sesuai dengan daftar yang tersedia, maka program akan meminta data baru untuk menggantikan data lama. Setelah semua informasi diinput, data pada indeks yang dipilih akan diperbarui menggunakan perintah set dari ArrayList. Apabila nomor yang dimasukkan tidak valid, maka program menampilkan pesan kesalahan.

#### 6. Hapus Barang (Delete -> Sold Out)
Menu hapus barang bekerja dengan menampilkan daftar barang terlebih dahulu. Pengguna kemudian memilih nomor barang yang ingin dihapus. Barang yang terpilih akan langsung dipindahkan dari ArrayList barang ke ArrayList soldOut. Dengan demikian, data tidak benar-benar hilang, melainkan tercatat dalam daftar sold out. 
Jika input tidak sesuai, program akan memberi peringatan bahwa nomor yang dipilih tidak valid.

#### 7. Lihat Daftar Sold Out
Selain daftar barang yang masih tersedia, program juga menyediakan menu untuk melihat barang yang sudah sold out. Jika memang ada barang yang telah dipindahkan ke daftar ini, maka semuanya akan ditampilkan secara berurutan. Namun, jika belum ada satupun barang yang terjual, pengguna akan mendapatkan pesan khusus bahwa daftar sold out masih kosong.

#### 8. Keluar Program
Apabila pengguna memilih menu keluar, program akan berhenti berjalan. Sebagai penutup, program menampilkan ucapan terima kasih karena telah menggunakan aplikasi ini.

## Struktur CRUD dalam Program
Bagian *Create* diwakili oleh fitur tambah barang.

Bagian *Read* diterapkan pada menu melihat semua barang serta melihat daftar sold out.

Bagian *Update* muncul ketika pengguna melakukan pembaruan terhadap data barang tertentu.

Bagian *Delete* dijalankan saat pengguna menghapus barang, di mana barang tersebut secara otomatis dipindahkan ke daftar sold out.
