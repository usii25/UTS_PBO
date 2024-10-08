/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kategori;


class Gudang {
    private String lokasiGudang;
    private List<Produk> daftarProduk;

    public Gudang(String lokasiGudang) {
        this.lokasiGudang = lokasiGudang;
        this.daftarProduk = new ArrayList<>();
    }

    public String getLokasiGudang() {
        return lokasiGudang;
    }

    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }

    public List<Produk> getDaftarProduk() {
        return daftarProduk;
    }
}
