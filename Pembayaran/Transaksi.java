package Pembayaran;

/**
 *
 * @author user
 */
abstract class Transaksi {
    protected String nomorTransaksi;
    protected int nominalTransaksi;
    
    void Transaksi(String nomorTransaksi, int nominalTransaksi){
        this.nomorTransaksi = nomorTransaksi;
        this.nominalTransaksi = nominalTransaksi;
    }
    
    void proses(){
        
    }
}
