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
       Transaksi kartuKredit = new KartuKredit(nomorTransaksi:"T001", nominalTransaksi:500, nomorKartu:23456789);
       Transaksi dompetDigital = new DompetDigital(nomorTransaksi:"T002", nominalTransaksi:1000, nomorKartu:23456790);
        Transaksi transferBank = new TransferBank(nomorTransaksi:"T003", nominalTransaksi:1500, nomorKartu:23456791);

        kartuKredit.proses();
        dompetDigital.proses();
        transferBank.proses();
    }
}
