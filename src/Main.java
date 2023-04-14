import java.util.Scanner;
import java.util.ArrayList;


class Restoran {
    String Nama;
    float Rating;
    String Alamat;
    String noTelp;
    String nmk1;
    String nmk2;
    String nmk3;
    float hm1;
    float hm2;
    float hm3;
    Restoran() {
    }

    Restoran(String Nama, float Rating, String Alamat, String noTelp, String nmk1, String nmk2, String nmk3, float hm1, float hm2, float hm3) {
        this.Nama = Nama;
        this.Rating = Rating;
        this.Alamat=Alamat;
        this.noTelp=noTelp;
        this.nmk1=nmk1;
        this.nmk2=nmk2;
        this.nmk3=nmk3;
        this.hm1=hm1;
        this.hm2=hm2;
        this.hm3=hm3;
    }

    void input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama Restoran :  ");
        this.Nama = input.nextLine();
        System.out.print("Alamat Restoran : ");
        this.Alamat=input.nextLine();
        System.out.print("Nomor Telepon Restoran : ");
        this.noTelp=input.nextLine();
        System.out.print("Nama Makanan/Minuman Pertama : ");
        this.nmk1=input.nextLine();
        System.out.print("Nama Makanan/Minuman Kedua : ");
        this.nmk2=input.nextLine();
        System.out.print("Nama Makanan/Minuman Ketiga : ");
        this.nmk3=input.nextLine();
        System.out.print("Harga Makanan/Minuman Pertama : ");
        this.hm1=input.nextFloat();
        System.out.print("Harga Makanan/Minuman Kedua : ");
        this.hm2=input.nextFloat();
        System.out.print("Harga Makanan/Minuman Ketiga : ");
        this.hm3=input.nextFloat();
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
    String getNmk1(){return this.nmk1;}
    String getNmk2(){return this.nmk2;}
    String getNmk3(){return this.nmk3;}
    float getHm1(){return this.hm1;}
    float getHm2(){return this.hm2;}
    float getHm3(){return this.hm3;}
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
    void setNmk1(String nmk1){ this.nmk1 =nmk1;}
    void setNmk2(String nmk2){ this.nmk2 =nmk2;}
    void setNmk3(String nmk3){ this.nmk2 =nmk3;}
    void setNmk3(Float hm3){ this.hm3 =hm3;}
    void setNmk2(Float hm2){ this.hm2 =hm2;}
    void setNmk1(Float hm1){ this.hm1 =hm1;}
    public String toString(){
        String result = "";
        result = "\nNama Restoran : " + Nama + "\nAlamat Restoran : " + Alamat + "\nNomor Telepon Restoran : " + noTelp + "\nNama Makanan/Minuman : " + nmk1 + "\nHarga Makanan/Minuman : " + hm1 + "\nNama Makanan/Minuman : " + nmk2 + "\nHarga Makanan/Minuman : " + hm2 + "\nNama Makanan/Minuman : " + nmk3 + "\nHarga Makanan/Minuman : " +  hm3;
        return result;
    }
}


class Kelola {

    ArrayList<Restoran> restoranlist = new ArrayList();
    Restoran restoran;
    Scanner input;

    Kelola() {
        this.input = new Scanner(System.in);
    }

    void input() {
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


class Main {
    public Main() {
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
                                System.out.println("====================Melihat Restoran======================");
                                kRestoran.print();
                                break;
                            case 2:
                                System.out.println("===================Menambah Restoran======================");
                                kRestoran.input();
                                break;
                            case 3:
                                System.out.println("===================Menghapus Restoran=====================");
                                kRestoran.hapus();
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
                                System.out.println("====================Daftar Restoran======================");
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
