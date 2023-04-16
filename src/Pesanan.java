// mengimport util java yang diperlukan
// arrraylist = untuk menggunakan arraylist
import java.util.ArrayList;

public class Pesanan {

    // variabel
    int idRestoran;
    float jarak;
    float bayar;
    // membuat arraylist baru
    ArrayList<Utama> lMakanan = new ArrayList();
    ArrayList<Integer> jMakanan = new ArrayList();
    ArrayList<Utama> lMinuman = new ArrayList();
    ArrayList<Integer> jMinuman = new ArrayList();

    // constructor
    Pesanan(){
    }

    // method getter (get)
    int getIdRestoran() {
        return idRestoran;
    }

    // method setter (set)
    void setIdRestoran(int idRestoran) {
        this.idRestoran= idRestoran;
    }

    ArrayList<Utama> getLMakanan(){
        return lMakanan;
    }

    void addLMakanan(Utama makananResto){
        this.lMakanan.add(makananResto);
    }

    ArrayList<Integer> getJMakanan() {
        return jMakanan;
    }

    void addJMakanan(int jumlah) {
        this.jMakanan.add(jumlah);
    }

    ArrayList<Utama> getLMinuman(){
        return lMinuman;
    }

    void addLMinuman(Utama minumanResto){
        this.lMinuman.add(minumanResto);
    }

    ArrayList<Integer> getJMinuman() {
        return jMinuman;
    }

    void addJMinuman(int jumlah) {
        this.jMinuman.add(jumlah);
    }


    float getJarak() {
        return jarak;
    }

    void setJarak(float jarak) {
        this.jarak = jarak;
    }

    float getBayar() {
        return bayar;
    }

    void setBayar(float bayar) {
        this.bayar = bayar;
    }
}