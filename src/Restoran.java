import java.util.ArrayList;

public class Restoran{
    // membuat arraylist baru
    private ArrayList<Utama> makananResto = new ArrayList();
    private ArrayList<Utama> minumanResto = new ArrayList();
    // variabel
    private int Id;
    private String namaResto;
    private String alamatResto;
    private String nomorTelp;
    private String ratingResto;

    // constructor
    Restoran(){
    }

    Restoran(int Id, String namaResto, String alamatResto){
        this.Id = Id;
        this.namaResto = namaResto;
        this.alamatResto = alamatResto;
        this.nomorTelp = nomorTelp;
        this.ratingResto = ratingResto;
    }

    // method getter (get)
    int getId() {
        return Id;
    }
    // method setter (set)
    public void setId(int Id) {
        this.Id = Id;
    }
    public String getNamaResto() {
        return namaResto;
    }
    public void setNamaResto(String namaResto) {
        this.namaResto = namaResto;
    }
    public String getAlamatResto() {
        return alamatResto;
    }
    public void setAlamatResto(String alamatResto) {
        this.alamatResto = alamatResto;
    }
    public String getNomorTelp(){ return nomorTelp;}
    public void setNomorTelp(String nomorTelp){this.nomorTelp = nomorTelp;}
    public String getRatingResto(){return ratingResto;}
    public void setRatingResto(String ratingResto){this.ratingResto = ratingResto;}
    public ArrayList<Utama> getMakananResto() {
        return makananResto;
    }
    public void addMakananResto(Utama makananResto) {
        this.makananResto.add(makananResto);
    }
    public ArrayList<Utama> getMinumanResto() {
        return minumanResto;
    }
    public void addMinumanResto(Utama minumanResto) {
        this.minumanResto.add(minumanResto);
    }
}