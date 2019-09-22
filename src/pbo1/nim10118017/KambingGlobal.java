package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Menampilkan variabel global jumlahKambing di layar sebelum dan sesudah dioperasikan.
 * 
 */
public class KambingGlobal {
    
    //Variabel jumlahKambing menjadi variabel instance.
    int jumlahKambing = 88;
    
    //Method untuk menampilkan variabel jumlahKambing.
    public void getJumlahKambing() {
        System.out.println("Jumlah kambing\t\t\t: " + jumlahKambing);
    }
    
    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        
        System.out.println("Jumlah kambing setelah ditambah\t: " + jumlahKambing);
    }
    
}
