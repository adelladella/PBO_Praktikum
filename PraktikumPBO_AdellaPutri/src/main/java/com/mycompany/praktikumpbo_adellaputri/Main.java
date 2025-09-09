/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikumpbo_adellaputri;

/**
 *
 * @author ADELLA
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // disini letak ArrayList untuk data barang dan barang sold out nya
        ArrayList<String> barang = new ArrayList<>();
        ArrayList<String> soldOut = new ArrayList<>();

        int pilihan;

        // ini data data barang nya
        barang.add("Blouse Motif Bunga | Baju | Second | Rp.70,000");
        barang.add("Kemeja Kotak-Kotak Flanel | Baju | Second | Rp.75,000");
        barang.add("Crop Top Polos | Baju | Second | Rp.50,000");
        barang.add("Celana Jeans Skinny | Celana | Second | Rp.120,000");
        barang.add("Rok Span Hitam | Rok | New | Rp.60,000");
        barang.add("Jaket Denim | Jaket | Second | Rp.130,000");
        barang.add("Hijab Segi Empat Polos | Jilbab | New | Rp.20,000");
        barang.add("Totebag Kanvas | Tas | Second | Rp.50,000");
        barang.add("Kalung Choker | Aksesoris | Baru | Rp.45,000");
        barang.add("Pin Hijab | Aksesoris | Baru | Rp.15,000");
        barang.add("Kacamata Frame Kotak | Aksesoris | Baru | Rp.100,000");
        
        System.out.println("\n======================================================="); // opening
        System.out.println("       Selamat Datang di The Second Chapter Store");
        System.out.println("    Solusi praktis untuk mencatat dan kelola barangmu!");
        System.out.println("=========================================================");

        do {    
            System.out.println("\n===== MENU UTAMA =====");
            System.out.println("1. Lihat Semua Barang");
            System.out.println("2. Tambah Barang");
            System.out.println("3. Update Barang");
            System.out.println("4. Hapus Barang (Sold Out)");
            System.out.println("5. Lihat Daftar Sold Out");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1: // lihat barang
                    if (barang.isEmpty()) {
                        System.out.println("Yahh belum ada barang yang tersedia..");
                    } 
                    else {
                        System.out.println("===== Daftar Barang =====");
                        for (int i = 0; i < barang.size(); i++) {
                            System.out.println((i + 1) + ". " + barang.get(i));
                        }
                    }
                    break;

                case 2: // tambah barang
                    System.out.print("Masukkan nama barang: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan kategori: ");
                    String kategori = input.nextLine();
                    System.out.print("Masukkan kondisi (New/Second): ");
                    String kondisi = input.nextLine();
                    System.out.print("Masukkan harga (pakai koma jika perlu, contoh 75,000): Rp. ");
                    String harga = input.nextLine();

                    String dataBaru = nama + " | " + kategori + " | " + kondisi + " | Rp." + harga;
                    barang.add(dataBaru);
                    System.out.println("| Yeyyy barang berhasil ditambahkan!");
                    break;

                case 3: // update barang
                    if (barang.isEmpty()) {
                        System.out.println("| Emm... tidak ada barang yang bisa diupdate..");
                    } 
                    else {
                        System.out.println("===== Daftar Barang =====");
                        for (int i = 0; i < barang.size(); i++) {
                            System.out.println((i + 1) + ". " + barang.get(i));
                        }
                        System.out.print("| Pilih nomor barang yang ingin diupdate: ");
                        int indexUpdate = input.nextInt();
                        input.nextLine();

                        if (indexUpdate > 0 && indexUpdate <= barang.size()) {
                            System.out.print("Masukkan nama barang baru: ");
                            String namaBaru = input.nextLine();
                            System.out.print("Masukkan kategori baru: ");
                            String kategoriBaru = input.nextLine();
                            System.out.print("Masukkan kondisi baru (New/Second): ");
                            String kondisiBaru = input.nextLine();
                            System.out.print("Masukkan harga baru: Rp. ");
                            String hargaBaru = input.nextLine();

                            String dataUpdate = namaBaru + " | " + kategoriBaru + " | " + kondisiBaru + " | Rp." + hargaBaru;
                            barang.set(indexUpdate - 1, dataUpdate);
                            System.out.println("| Uyeyyy barang berhasil diupdate!");
                        } else {
                            System.out.println("| Wah! nomor tidak valid!!");
                        }
                    }
                    break;

                case 4: // hapus barang terus lansung pindah ke sold out
                    if (barang.isEmpty()) {
                        System.out.println("| Emm... tidak ada barang yang bisa dihapus..");
                    } 
                    else {
                        System.out.println("===== Daftar Barang =====");
                        for (int i = 0; i < barang.size(); i++) {
                            System.out.println((i + 1) + ". " + barang.get(i));
                        }
                        System.out.print("| Pilih nomor barang yang ingin dihapus (sold out): ");
                        int indexHapus = input.nextInt();
                        input.nextLine();

                        if (indexHapus > 0 && indexHapus <= barang.size()) {
                            String dataHapus = barang.remove(indexHapus - 1);
                            soldOut.add(dataHapus);
                            System.out.println("| Keren! Barang berhasil dipindahkan ke daftar Sold Out!");
                        } else {
                            System.out.println("| Yahh nomor tidak valid..");
                        }
                    }
                    break;

                case 5: // untuk lihat daftar sold out
                    if (soldOut.isEmpty()) {
                        System.out.println("| Sayang banget! Belum ada barang yang sold out!!");
                    } 
                    else {
                        System.out.println("===== Daftar Barang Sold Out =====");
                        for (int i = 0; i < soldOut.size(); i++) {
                            System.out.println((i + 1) + ". " + soldOut.get(i));
                        }
                    }
                    break;

                case 6:
                    System.out.println("| YEYYY Terima kasih telah menggunakan program ini!!");
                    break;

                default:
                    System.out.println("| Wadduhhhh Pilihan tidak valid!!");
            }

        } while (pilihan != 6);
    }
}