/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pembayaran;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        // Contoh transaksi dengan Kartu Kredit
        KartuKredit kartuKredit = new KartuKredit("1234567812345678");
        ProsesTransaksi transaksi1 = new ProsesTransaksi("TRX001", 100.0);
        transaksi1.prosesPembayaran(kartuKredit);

        // Contoh transaksi dengan Dompet Digital
        DompetDigital dompetDigital = new DompetDigital(50.0);
        ProsesTransaksi transaksi2 = new ProsesTransaksi("TRX002", 30.0);
        transaksi2.prosesPembayaran(dompetDigital);

        // Contoh transaksi dengan Transfer Bank
        TransferBank transferBank = new TransferBank("1234567890");
        ProsesTransaksi transaksi3 = new ProsesTransaksi("TRX003", 200.0);
        transaksi3.prosesPembayaran(transferBank);
    }
}