import java.util.Scanner;
import java.util.ArrayList;

class restoran{
    String nama;
    String alamat;
    float rating;


    restoran(){
    }

    restoran(String nama, String alamat, float rating){
        this.nama=nama;
        this.alamat=alamat;
        this.rating=rating;
    }

    void input(){
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Nama Restoran : ");
        this.nama=input.nextLine();
        System.out.print("Masukkan Alamat Restoran : ");
        this.alamat=input.nextLine();
        System.out.print("Masukkan Rating Restoran : ");
        this.rating=input.nextFloat();
    }


    float getRating(){
        return this.rating;
    }
    void setRating(Float rating){
        this.rating = rating;
    }

    String getNama(){
        return this.nama;
    }
    void setNama(String nama){
        this.nama = nama;
    }

    String getAlamat(){
        return this.alamat;
    }
    void setAlamat(String alamat){
        this.alamat=alamat;
    }
}

class mengelola{
    restoran restoran;


     static void input(){
        System.out.println("Masukkan Informasi Restoran");
        restoran restoran = new restoran();
        restoran.input();

    }
    static void print(){

    }
}




// main
class Main {
    public Main(){}
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int pilih;
        label40:
        do{
            utama();
            pilih = Integer.parseInt(input.nextLine());
            switch (pilih){
                case 1 :
                    while (true){
                        admin();
                        pilih = Integer.parseInt(input.nextLine());
                        switch (pilih){
                            //ini nanti diisi dengan case yang ada
                            case 2 :
                                mengelola.input();
                            case 4 :
                                System.out.println("Kembali");
                                break;
                        }
                        if (pilih==4){
                            continue label40;
                        }

                    }
                case 2 :
                    do {
                        customer();
                        pilih=Integer.parseInt(input.nextLine());
                        switch(pilih){
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                System.out.println("Kembali");
                                break;
                        }
                    }
                    while (pilih!=4);
            }
        }
        while (pilih != 3);
    }

    static void customer(){
        System.out.println("============================Menu Admin============================");
        System.out.println("1. Lihat Restoran");
        System.out.println("2. Tambah Restoran");
        System.out.println("3. Hapus Restoran");
        System.out.println("4. Kembali Ke Menu Login");
        System.out.print("Pilih Menu yang Ingin Diakses (contoh : 1) : ");
    }
    static void admin(){
        System.out.println("============================Menu Admin============================");
        System.out.println("1. Lihat Restoran");
        System.out.println("2. Buat Pesanan");
        System.out.println("3. Lihat Pesanan");
        System.out.println("4. Kembali Ke Menu Login");
        System.out.print("Pilih Menu yang Ingin Diakses (contoh : 1) : ");
    }

    static void utama(){
        System.out.println("============================Menu Login============================");
        System.out.println("=============================Kategori=============================");
        System.out.println("1. Admin");
        System.out.println("2. Customer");
        System.out.print("Pilih Kategori (1/2) : ");
    }
}