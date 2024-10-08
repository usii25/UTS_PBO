/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kendaraan;

/**
 *
 * @author user
 */
public class Main {

    public static void main(String[] args) {
        Kendaraan[] kendaraanArray = new Kendaraan[3];
        kendaraanArray[0] = new Mobil(120);
        kendaraanArray[1] = new SepedaMotor(100);
        kendaraanArray[2] = new Truk(80, 1000);

        for (Kendaraan kendaraan : kendaraanArray) {
            kendaraan.bergerak();
        }
    }
}
