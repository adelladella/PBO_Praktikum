# PBO_Praktikum
Program Java sederhana untuk sistem pencatatan barang preloved menggunakan konsep CRUD dengan ArrayList, percabangan, dan perulangan.

---

## Tema: Sistem Pencatatan Barang Preloved
<img width="3780" height="1890" alt="BANNER PBO" src="https://github.com/user-attachments/assets/54ad1130-cec5-437b-ae16-59e9bddf8db1" />

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
Ketika dijalankan, program terlebih dahulu menampilkan sambutan pembuka berupa nama aplikasi dan tujuan singkatnya. 
<img width="652" height="107" alt="image" src="https://github.com/user-attachments/assets/b29b1fbd-9d31-46fe-a777-c3ece4f7a7b5" />

Hal ini berfungsi sebagai pengantar sebelum pengguna masuk ke menu utama.


#### 2. Menu Utama
Setelah itu, pengguna akan diberikan enam pilihan menu yang dapat dijalankan. 
Menu tersebut meliputi:
<img width="297" height="208" alt="image" src="https://github.com/user-attachments/assets/782dc6c7-5e98-42e9-8d31-bfb2a32a5e1c" />

Pemilihan menu dilakukan dengan cara memasukkan angka sesuai dengan pilihan yang tersedia.

#### 3. Lihat Semua Barang (Read)
Jika pengguna memilih menu untuk melihat semua barang, sistem akan menampilkan daftar barang yang ada di dalam ArrayList. 

<img width="650" height="518" alt="image" src="https://github.com/user-attachments/assets/ed945fa7-a638-43a8-9406-1d6c4dec4ada" />

Apabila ternyata daftar masih kosong, program akan memberikan informasi bahwa belum ada barang yang tersedia. 
Untuk menampilkan data, program menggunakan perulangan for sehingga setiap barang ditampilkan secara berurutan dengan nomor indeks.

#### 4. Tambah Barang (Create)
Pada saat memilih menu tambah barang, pengguna diminta untuk mengisi beberapa informasi seperti:
- Nama barang,
- Kategori,
- Kondisi (baru atau second),
- Serta harga.
<img width="744" height="330" alt="image" src="https://github.com/user-attachments/assets/12b7594a-9168-49a0-92d3-25ce34c001fd" />

Data yang sudah diinput kemudian digabung menjadi satu kesatuan string dan dimasukkan ke dalam ArrayList barang. Setelah itu, program memberikan notifikasi bahwa barang baru berhasil ditambahkan.

#### 5. Update Barang (Update)
Fitur update diawali dengan menampilkan seluruh daftar barang yang ada. Selanjutnya, pengguna diminta memilih nomor barang yang ingin diperbarui. Jika nomor yang dimasukkan sesuai dengan daftar yang tersedia, maka program akan meminta data baru untuk menggantikan data lama. 

<img width="630" height="681" alt="image" src="https://github.com/user-attachments/assets/2195b1c2-1f9c-4405-ba3f-ef6857d362b5" />


Setelah semua informasi diinput, data pada indeks yang dipilih akan diperbarui menggunakan perintah set dari ArrayList. Apabila nomor yang dimasukkan tidak valid, maka program menampilkan pesan kesalahan.

- Daftar Barang sebelum di Update:
  <img width="628" height="323" alt="image" src="https://github.com/user-attachments/assets/6d5fca7f-cbc7-4e9e-b52a-745d241bbd28" />

- Daftar Barang setelah di Update:
  <img width="640" height="323" alt="image" src="https://github.com/user-attachments/assets/082e86f2-7e3b-47fd-ae41-7ad4eb976a5a" />


#### 6. Hapus Barang (di Delete namun lanjut ke Sold Out)
Menu hapus barang bekerja dengan menampilkan daftar barang terlebih dahulu. Pengguna kemudian memilih nomor barang yang ingin dihapus. 

<img width="633" height="579" alt="image" src="https://github.com/user-attachments/assets/7bd32f71-ec45-4f8e-8547-171b2f950cd4" />


Barang yang terpilih akan langsung dipindahkan dari ArrayList barang ke ArrayList soldOut. Dengan demikian, data tidak benar-benar hilang, melainkan tercatat dalam daftar sold out. 

<img width="623" height="352" alt="image" src="https://github.com/user-attachments/assets/80d61c74-f1c0-4ce4-93b8-aecbc4c3c18f" />

Jika input tidak sesuai, program akan memberi peringatan bahwa nomor yang dipilih tidak valid.

#### 7. Lihat Daftar Sold Out
Selain daftar barang yang masih tersedia, program juga menyediakan menu untuk melihat barang yang sudah sold out. Jika memang ada barang yang telah dipindahkan ke daftar ini, maka semuanya akan ditampilkan secara berurutan.

<img width="634" height="262" alt="image" src="https://github.com/user-attachments/assets/0afc2ff7-0520-4506-ba24-e7b0156328b7" />

Namun, jika belum ada satupun barang yang terjual, pengguna akan mendapatkan pesan khusus bahwa daftar sold out masih kosong.

#### 8. Keluar Program
Apabila pengguna memilih menu keluar, program akan berhenti berjalan. 

<img width="582" height="224" alt="image" src="https://github.com/user-attachments/assets/6a73d104-e953-427b-a6ac-6d7a094646a1" />

Sebagai penutup, program menampilkan ucapan terima kasih karena telah menggunakan aplikasi ini.

## Struktur CRUD dalam Program
Bagian *Create* diwakili oleh fitur tambah barang.

Bagian *Read* diterapkan pada menu melihat semua barang serta melihat daftar sold out.

Bagian *Update* muncul ketika pengguna melakukan pembaruan terhadap data barang tertentu.

Bagian *Delete* dijalankan saat pengguna menghapus barang, di mana barang tersebut secara otomatis dipindahkan ke daftar sold out.
