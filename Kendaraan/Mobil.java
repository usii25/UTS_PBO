package Kendaraan;

/**
 *
 * @author user
 */
class Mobil extends Kendaraan {

    public Mobil(int kecepatanMaksimal) {
        super(kecepatanMaksimal);
    }

    public void bergerak() {
        System.out.println("Mobil bergerak dengan kecepatan maksimal " + kecepatanMaksimal + " km/jam.");
    }
}
