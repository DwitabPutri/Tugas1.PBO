// mengimport util java yang digunakan
// scanner = untuk membaca atau menerima inputan
// arraylist = untuk menggunakan arraylist
import java.util.Scanner;
import java.util.ArrayList;

// class main
public class Main {
    public Main() {
    }
    
    public static void Admin() {
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.println("|                                                     Menu Admin                                                   |");
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.println("1. Lihat Restoran");
        System.out.println("2. Tambah Restoran");
        System.out.println("3. Hapus Restoran");
        System.out.println("4. Kembali Ke Menu Login");
        System.out.print("Pilih Menu yang Ingin Diakses (contoh : 1) : ");
    }

    // method customer yang digunakan untuk menampilkan menu yang dapat diakses oleh customer
    public static void Customer() {
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.println("|                                                    Menu Customer                                                  |");
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.println("1. Lihat Restoran");
        System.out.println("2. Buat Pesanan");
        System.out.println("3. Lihat Pesanan");
        System.out.println("4. Kembali Ke Menu Login");
        System.out.print("Pilih Menu yang Ingin Diakses (contoh : 1) : ");
    }

    // method login yang ditampilkan pertama kali ketika program dijalankan
    public static void Login() {
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.println("|                                                     Menu Login                                                   |");
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.println("1. Admin");
        System.out.println("2. Customer");
        System.out.println("3. Keluar");
        System.out.print("Pilih Kategori (1/2) : ");
    }

