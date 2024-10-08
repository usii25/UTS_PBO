/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kendaraan;

/**
 *
 * @author user
 */
class SepedaMotor extends Kendaraan {

    public SepedaMotor(int kecepatanMaksimal) {
        super(kecepatanMaksimal);
    }

    public void bergerak() {
        System.out.println("Sepeda motor bergerak dengan kecepatan maksimal " + kecepatanMaksimal + " km/jam.");
    }
}
