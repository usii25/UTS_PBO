/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kendaraan;

/**
 *
 * @author user
 */
class Truk extends Kendaraan {

    private int kapasitasMuatan;

    public Truk(int kecepatanMaksimal, int kapasitasMuatan) {
        super(kecepatanMaksimal);
        this.kapasitasMuatan = kapasitasMuatan;
    }

    public void bergerak() {
        System.out.println("Truk bergerak dengan kecepatan maksimal " + kecepatanMaksimal + " km/jam dengan kapasitas muatan " + kapasitasMuatan + " kg.");
    }
}
