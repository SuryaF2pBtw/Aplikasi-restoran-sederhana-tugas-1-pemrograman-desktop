/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

/**
 *
 * @author USER
 */
import java.util.Scanner;

class Menu {
    String nama;
    String kategori;
    double harga;

    public Menu(String nama, String kategori, double harga) {
        this.nama = nama;
        this.kategori = kategori;
        this.harga = harga;
    }
}

public class Main {
    public static void main(String[] args) {
        Menu[] menuMakanan = {
            new Menu("Nasi Padang", "Makanan", 25000),
            new Menu("Mie Goreng", "Makanan", 20000),
            new Menu("Sate Ayam", "Makanan", 30000),
            new Menu("Nasi Goreng", "Makanan", 22000)
        };

        Menu[] menuMinuman = {
            new Menu("Teh Manis", "Minuman", 10000),
            new Menu("Kopi", "Minuman", 15000),
            new Menu("Es Jeruk", "Minuman", 12000),
            new Menu("Air Mineral", "Minuman", 5000)
        };

        Scanner scanner = new Scanner(System.in);

        System.out.println("Daftar Menu Makanan:");
        for (Menu menu : menuMakanan) {
            System.out.println(menu.nama + " - " + menu.kategori + " - Rp " + menu.harga);
        }
        System.out.println("\nDaftar Menu Minuman:");
        for (Menu menu : menuMinuman) {
            System.out.println(menu.nama + " - " + menu.kategori + " - Rp " + menu.harga);
        }

        System.out.println("\nMasukkan jumlah pesanan makanan (maksimal 4):");
        System.out.print("Berapa banyak Nasi Padang: ");
        int nasiPadang = scanner.nextInt();
        System.out.print("Berapa banyak Mie Goreng: ");
        int mieGoreng = scanner.nextInt();
        System.out.print("Berapa banyak Sate Ayam: ");
        int sateAyam = scanner.nextInt();
        System.out.print("Berapa banyak Nasi Goreng: ");
        int nasiGoreng = scanner.nextInt();

        System.out.println("\nMasukkan jumlah pesanan minuman (maksimal 4):");
        System.out.print("Berapa banyak Teh Manis: ");
        int tehManis = scanner.nextInt();
        System.out.print("Berapa banyak Kopi: ");
        int kopi = scanner.nextInt();
        System.out.print("Berapa banyak Es Jeruk: ");
        int esJeruk = scanner.nextInt();
        System.out.print("Berapa banyak Air Mineral: ");
        int airMineral = scanner.nextInt();

        double totalMakanan = nasiPadang * menuMakanan[0].harga + mieGoreng * menuMakanan[1].harga + sateAyam * menuMakanan[2].harga + nasiGoreng * menuMakanan[3].harga;
        double totalMinuman = tehManis * menuMinuman[0].harga + kopi * menuMinuman[1].harga + esJeruk * menuMinuman[2].harga + airMineral * menuMinuman[3].harga;

        double totalBiaya = totalMakanan + totalMinuman;

        double pajak = totalBiaya * 0.10;
        double biayaPelayanan = 20000;

        double diskon = 0;
        String penawaran = "";
        if (totalBiaya >= 100000) { // Memastikan diskon diterapkan untuk total >= 100.000
            diskon = (totalBiaya + pajak + biayaPelayanan) * 0.10;
        }

        if (totalBiaya > 50000) {
            if (tehManis > 0) {
                penawaran = "Penawaran: Beli 1 Gratis 1 untuk Teh Manis";
                tehManis += 1;
            } else if (kopi > 0) {
                penawaran = "Penawaran: Beli 1 Gratis 1 untuk Kopi";
                kopi += 1;
            } else if (esJeruk > 0) {
                penawaran = "Penawaran: Beli 1 Gratis 1 untuk Es Jeruk";
                esJeruk += 1;
            } else if (airMineral > 0) {
                penawaran = "Penawaran: Beli 1 Gratis 1 untuk Air Mineral";
                airMineral += 1;
            }
        }

        double totalPembayaran = totalBiaya + pajak + biayaPelayanan - diskon;

        System.out.println("\nPerhitungan Awal:");
        System.out.println("Total Biaya Makanan dan Minuman: Rp " + totalBiaya);
        System.out.println("Pajak 10%: Rp " + pajak);
        System.out.println("Biaya Pelayanan: Rp " + biayaPelayanan);
        System.out.println("Diskon 10%: Rp " + diskon);
        if (!penawaran.isEmpty()) System.out.println(penawaran);


        System.out.println("\nStruk Pembayaran:");
        if (nasiPadang > 0) System.out.println("Nasi Padang - " + nasiPadang + " x Rp " + menuMakanan[0].harga + " = Rp " + (nasiPadang * menuMakanan[0].harga));
        if (mieGoreng > 0) System.out.println("Mie Goreng - " + mieGoreng + " x Rp " + menuMakanan[1].harga + " = Rp " + (mieGoreng * menuMakanan[1].harga));
        if (sateAyam > 0) System.out.println("Sate Ayam - " + sateAyam + " x Rp " + menuMakanan[2].harga + " = Rp " + (sateAyam * menuMakanan[2].harga));
        if (nasiGoreng > 0) System.out.println("Nasi Goreng - " + nasiGoreng + " x Rp " + menuMakanan[3].harga + " = Rp " + (nasiGoreng * menuMakanan[3].harga));
        if (tehManis > 0) System.out.println("Teh Manis - " + tehManis + " x Rp " + menuMinuman[0].harga + " = Rp " + (tehManis * menuMinuman[0].harga));
        if (kopi > 0) System.out.println("Kopi - " + kopi + " x Rp " + menuMinuman[1].harga + " = Rp " + (kopi * menuMinuman[1].harga));
        if (esJeruk > 0) System.out.println("Es Jeruk - " + esJeruk + " x Rp " + menuMinuman[2].harga + " = Rp " + (esJeruk * menuMinuman[2].harga));
        if (airMineral > 0) System.out.println("Air Mineral - " + airMineral + " x Rp " + menuMinuman[3].harga + " = Rp " + (airMineral * menuMinuman[3].harga));

        System.out.println("\nTotal Biaya: Rp " + totalBiaya);
        System.out.println("Pajak 10%: Rp " + pajak);
        System.out.println("Biaya Pelayanan: Rp " + biayaPelayanan);
        System.out.println("Diskon 10%: Rp " + diskon);
        System.out.println("Total Pembayaran Setelah Diskon dan Penawaran: Rp " + totalPembayaran);
    }
}
