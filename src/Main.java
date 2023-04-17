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
                                        System.out.println("\nID Restoran     : " + Resto.getId());
                                        System.out.println("Nama Restoran : " + Resto.getNamaResto());
                                        System.out.println("Alamat Restoran : " + Resto.getAlamatResto());
                                        System.out.println("Nomor Telepon Restoran : " + Resto.getNomorTelp());
                                        System.out.println("Rating Restoran : " + Resto.getRatingResto());
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
                                System.out.print("Nomor Telepon Restoran : ");
                                restoran.setNomorTelp(input.nextLine());
                                System.out.print("Rating Restoran (0-5) : ");
                                restoran.setRatingResto(input.nextLine());

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
                                System.out.print("ID Restoran yang Akan Dihapus : ");
                                Id = Integer.parseInt(input.nextLine());
                                index = -1;
                                for(int i=0; i<resto.size(); i++){
                                    if(resto.get(i).getId() == Id){
                                        index = i;
                                        break;
                                    }
                                }
                                if(index != -1){
                                    resto.remove(index);
                                    System.out.println("Restoran dengan ID " +Id + " Berhasil Dihapus ");
                                }else{
                                    System.out.println("Restoran dengan ID " +Id+" Gagal Dihapus. Inputkan ID Restoran dengan Benar");
                                }
                                break;
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
                                        System.out.println("\nID Restoran      : " + Resto.getId());
                                        System.out.println("Nama Restoran   : " + Resto.getNamaResto());
                                        System.out.println("Alamat Restoran : " + Resto.getAlamatResto());
                                        System.out.println("Nomor Telepon Restoran : " + Resto.getNomorTelp());
                                        System.out.println("Rating Restoram : " + Resto.getRatingResto());
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
                                if(resto.size() > 0){
                                    System.out.print("ID Restoran : ");
                                    Id = Integer.parseInt(input.nextLine());

                                    index = -1;
                                    for(int i=0; i<resto.size(); i++){
                                        if(resto.get(i).getId() == Id){
                                            index = i;
                                            break;
                                        }
                                    }

                                    if(index != -1){
                                        ArrayList<Utama> Utama;
                                        float total = 0;
                                        Pesanan pesancust = new Pesanan();
                                        pesancust.setIdRestoran(resto.get(index).getId());
                                        System.out.println("=============Menu Restoran============");
                                        if(resto.get(index).getMakananResto().size() > 0){
                                            System.out.println("Daftar Makanan :");
                                            Utama = resto.get(index).getMakananResto();
                                            for(int i=0; i<Utama.size(); i++){
                                                System.out.println((i+1) + ". " + Utama.get(i).getNama() + " ( " + Utama.get(i).getHarga() + " )");
                                            }
                                            while(true){
                                                System.out.print("Ingin Memesan Makanan? [Y/N] : ");
                                                loop = input.nextLine().toUpperCase().charAt(0);

                                                if(loop == 'Y'){
                                                    System.out.print("ID Makanan yang Ingin Dipesan (misalnya : 1) : ");
                                                    Id = Integer.parseInt(input.nextLine());

                                                    if(Id >= 1 && Id <= Utama.size()){
                                                        Id -= 1;

                                                        pesancust.addLMakanan(Utama.get(Id));

                                                        while(true){
                                                            System.out.print("Banyak Pembelian : ");
                                                            banyak = Integer.parseInt(input.nextLine());

                                                            if(banyak <= 0){
                                                                System.out.println("Mohon Inputkan Banyak Pembelian dengan Benar");
                                                            }else{
                                                                break;
                                                            }
                                                        }
                                                        pesancust.addJMakanan(banyak);
                                                        total += Utama.get(Id).getHarga() * pesancust.getJMakanan().get(pesancust.getLMakanan().size()-1);
                                                        System.out.println("Pesanan Makanan Berhasil Ditambahkan");
                                                    }else{
                                                        System.out.println("Mohon Masukkan ID Makanan dengan Benar");
                                                    }
                                                }else if(loop == 'N'){
                                                    break;
                                                }
                                            }
                                        }

                                        if(resto.get(index).getMinumanResto().size() > 0){
                                            System.out.println("Daftar Minuman :");
                                            Utama = resto.get(index).getMinumanResto();
                                            for(int i=0; i<Utama.size(); i++){
                                                System.out.println((i+1) + ". " + Utama.get(i).getNama() + " ( " + Utama.get(i).getHarga() + " )");
                                            }
                                            while(true){
                                                System.out.print("Ingin Memesan Minuman? [Y/N] : ");
                                                loop = input.nextLine().toUpperCase().charAt(0);

                                                if(loop == 'Y'){
                                                    System.out.print("ID Minuman yang Ingin Dipesan (misalnya : 1) : ");
                                                    Id = Integer.parseInt(input.nextLine());

                                                    if(Id >= 1 && Id <= Utama.size()){
                                                        Id -= 1;

                                                        pesancust.addLMinuman(Utama.get(Id));

                                                        while(true){
                                                            System.out.print("Banyak Pembelian : ");
                                                            banyak = Integer.parseInt(input.nextLine());

                                                            if(banyak <= 0){
                                                                System.out.println("Mohon Inputkan Banyak Pembelian dengan Benar");
                                                            }else{
                                                                break;
                                                            }
                                                        }
                                                        pesancust.addJMinuman(banyak);
                                                        total += Utama.get(Id).getHarga() * pesancust.getJMinuman().get(pesancust.getJMinuman().size()-1);
                                                        System.out.println("Pesanan Minuman Berhasil Ditambahkan");
                                                    }else{
                                                        System.out.println("Mohon Masukkan ID Minuman dengan Benar");
                                                    }
                                                }else if(loop == 'N'){
                                                    break;
                                                }
                                            }
                                        }

                                        while(true){
                                            System.out.println("CATATAN : Biaya ongkir akan dihitung berdasarkan jarak. Setiap 1km akan dikenakan biaya ongkir sebesar Rp5000.");
                                            System.out.print("Jarak atau Lokasi Anda (dalam km : 1) : ");
                                            pesancust.setJarak(Float.valueOf(input.nextLine()));

                                            if(pesancust.getJarak() <= 0){
                                                System.out.println("Mohon Masukkan Jarak atau Lokasi Anda dengan Benar");
                                            }else{
                                                break;
                                            }
                                        }

                                        pesancust.setBayar(total);

                                        System.out.println("Pesanan Anda Telah Ditambahkan, Terima Kasih!");
                                        pesan.add(pesancust);
                                    }else{
                                        System.out.println("Mohon Inputkan ID Restoran dengan Benar. Restoran dengan ID " + Id + " Tidak Ditemukan");
                                    }
                                }else{
                                    System.out.println("Tidak Ada Restoran yang Terdata, Mohon Maaf Anda Belum Dapat Membuat Pesanan");
                                }
                                break;
                            case 3:
                                System.out.println("======================Lihat Detail Pesanan=======================");
                                if(pesan.size() > 0){
                                    System.out.println("==========================Detail Pesanan=========================");
                                    for(Pesanan pesancust : pesan){
                                        System.out.println("\nID Restoran : " + pesancust.getIdRestoran());
                                        System.out.println("Jarak Lokasi Antar : " + pesancust.getJarak() + " km");
                                        if(pesancust.getLMakanan().size() > 0){
                                            System.out.println("Makanan yang Dipesan :");
                                            for(int i=0; i < pesancust.getLMakanan().size(); i++){
                                                System.out.println((i+1) + ". " + pesancust.getLMakanan().get(i).getNama() + " ( " + pesancust.getLMakanan().get(i).getHarga() + " ) x " + pesancust.getJMakanan().get(i));
                                            }
                                        }

                                        if(pesancust.getLMinuman().size() > 0){
                                            System.out.println("Minuman yang Dipesan :");
                                            for(int i=0; i < pesancust.getLMinuman().size(); i++){
                                                System.out.println((i+1) + ". " + pesancust.getLMinuman().get(i).getNama() + " ( " + pesancust.getLMinuman().get(i).getHarga() + " ) x " + pesancust.getJMinuman().get(i));
                                            }
                                        }
                                        float totalbayar;
                                        float ongkir;
                                        ongkir = pesancust.getJarak()*5000;
                                        totalbayar = ongkir + pesancust.getBayar();
                                        System.out.println("Biaya Ongkir : " + ongkir);
                                        System.out.println("Total Biaya : " + totalbayar);
                                    }
                                }else{
                                    System.out.println("Tidak Ada Data Pesanan yang Terdata. Lakukan Pemesanan Terlebih Dahulu");
                                }
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
