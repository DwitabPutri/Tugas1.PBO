import java.util.ArrayList;

public class Restoran{
    // membuat arraylist baru
    ArrayList<Utama> makananResto = new ArrayList();
    ArrayList<Utama> minumanResto = new ArrayList();
    // variabel
    int Id;
    String namaResto;
    String alamatResto;

    // constructor
    Restoran(){
    }

    Restoran(int Id, String namaResto, String alamatResto){
        this.Id = Id;
        this.namaResto = namaResto;
        this.alamatResto = alamatResto;
    }

    // method getter (get)
    int getId() {
        return Id;
    }

    // method setter (set)
    void setId(int Id) {
        this.Id = Id;
    }

    String getNamaResto() {
        return namaResto;
    }

    void setNamaResto(String namaResto) {
        this.namaResto = namaResto;
    }

    String getAlamatResto() {
        return alamatResto;
    }

    void setAlamatResto(String alamatResto) {
        this.alamatResto = alamatResto;
    }

    ArrayList<Utama> getMakananResto() {
        return makananResto;
    }

    void setMakananResto(ArrayList<Utama> makananResto) {
        this.makananResto = makananResto;
    }

    void addMakananResto(Utama makananResto) {
        this.makananResto.add(makananResto);
    }

    ArrayList<Utama> getMinumanResto() {
        return minumanResto;
    }

    void setMinumanResto(ArrayList<Utama> minumanResto) {
        this.minumanResto = minumanResto;
    }

    void addMinumanResto(Utama minumanResto) {
        this.minumanResto.add(minumanResto);
    }
}