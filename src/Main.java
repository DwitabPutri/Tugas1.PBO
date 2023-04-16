import java.util.Scanner;
import java.util.ArrayList;

class Utama {
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

class Restoran{
    ArrayList<Utama> makananResto = new ArrayList();
    ArrayList<Utama> minumanResto = new ArrayList();
    int Id;
    String namaResto;
    String alamatResto;

    Restoran(){
    }

    Restoran(int Id, String namaResto, String alamatResto){
        this.Id = Id;
        this.namaResto = namaResto;
        this.alamatResto = alamatResto;
    }

    int getId() {
        return Id;
    }

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

class Pesanan {
    int idRestoran;
    ArrayList<Utama> lMakanan = new ArrayList();
    ArrayList<Integer> jMakanan = new ArrayList();
    ArrayList<Utama> lMinuman = new ArrayList();
    ArrayList<Integer> jMinuman = new ArrayList();
    float jarak;
    float bayar;

    Pesanan(){
    }

    int getIdRestoran() {
        return idRestoran;
    }

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

class Main {
    public Main() {
    }

    static void Admin() {
        System.out.println("============================Menu Admin============================");
        System.out.println("1. Lihat Restoran");
        System.out.println("2. Tambah Restoran");
        System.out.println("3. Hapus Restoran");
        System.out.println("4. Kembali Ke Menu Login");
        System.out.print("Pilih Menu yang Ingin Diakses (contoh : 1) : ");
    }

    static void Customer() {
        System.out.println("===========================Menu Customer===========================");
        System.out.println("1. Lihat Restoran");
        System.out.println("2. Buat Pesanan");
        System.out.println("3. Lihat Pesanan");
        System.out.println("4. Kembali Ke Menu Login");
        System.out.print("Pilih Menu yang Ingin Diakses (contoh : 1) : ");
    }

    static void Login() {
        System.out.println("============================Menu Login============================");
        System.out.println("1. Admin");
        System.out.println("2. Customer");
        System.out.println("3. Keluar");
        System.out.print("Pilih Kategori (1/2) : ");
    }

    public static void main(String[] args) {
        new ArrayList();
        Scanner input = new Scanner(System.in);

        int pilih;
        label40:
        do {
            Login();
            pilih = Integer.parseInt(input.nextLine());
            switch (pilih) {
                case 1:
                    while(true) {
                        Admin();
                        pilih = Integer.parseInt(input.nextLine());
                        switch (pilih) {
                            case 1:
                                System.out.println("========================Melihat Restoran==========================");
                                break;
                            case 2:
                                System.out.println("=======================Menambah Restoran==========================");
                                break;
                            case 3:
                                System.out.println("=======================Menghapus Restoran=========================");
                            case 4:
                                System.out.println("Kembali Ke Menu Login");
                                break;
                        }

                        if (pilih == 4) {
                            continue label40;
                        }
                    }
                case 2:
                    do {
                        Customer();
                        pilih = Integer.parseInt(input.nextLine());
                        switch (pilih) {
                            case 1:
                                System.out.println("========================Daftar Restoran==========================");
                                break;
                            case 2:
                                System.out.println("=========================Buat Pesanan============================");
                                break;
                            case 3:
                                System.out.println("======================Lihat Detail Pesanan=======================");
                                break;
                            case 4:
                                System.out.println("Kembali ke Menu Login");
                                break;
                        }
                    } while(pilih != 4);
            }
        } while(pilih != 3);

    }
}