    public static void main(String[] args) {
        // variabel yang digunakan
        int Id;
        int index;
        int banyak;
        int countResto = 0;

        // arraylist yang digunakan
        ArrayList<Restoran> resto = new ArrayList<>();
        ArrayList<Pesanan> pesan = new ArrayList<>();

        // variabel char untuk melakukan looping saat menginputkan nama makanan, minuman, dan pesanan
        char loop;

        // scanner yang digunakan untuk menerima inputan
        Scanner input = new Scanner(System.in);

        // variabel yang menentukan menu yang akan ditampilkan
        int pilih;

        //
        label40:

        do {
            // menampilkan method Login
            Login();
            pilih = Integer.parseInt(input.nextLine());

            // switch case dengan variabel pilih
            switch (pilih) {

                // case 1 : apabila angka yang diinputkan = 1 (login)
                case 1:
                    while(true) {

                        // menampilkan method Admin
                        Admin();
                        pilih = Integer.parseInt(input.nextLine());

                        // switch case dengan variabel pilih untuk menentukan menu admin yang akan ditampilkan
                        switch (pilih) {

                            // case 1 : apabila angka yang diinputkan = 1
                            case 1:
                                // menu untuk melihat restoran yang telah ditambahkan
                                System.out.println("==================================================Melihat Restoran==================================================");

                                // if : untuk menampilkan restoran apabila ada restoran yang terdata
                                if(resto.size() > 0) {
                                    for (Restoran Resto : resto) {
                                        System.out.println("\n=================================================Informasi Restoran=================================================");
                                        System.out.println("ID Restoran     : " + Resto.getId());
                                        System.out.println("Nama Restoran : " + Resto.getNamaResto());
                                        System.out.println("Alamat Restoran : " + Resto.getAlamatResto());
                                        System.out.println("Nomor Telepon Restoran : " + Resto.getNomorTelp());
                                        System.out.println("Rating Restoran : " + Resto.getRatingResto());
                                        System.out.println("---------------------------------------------------Menu Restoran----------------------------------------------------");

                                        // if : untuk menampilkan makanan yang ada pada restoran
                                        if (Resto.getMakananResto().size() > 0) {
                                            System.out.println("Makanan :");
                                            for (int i = 0; i < Resto.getMakananResto().size(); i++) {
                                                System.out.println((i + 1) + ". " + Resto.getMakananResto().get(i).getNama() + " ( " + Resto.getMakananResto().get(i).getHarga() + " )");
                                            }
                                        }
                                        // else : jika tidak ada makanan yang terdaftar pada restoran
                                        else{
                                            System.out.println("Maaf, Restoran Tidak Menyediakan Makanan");
                                        }

                                        // if : untuk menampilkan minuman yang ada pada restoran
                                        if(Resto.getMinumanResto().size() > 0){
                                            System.out.println("Minuman :");
                                            for(int i=0; i < Resto.getMinumanResto().size(); i++){
                                                System.out.println((i+1) + ". " + Resto.getMinumanResto().get(i).getNama() + " ( " + Resto.getMinumanResto().get(i).getHarga() + " )");
                                            }
                                        }
                                        // else : jika tidak ada minuman yang terdaftar pada restoran
                                        else{
                                            System.out.println("Maaf, Restoran Tidak Menyediakan Minuman");
                                        }
                                    }
                                }

                                // else : jika tidak ada restoran yang terdata
                                else{
                                    System.out.println("Mohon Tambahkan Restoran Terlebih Dahulu");
                                }
                                break;
                            case 2: // case 2 : apabila angka yang diinputkan = 2

                                // menu untuk menambah restoran
                                System.out.println("==================================================Menambah Restoran=================================================");
                                countResto += 1;

                                // objek baru
                                Restoran restoran = new Restoran();

                                // menerima inputan mengenai informasi restoran
                                System.out.print("Nama Restoran : ");
                                restoran.setNamaResto(input.nextLine());
                                System.out.print("Alamat Restoran : ");
                                restoran.setAlamatResto(input.nextLine());
                                System.out.print("Nomor Telepon Restoran : ");
                                restoran.setNomorTelp(input.nextLine());
                                System.out.print("Rating Restoran (0-5) : ");
                                restoran.setRatingResto(input.nextLine());

                                // perulangan untukn menerima inputan makanan
                                while (true) {
                                    System.out.print("Ingin Menambahkan Makanan? [Y/N] : ");
                                    loop = input.nextLine().toUpperCase().charAt(0);

                                    // jika menginputkan : y
                                    if (loop == 'Y') {
                                        Utama makanan = new Utama();
                                        System.out.print("Nama Makanan : ");
                                        makanan.setNama(input.nextLine());
                                        System.out.print("Harga Makanan : ");
                                        makanan.setHarga(Float.valueOf(input.nextLine()));
                                        restoran.addMakananResto(makanan);
                                    }

                                    // jika menginputkan : N maka looping untuk menambahkan makanan akan berhenti
                                    else if (loop == 'N') {
                                        break;
                                    }
                                }

                                // perulangan untuk menerima inputan minuman
                                while (true) {
                                    System.out.print("Ingin Menambahkan Minuman [Y/N] : ");
                                    loop = input.nextLine().toUpperCase().charAt(0);

                                    // jika menginputkan : y
                                    if (loop == 'Y') {
                                        Utama minuman = new Utama();

                                        System.out.print("Nama Minuman : ");
                                        minuman.setNama(input.nextLine());

                                        System.out.print("Harga Minuman : ");
                                        minuman.setHarga(Float.valueOf(input.nextLine()));

                                        restoran.addMinumanResto(minuman);
                                    }

                                    // jika menginputkan : N maka looping untuk menambahkan minuman akan berhenti
                                    else if (loop == 'N') {
                                        break;
                                    }
                                }

                                // untuk menge-set Id restoran secara otomatis (dimulai dari angka atau ID 1)
                                restoran.setId(countResto);

                                // untuk menambahkan restoran
                                resto.add(restoran);
                                System.out.println("Restoran Telah Ditambahkan");
                                break;

                            case 3: // case 3 : apabila menginputkan angka 3

                                // menu untuk menghapus restoran
                                System.out.println("=================================================Menghapus Restoran=================================================");

                                // if : jika ada restoran yang terdata
                                if(resto.size() > 0){

                                    // for : perulangan untuk menampilkan informasi restoran
                                    for(Restoran Resto : resto){
                                        System.out.println("\n=================================================Informasi Restoran=================================================");
                                        System.out.println("ID Restoran      : " + Resto.getId());
                                        System.out.println("Nama Restoran   : " + Resto.getNamaResto());
                                        System.out.println("Alamat Restoran : " + Resto.getAlamatResto());
                                        System.out.println("Nomor Telepon Restoran : " + Resto.getNomorTelp());
                                        System.out.println("Rating Restoram : " + Resto.getRatingResto());
                                        System.out.println("---------------------------------------------------Menu Restoran----------------------------------------------------");

                                        // if : jika ada makanan yang terdata
                                        if(Resto.getMakananResto().size() > 0){
                                            System.out.println("Makanan:");

                                            // perulangan untuk menampilkan makanan
                                            for(int i=0; i < Resto.getMakananResto().size(); i++){
                                                System.out.println((i+1) + ". " + Resto.getMakananResto().get(i).getNama() + " ( " + Resto.getMakananResto().get(i).getHarga() + " )");
                                            }
                                        }

                                        // else : jika tidak ada makanan yang terdata
                                        else{
                                            System.out.println("Maaf, Restoran Tidak Menyediakan Makanan");
                                        }

                                        // if : jika ada minuman yang terdata
                                        if(Resto.getMinumanResto().size() > 0){
                                            System.out.println("Minuman :");

                                            // perulangan untuk menampilkan minuman
                                            for(int i=0; i < Resto.getMinumanResto().size(); i++){
                                                System.out.println((i+1) + ". " + Resto.getMinumanResto().get(i).getNama() + " ( " + Resto.getMinumanResto().get(i).getHarga() + " )");
                                            }
                                        }

                                        // else : jika tidak ada minuman yang terdata
                                        else{
                                            System.out.println("Maaf, Restoran Tidak Menyediakan Minuman");
                                        }
                                    }
                                }

                                // else : jika tidak ada restoran yang terdata
                                else{
                                    System.out.println("Belum Ada Restoran yang Terdata");
                                }

                                // menerima inputan id restoran yang akan dihapus
                                System.out.print("\nID Restoran yang Akan Dihapus : ");
                                Id = Integer.parseInt(input.nextLine());
                                index = -1;

                                // perulangan untuk mengecek apakah ada restoran dengan id yang sama dengan id yang diinputkan
                                for(int i=0; i<resto.size(); i++){
                                    if(resto.get(i).getId() == Id){
                                        index = i;
                                        break;
                                    }
                                }

                                // if : jika ada restoran dengan id yang sama dengan id yang diinputkan
                                if(index != -1){
                                    resto.remove(index);
                                    System.out.println("Restoran dengan ID " +Id + " Berhasil Dihapus ");
                                }

                                // else : jika tidak ada restoran dengan id yang sama dengan id yang diinputkan
                                else{
                                    System.out.println("Restoran dengan ID " +Id+" Gagal Dihapus. Inputkan ID Restoran dengan Benar");
                                }
                                break;
                            case 4: // case 4 : jika menginputkan angka 4

                                // kembali ke menu login
                                System.out.println("Kembali Ke Menu Login");
                                break;
                        }

                        // kembali ke menu login apabila menginputkan angka 4
                        if (pilih == 4) {
                            continue label40;
                        }
                    }

                // case 2 : jika menginputkan angka 2 (login)
                case 2:
                    do {

                        // menampilkan method customer
                        Customer();
                        pilih = Integer.parseInt(input.nextLine());

                        // switch dengan variabel pilih
                        switch (pilih) {

                            // case 1 : jika angka yang diinputkan = 1
                            case 1:

                                // melihat daftar restoran yang telah ditambahkan oleh admin
                                System.out.println("===================================================Daftar Restoran==================================================");

                                // if : jika ada restoran yang terdata
                                if(resto.size() > 0){
                                    for(Restoran Resto : resto){
                                        System.out.println("\n=================================================Informasi Restoran=================================================");
                                        System.out.println("ID Restoran      : " + Resto.getId());
                                        System.out.println("Nama Restoran   : " + Resto.getNamaResto());
                                        System.out.println("Alamat Restoran : " + Resto.getAlamatResto());
                                        System.out.println("Nomor Telepon Restoran : " + Resto.getNomorTelp());
                                        System.out.println("Rating Restoram : " + Resto.getRatingResto());
                                        System.out.println("---------------------------------------------------Menu Restoran----------------------------------------------------");

                                        // if : jika ada makanan pada restoran terkait yang terdata
                                        if(Resto.getMakananResto().size() > 0){
                                            System.out.println("Makanan:");

                                            // perulangan untuk menampilkan makanan
                                            for(int i=0; i < Resto.getMakananResto().size(); i++){
                                                System.out.println((i+1) + ". " + Resto.getMakananResto().get(i).getNama() + " ( " + Resto.getMakananResto().get(i).getHarga() + " )");
                                            }
                                        }

                                        // else : jika tidak ada makanan pada restoran terkait yang terdata
                                        else{
                                            System.out.println("Maaf, Restoran Tidak Menyediakan Makanan");
                                        }

                                        // if : jika ada minuman pada restoran terkait yang terdata
                                        if(Resto.getMinumanResto().size() > 0){
                                            System.out.println("Minuman :");

                                            // perulangan untuk menampilkan minuman
                                            for(int i=0; i < Resto.getMinumanResto().size(); i++){
                                                System.out.println((i+1) + ". " + Resto.getMinumanResto().get(i).getNama() + " ( " + Resto.getMinumanResto().get(i).getHarga() + " )");
                                            }
                                        }

                                        // else : jika tidak ada minuman pada restoran terkait yang terdata
                                        else{
                                            System.out.println("Maaf, Restoran Tidak Menyediakan Minuman");
                                        }
                                    }
                                }

                                // else : jika tidak ada restoran yang terdata atau belum ada restoran yang ditambahkan oleh admin
                                else{
                                    System.out.println("Belum Ada Restoran yang Terdata");
                                }
                                break;

                            // case 2 : jika menginputkan angka 2
                            case 2:

                                // menu untuk membuat pesanan
                                System.out.println("====================================================Buat Pesanan====================================================");

                                // if : jika ada restoran yang terdata
                                if(resto.size() > 0){

                                    // perulangan untuk menampilkan informasi restoran
                                    for(Restoran Resto : resto){
                                        System.out.println("\n=================================================Informasi Restoran=================================================");
                                        System.out.println("ID Restoran      : " + Resto.getId());
                                        System.out.println("Nama Restoran   : " + Resto.getNamaResto());
                                        System.out.println("Alamat Restoran : " + Resto.getAlamatResto());
                                        System.out.println("Nomor Telepon Restoran : " + Resto.getNomorTelp());
                                        System.out.println("Rating Restoram : " + Resto.getRatingResto());
                                        System.out.println("---------------------------------------------------Menu Restoran----------------------------------------------------");

                                        // if : jika ada makanan yang terdata pada restoran terkait
                                        if(Resto.getMakananResto().size() > 0){
                                            System.out.println("Makanan:");

                                            // perulangan untuk menampilkan makanan
                                            for(int i=0; i < Resto.getMakananResto().size(); i++){
                                                System.out.println((i+1) + ". " + Resto.getMakananResto().get(i).getNama() + " ( " + Resto.getMakananResto().get(i).getHarga() + " )");
                                            }
                                        }

                                        // else : jika tidak ada makanan yang terdata pada restoran terkait
                                        else{
                                            System.out.println("Maaf, Restoran Tidak Menyediakan Makanan");
                                        }

                                        // if : jika ada minuman yang terdata pada restoran terkait
                                        if(Resto.getMinumanResto().size() > 0){
                                            System.out.println("Minuman :");

                                            // perulangan untuk menampilkan minuman
                                            for(int i=0; i < Resto.getMinumanResto().size(); i++){
                                                System.out.println((i+1) + ". " + Resto.getMinumanResto().get(i).getNama() + " ( " + Resto.getMinumanResto().get(i).getHarga() + " )");
                                            }
                                        }

                                        // else : jika tidak ada minuman yang terdata pada restoran terkait
                                        else{
                                            System.out.println("Maaf, Restoran Tidak Menyediakan Minuman");
                                        }
                                    }
                                }

                                // else : jika tidak ada atau belum ada restoran yang didaftarkan oleh admin
                                else{
                                    System.out.println("Belum Ada Restoran yang Terdata");
                                }

                                // if : jika ada restoran == maka akan ada inputan untuk menerima id restoran tempat makanan akan dipesan
                                if(resto.size() > 0){
                                    System.out.print("\nID Restoran yang Ingin Dipesan : ");
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

                                        // variabel yang digunakan untuk menghitung total biaya pesanan makanan dan minuman
                                        float total = 0;
                                        Pesanan pesancust = new Pesanan();
                                        pesancust.setIdRestoran(resto.get(index).getId());

                                        // menampilkan menu makanan dari id restoran yang dipilih
                                        System.out.println("---------------------------------------------------Menu Restoran----------------------------------------------------");
                                        if(resto.get(index).getMakananResto().size() > 0){
                                            System.out.println("Daftar Makanan :");
                                            Utama = resto.get(index).getMakananResto();
                                            for(int i=0; i<Utama.size(); i++){
                                                System.out.println((i+1) + ". " + Utama.get(i).getNama() + " ( " + Utama.get(i).getHarga() + " )");
                                            }

                                            // perulangan untuk menampilkan apakah ingin menambahkan makanan pada pesanan
                                            while(true){
                                                System.out.print("Ingin Memesan Makanan? [Y/N] : ");
                                                loop = input.nextLine().toUpperCase().charAt(0);

                                                // if : jika ingin memesan makanan : y
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
                                                    }

                                                    // else : jika salah menginputkan id makanan
                                                    else{
                                                        System.out.println("Mohon Masukkan ID Makanan dengan Benar");
                                                    }
                                                }

                                                // else if : loop berhenti ketika huruf yang diinputkan adalah N -- lanjut ke info menambah minuman pada pesanan
                                                else if(loop == 'N'){
                                                    break;
                                                }
                                            }
                                        }

                                        // perulangan yang serupa dengan perulangan untuk menampilkan dan menambah makanan pada pesanan
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

                                        // untuk menginputkan jarak atau lokasi
                                        while(true){
                                            System.out.println("--------------------------------------------------------------------------------------------------------------------");
                                            System.out.println("|  CATATAN : Biaya ongkir akan dihitung berdasarkan jarak. Setiap 1km akan dikenakan biaya ongkir sebesar Rp5000.  |");
                                            System.out.println("--------------------------------------------------------------------------------------------------------------------");
                                            System.out.print("Jarak atau Lokasi Anda (dalam km : 1) : ");
                                            pesancust.setJarak(Float.valueOf(input.nextLine()));

                                            // if : jika jarak atau lokasi yang diinputkan salah (lebih kecil sama dengan 0)
                                            if(pesancust.getJarak() <= 0){
                                                System.out.println("Mohon Masukkan Jarak atau Lokasi Anda dengan Benar");
                                            }

                                            // else : jika jarak yang diinputkan benar
                                            else{
                                                break;
                                            }
                                        }

                                        // untuk meng-set total biaya pesanan (bukan termasuk ongkir)
                                        pesancust.setBayar(total);

                                        System.out.println("Pesanan Anda Telah Ditambahkan, Terima Kasih!");
                                        pesan.add(pesancust);
                                    }

                                    // else : jika id restoran yang diinputkan salah
                                    else{
                                        System.out.println("Mohon Inputkan ID Restoran dengan Benar. Restoran dengan ID " + Id + " Tidak Ditemukan");
                                    }
                                }

                                // else : jika tidak ada restoran yang ditambahkan oleh admin
                                else{
                                    System.out.println("Tidak Ada Restoran yang Terdata, Mohon Maaf Anda Belum Dapat Membuat Pesanan");
                                }
                                break;
                            case 3:

                                // menu untuk menampilkan detail pesanan
                                System.out.println("================================================Lihat Detail Pesanan================================================");

                                // if : jika ada pesanan yang telah dibuat
                                if(pesan.size() > 0){

                                    // perulangan untuk menampilkan detail informasi pesanan yang telah dibuat
                                    for(Pesanan pesancust : pesan){
                                        System.out.println("\n===================================================Detail Pesanan===================================================");
                                        System.out.println("ID Restoran : " + pesancust.getIdRestoran());
                                        System.out.println("Jarak Lokasi Antar : " + pesancust.getJarak() + " km");

                                        // if : jika ada makanan yang dipesan
                                        if(pesancust.getLMakanan().size() > 0){
                                            System.out.println("Makanan yang Dipesan :");

                                            // perulangan untuk menampilkan makanan yang dipesan
                                            for(int i=0; i < pesancust.getLMakanan().size(); i++){
                                                System.out.println((i+1) + ". " + pesancust.getLMakanan().get(i).getNama() + " ( " + pesancust.getLMakanan().get(i).getHarga() + " ) x " + pesancust.getJMakanan().get(i));
                                            }
                                        }

                                        // if : jika ada minuman yang dipesan
                                        if(pesancust.getLMinuman().size() > 0){
                                            System.out.println("Minuman yang Dipesan :");

                                            // perulangan untuk menampilkan minuman yang dipesan
                                            for(int i=0; i < pesancust.getLMinuman().size(); i++){
                                                System.out.println((i+1) + ". " + pesancust.getLMinuman().get(i).getNama() + " ( " + pesancust.getLMinuman().get(i).getHarga() + " ) x " + pesancust.getJMinuman().get(i));
                                            }
                                        }

                                        // variabel yang digunakan untuk menghitung total biaya dan juga ongkir pesanan
                                        float totalbayar;
                                        float ongkir;
                                        ongkir = pesancust.getJarak()*5000;
                                        totalbayar = ongkir + pesancust.getBayar();
                                        System.out.println("Biaya Ongkir : " + ongkir);
                                        System.out.println("Total Biaya : " + totalbayar);
                                    }
                                }

                                // else : jika tida ada pesanan yang dibuat sebelumnya
                                else{
                                    System.out.println("Tidak Ada Data Pesanan yang Terdata. Lakukan Pemesanan Terlebih Dahulu");
                                }
                                break;

                            // case 4 : jika menginputkan angka 4
                            case 4:

                                // kembali ke menu login
                                System.out.println("Kembali ke Menu Login");
                                break;
                        }
                    }

                    // perulangan selama angka yang diinputkan tidak sama dengan 4 (kembali ke menu login)
                    while(pilih != 4);
            }
        }

        // program berhenti ketika input (pilih) yang dimasukkan adalah angka 3 saat menu login
        while(pilih != 3);
    }
}
