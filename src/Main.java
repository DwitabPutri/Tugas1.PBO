import java.util.Scanner;
import java.util.ArrayList;


class Restoran {
    String Nama;
    float Rating;
    String Alamat;
    String noTelp;

    Restoran() {
    }

    Restoran(String Nama, float Rating, String Alamat, String noTelp) {
        this.Nama = Nama;
        this.Rating = Rating;
        this.Alamat=Alamat;
        this.noTelp=noTelp;
    }

    void input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama Restoran :  ");
        this.Nama = input.nextLine();
        System.out.print("Alamat Restoran : ");
        this.Alamat=input.nextLine();
        System.out.print("Nomor Telepon Restoran : ");
        this.noTelp=input.nextLine();
        System.out.print("Rating Restoran : ");
        this.Rating = input.nextFloat();
    }




    float getRating() {
        return this.Rating;
    }

    String getNama() {
        return this.Nama;
    }
    String getAlamat() {
        return this.Alamat;
    }
    String getNoTelp() {
        return this.noTelp;
    }
    void setNama(String Nama) {
        this.Nama = Nama;
    }
    void setRating(Float Rating) {
        this.Rating = Rating;
    }
    void setAlamat(String Alamat) {
        this.Alamat=Alamat;
    }
    void setNoTelp(String noTelp){
        this.noTelp=noTelp;
    }
    public String toString(){
        String result = "";
        result = "\nNama Restoran : " + Nama + "\nAlamat Restoran : " + Alamat + "\nNomor Telepon Restoran : " + noTelp + "\nRating : " + Rating;
        return result;
    }
}


class Kelola {

    ArrayList<Restoran> restoranlist = new ArrayList();
    Restoran restoran;

    int SelectFood;
    Scanner input;

    Kelola() {
        this.input = new Scanner(System.in);
    }

    void input() {
        System.out.println("Masukkan Informasi Restoran");

        Restoran restoran = new Restoran();
        restoran.input();
        this.restoranlist.add(restoran);
    }

    void print() {
        for(int i = 0; i < this.restoranlist.size(); ++i) {
            System.out.println(((Restoran)this.restoranlist.get(i)));
        }
    }
    void hapus(){
        int x = 0;
        String hapusresto;
        System.out.print("Masukkan nama restoran yang ingin dihapus : ");
        hapusresto=this.input.nextLine();

        for(int i = 0; i < this.restoranlist.size(); ++i) {
            if (((Restoran)this.restoranlist.get(i)).getNama().equals(hapusresto)) {
                ++x;
                this.restoranlist.remove(i);
                System.out.println("Restoran berhasil di hapus");
                break;
            }
        }

        if (x==0){
            System.out.println("Tidak ada restoran yang sesuai");
        }
    }
}
class TestMain {
    public TestMain() {
    }

    public static void main(String[] args) {
        new ArrayList();
        Kelola kRestoran = new Kelola();
        Scanner input = new Scanner(System.in);

        int pilih;
        label40:
        do {
            utama();
            pilih = Integer.parseInt(input.nextLine());
            switch (pilih) {
                case 1:
                    while(true) {
                        admin();
                        pilih = Integer.parseInt(input.nextLine());
                        switch (pilih) {
                            case 1:
                                kRestoran.print();
                                break;
                            case 2:
                                kRestoran.input();
                                break;
                            case 3:
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
                        customer();
                        pilih = Integer.parseInt(input.nextLine());
                        switch (pilih) {
                            case 1:
                                kRestoran.print();
                                break;
                            case 2:
                            case 3:
                            case 4:
                                System.out.println("Kembali ke Menu Login");
                                break;
                        }
                    } while(pilih != 4);
            }
        } while(pilih != 3);

    }

    static void admin() {
        System.out.println("============================Menu Admin============================");
        System.out.println("1. Lihat Restoran");
        System.out.println("2. Tambah Restoran");
        System.out.println("3. Hapus Restoran");
        System.out.println("4. Kembali Ke Menu Login");
        System.out.print("Pilih Menu yang Ingin Diakses (contoh : 1) : ");
    }

    static void customer() {
        System.out.println("===========================Menu Customer===========================");
        System.out.println("1. Lihat Restoran");
        System.out.println("2. Buat Pesanan");
        System.out.println("3. Lihat Pesanan");
        System.out.println("4. Kembali Ke Menu Login");
        System.out.print("Pilih Menu yang Ingin Diakses (contoh : 1) : ");
    }

    static void utama() {
        System.out.println("============================Menu Login============================");
        System.out.println("1. Admin");
        System.out.println("2. Customer");
        System.out.println("3. Keluar");
        System.out.print("Pilih Kategori (1/2) : ");
    }
}
