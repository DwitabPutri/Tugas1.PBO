// mengimport util java yang digunakan
// scanner = untuk membaca atau menerima inputan
// arraylist = untuk menggunakan arraylist
import java.util.Scanner;
import java.util.ArrayList;

// class main
public class Main {
    public Main() {
    }
    // method admin yang digunakan untuk menampilkan menu yang dapat diakses oleh admin
    static void Admin() {
        System.out.println("============================Menu Admin============================");
        System.out.println("1. Lihat Restoran");
        System.out.println("2. Tambah Restoran");
        System.out.println("3. Hapus Restoran");
        System.out.println("4. Kembali Ke Menu Login");
        System.out.print("Pilih Menu yang Ingin Diakses (contoh : 1) : ");
    }

    // method customer yang digunakan untuk menampilkan menu yang dapat diakses oleh customer
    static void Customer() {
        System.out.println("===========================Menu Customer===========================");
        System.out.println("1. Lihat Restoran");
        System.out.println("2. Buat Pesanan");
        System.out.println("3. Lihat Pesanan");
        System.out.println("4. Kembali Ke Menu Login");
        System.out.print("Pilih Menu yang Ingin Diakses (contoh : 1) : ");
    }

    // method login yang ditampilkan pertama kali ketika program dijalankan
    static void Login() {
        System.out.println("============================Menu Login============================");
        System.out.println("1. Admin");
        System.out.println("2. Customer");
        System.out.println("3. Keluar");
        System.out.print("Pilih Kategori (1/2) : ");
    }

    public static void main(String[] args) {
        int Id;
        int index;
        int banyak;
        int countResto = 0;
        ArrayList<Restoran> resto = new ArrayList<>();
        ArrayList<Pesanan> pesan = new ArrayList<>();
        char loop;
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
