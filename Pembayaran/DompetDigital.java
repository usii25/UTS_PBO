/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pembayaran;

/**
 *
 * @author user
 */
abstract class DompetDigital implements Pembayaran {

    private double saldo;

    public DompetDigital(double saldo) {
        this.saldo = saldo;
    }

    public boolean ValidasiPembayaran() {
        return saldo > 0;
    }
}
