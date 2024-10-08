/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kategori;

public class Main {
    public static void main(String[] args) {
        // Membuat kategori
        Kategori kategori1 = new Kategori("Elektronik");
        Kategori kategori2 = new Kategori("Perabotan");

        // Membuat produk
        Produk produk1 = new Produk("Laptop", 10000, 5);
        Produk produk2 = new Produk("Kursi", 500, 10);

        // Menambahkan kategori ke produk
        kategori1.tambahProduk(produk1);
        kategori2.tambahProduk(produk2);

        // Membuat gudang
        Gudang gudang1 = new Gudang("Jakarta");
        Gudang gudang2 = new Gudang("Bandung");

        // Menambahkan produk ke gudang
        gudang1.tambahProduk(produk1);
        gudang1.tambahProduk(produk2);
        gudang2.tambahProduk(produk1);

        // Menampilkan informasi
        System.out.println("Produk di Gudang " + gudang1.getLokasiGudang() + ":");
        for (Produk p : gudang1.getDaftarProduk()) {
            System.out.println("- " + p.getNamaProduk());
        }

        System.out.println("\nKategori untuk Produk " + produk1.getNamaProduk() + ":");
        for (Kategori k : produk1.getDaftarKategori()) {
            System.out.println("- " + k.getNamaKategori());
        }
    }
}

