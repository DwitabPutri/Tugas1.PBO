// mengimport util java yang diperlukan
// arrraylist = untuk menggunakan arraylist
import java.util.ArrayList;

public class Pesanan {

    // variabel
    private int idRestoran;
    private float jarak;
    private float bayar;
    // membuat arraylist baru
    private ArrayList<Utama> lMakanan = new ArrayList();
    private ArrayList<Integer> jMakanan = new ArrayList();
    private ArrayList<Utama> lMinuman = new ArrayList();
    private ArrayList<Integer> jMinuman = new ArrayList();

    // constructor
    Pesanan(){
    }

    // method getter (get)
    public int getIdRestoran() {
        return idRestoran;
    }

    // method setter (set)
    public void setIdRestoran(int idRestoran) {
        this.idRestoran= idRestoran;
    }
    public ArrayList<Utama> getLMakanan(){
        return lMakanan;
    }
    public void addLMakanan(Utama makananResto){
        this.lMakanan.add(makananResto);
    }
    public ArrayList<Integer> getJMakanan() {
        return jMakanan;
    }
    public void addJMakanan(int jumlah) {
        this.jMakanan.add(jumlah);
    }
    public ArrayList<Utama> getLMinuman(){
        return lMinuman;
    }
    public void addLMinuman(Utama minumanResto){
        this.lMinuman.add(minumanResto);
    }
    public ArrayList<Integer> getJMinuman() {
        return jMinuman;
    }
    public void addJMinuman(int jumlah) {
        this.jMinuman.add(jumlah);
    }
    public float getJarak() {
        return jarak;
    }
    public void setJarak(float jarak) {
        this.jarak = jarak;
    }
    public float getBayar() {
        return bayar;
    }
    public void setBayar(float bayar) {
        this.bayar = bayar;
    }
}