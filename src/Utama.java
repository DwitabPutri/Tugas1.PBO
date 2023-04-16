public class Utama {
    // variabel
    String Nama;
    float Harga;

    // constructor
    Utama(){
    }

    Utama(String Nama, float Harga) {
        this.Nama = Nama;
        this.Harga = Harga;
    }

    // method getter (get)
    String getNama() {
        return Nama;
    }

    // method setter (set)
    void setNama(String Nama) {
        this.Nama = Nama;
    }

    float getHarga() {
        return Harga;
    }

    void setHarga(float Harga) {
        this.Harga = Harga;
    }
}