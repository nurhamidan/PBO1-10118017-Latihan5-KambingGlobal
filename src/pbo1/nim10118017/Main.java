package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Membuat objek dari class KambingGlobal dan memanggil method-methodnya.
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KambingGlobal kambingSusu = new KambingGlobal();
        
        //Menampilkan jumlah kambing yang ada saat program pertama kali berjalan.
        kambingSusu.getJumlahKambing();
        
        //Menambah kambing.
        kambingSusu.tambahKambing();
        
        //Menampilkan kambing yang ada.
        kambingSusu.getJumlahKambing();
    }
    
}
