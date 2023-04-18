public class Utama {
    // variabel
    private String Nama;
    private float Harga;

    // constructor
    Utama(){
    }

    Utama(String Nama, float Harga) {
        this.Nama = Nama;
        this.Harga = Harga;
    }

    // method getter (get)
    public String getNama() {
        return Nama;
    }

    // method setter (set)
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public float getHarga() {
        return Harga;
    }

    public void setHarga(float Harga) {
        this.Harga = Harga;
    }
}