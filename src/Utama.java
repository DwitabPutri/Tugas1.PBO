public class Utama {
    String Nama;
    float Harga;

    Utama(){
    }

    Utama(String Nama, float Harga) {
        this.Nama = Nama;
        this.Harga = Harga;
    }

    String getNama() {
        return Nama;
    }

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