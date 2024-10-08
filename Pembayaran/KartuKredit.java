package Pembayaran;

/**
 *
 * @author user
 */
abstract class KartuKredit implements Pembayaran {

    private String nomorKartu;

    void KartuKredit(String nomorKartu) {
        this.nomorKartu = nomorKartu;
    }

    public boolean validasiPembayaran() {
        return nomorKartu.length()==16;
    }
}
