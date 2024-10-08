package Kendaraan;

/**
 *
 * @author user
 */
class Kendaraan {

    protected int kecepatanMaksimal;

    public Kendaraan(int kecepatanMaksimal) {
        this.kecepatanMaksimal = kecepatanMaksimal;
    }

    public void bergerak() {
        System.out.println("Kendaraan dapat bergerak");
    }

}
