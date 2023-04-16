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
                                if(resto.size() > 0) {
                                    for (Restoran Resto : resto) {
                                        System.out.println("ID Restoran     : " + Resto.getId());
                                        System.out.println("Nama Restoran : " + Resto.getNamaResto());
                                        System.out.println("Alamat Restoran : " + Resto.getAlamatResto());
                                        System.out.println("=============Menu Restoran============");
                                        if (Resto.getMakananResto().size() > 0) {
                                            System.out.println("Makanan :");
                                            for (int i = 0; i < Resto.getMakananResto().size(); i++) {
                                                System.out.println((i + 1) + ". " + Resto.getMakananResto().get(i).getNama() + " ( " + Resto.getMakananResto().get(i).getHarga() + " )");
                                            }
                                        }
                                        else{
                                            System.out.println("Maaf, Restoran Tidak Menyediakan Makanan");
                                        }
                                        if(Resto.getMinumanResto().size() > 0){
                                            System.out.println("Minuman :");
                                            for(int i=0; i < Resto.getMinumanResto().size(); i++){
                                                System.out.println((i+1) + ". " + Resto.getMinumanResto().get(i).getNama() + " ( " + Resto.getMinumanResto().get(i).getHarga() + " )");
                                            }
                                        }
                                        else{
                                            System.out.println("Maaf, Restoran Tidak Menyediakan Minuman");
                                        }
                                    }
                                }
                                else{
                                    System.out.println("Mohon Tambahkan Restoran Terlebih Dahulu");
                                }
                                break;
                            case 2:
                                System.out.println("=======================Menambah Restoran==========================");
                                countResto += 1;
                                Restoran restoran = new Restoran();
                                System.out.print("Nama Restoran : ");
                                restoran.setNamaResto(input.nextLine());
                                System.out.print("Alamat Restoran : ");
                                restoran.setAlamatResto(input.nextLine());

                                while (true) {
                                    System.out.print("Ingin Menambahkan Makanan? [Y/N] : ");
                                    loop = input.nextLine().toUpperCase().charAt(0);
                                    if (loop == 'Y') {
                                        Utama makanan = new Utama();
                                        System.out.print("Nama Makanan : ");
                                        makanan.setNama(input.nextLine());
                                        System.out.print("Harga Makanan : ");
                                        makanan.setHarga(Float.valueOf(input.nextLine()));
                                        restoran.addMakananResto(makanan);
                                    } else if (loop == 'N') {
                                        break;
                                    }
                                }

                                while (true) {
                                    System.out.print("Ingin Menambahkan Minuman [Y/N] : ");
                                    loop = input.nextLine().toUpperCase().charAt(0);

                                    if (loop == 'Y') {
                                        Utama minuman = new Utama();

                                        System.out.print("Nama Minuman : ");
                                        minuman.setNama(input.nextLine());

                                        System.out.print("Harga Minuman : ");
                                        minuman.setHarga(Float.valueOf(input.nextLine()));

                                        restoran.addMinumanResto(minuman);
                                    } else if (loop == 'N') {
                                        break;
                                    }
                                }
                                restoran.setId(countResto);
                                resto.add(restoran);
                                System.out.println("Restoran Telah Ditambahkan");
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
                                if(resto.size() > 0){
                                    for(Restoran Resto : resto){
                                        System.out.println("ID Restoran      : " + Resto.getId());
                                        System.out.println("Nama Restoran   : " + Resto.getNamaResto());
                                        System.out.println("Alamat Restoran : " + Resto.getAlamatResto());
                                        System.out.println("=============Menu Restoran============");
                                        if(Resto.getMakananResto().size() > 0){
                                            System.out.println("Makanan:");
                                            for(int i=0; i < Resto.getMakananResto().size(); i++){
                                                System.out.println((i+1) + ". " + Resto.getMakananResto().get(i).getNama() + " ( " + Resto.getMakananResto().get(i).getHarga() + " )");
                                            }
                                        }else{
                                            System.out.println("Maaf, Restoran Tidak Menyediakan Makanan");
                                        }

                                        if(Resto.getMinumanResto().size() > 0){
                                            System.out.println("Minuman :");
                                            for(int i=0; i < Resto.getMinumanResto().size(); i++){
                                                System.out.println((i+1) + ". " + Resto.getMinumanResto().get(i).getNama() + " ( " + Resto.getMinumanResto().get(i).getHarga() + " )");
                                            }
                                        }else{
                                            System.out.println("Maaf, Restoran Tidak Menyediakan Minuman");
                                        }
                                    }
                                }else{
                                    System.out.println("Belum Ada Restoran yang Terdata");
                                }
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
