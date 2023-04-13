class restoran{
    String nama;
    String alamat;
    String noTelp;
    String rating;

    restoran(String nama, String alamat, String noTelp, String rating){
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.rating = rating;
    }
}




// main
class Main {
    public Main(){}
    public static void main(String[] args) {
        //ini nanti diisi dengan switch case untuk menu
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