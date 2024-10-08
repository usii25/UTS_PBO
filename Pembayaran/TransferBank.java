/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pembayaran;

/**
 *
 * @author user
 */
abstract class TransferBank implements Pembayaran {

    private String nomorRekening;

    public TransferBank(String nomorRekening) {
        this.nomorRekening = nomorRekening;
    }

    public boolean ValidasiPembayaran() {
        return nomorRekening.length()==10;
    }
}
