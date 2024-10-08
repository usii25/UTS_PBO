/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kategori;

import java.util.ArrayList;
import java.util.List;

// Kelas Kategori
class Kategori {
    private String namaKategori;
    private List<Produk> daftarProduk;

    public Kategori(String namaKategori) {
        this.namaKategori = namaKategori;
        this.daftarProduk = new ArrayList<>();
    }

    public String getNamaKategori() {
        return namaKategori;
    }

    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
        produk.tambahKategori(this); // Menambahkan kategori ke produk
    }

    public List<Produk> getDaftarProduk() {
        return daftarProduk;
    }
}