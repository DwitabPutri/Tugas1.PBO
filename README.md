Nama		: Ni Kadek Dwita Putri Suastini
NIM		: 2205551074
Mata Kuliah	: Pemrograman Berorientasi Objek (E)
Judul Tugas	: Tugas 1

Penjelasan Kode Program :
Program dibagi menjadi 4 kelas yaitu class main, class utama, class pesanan, dan class restoran. Fungsi atau tujuan pembuatan tiap class dijelaskan pada bagian berikut.
1.	Class Main
Pada class ini, semua yang akan ditampilkan baik itu menu, hasil dari eksekusi menu, serta bagian yang perlu diinputkan akan ada pada class main. Class ini memiliki 4 method, yaitu method Login, method Admin, method Customer, dan method Main.
  A.	Method Login
      Method login digunakan atau dipanggil ketika program pertama kali dieksekusi. Dengan memanggil method login, maka akan ada informasi kategori pengguna yang dapat diakses yaitu Admin dan Customer. Apabila pengguna tidak ingin mengakses salah satu dari kategori tersebut, maka pengguna bisa memilih untuk keluar dan mengakhiri program.
  B.	Method Admin
      Method admin akan dipanggil atau digunakan ketika pengguna memilih untuk mengakses menu admin yang terdapat pada bagian sebelumnya yaitu ketika method login dipanggil. Saat method login dijalankan, pengguna akan diminta untuk menginputkan angka yang merujuk pada kategori pengguna. Angka 1 untuk admin, angka 2 untuk customer, dan angka 3 untuk keluar program. Ketika angka yang diinputkan adalah 1, maka akan disimpan pada variabel bernama pilih yang selanjutnya mengarahkan program untuk menjalankan method admin. Selanjutnya, admin dapat mengakses 4 menu yang ada, yaitu menu untuk melihat restoran, menu untuk menambahkan restoran, menu untuk menghapus restoran, dan menu untuk kembali ke menu login.
  C.	Method Customer
      Apabila pengguna ternyata menginputkan angka 2, maka yang akan dijalankan atau dipanggil adalah method customer. Pada method ini, pengguna (customer) memiliki 4 menu yang dapat diakses, yaitu menu untuk melihat restoran, menu untuk membuat pesanan, menu untuk melihat pesanan, dan menu untuk kembali ke menu login.
2.	Class Utama
Class utama berisi pendeklarasian variabel yang akan digunakan untuk mencatat nama makanan serta minuman (variabel nama) dan juga mencatat harganya (variabel harga). Pada class ini juga terdapat method getter dan setter untuk mengambil dan mengisi nilai. Method setter tidak memiliki nilai kembalian karena hanya berperan untuk mengisi nilai atau data. Sedangkan method getter memiliki nilai kembalian. Method getNama dan getHarga digunakan pada class main untuk menampilkan nama makanan dan minuman beserta harganya, sedangkan method setNama dan setHarga digunakan pada class main untuk mengisi nilai atau data nama makanan dan minuman beserta harganya.
3.	Class Pesanan
Class pesanan berisi beberapa variabel termasuk dengan arraylist yang digunakan.
4.	Class Restoran
Class restoran berisi beberapa variabel termasuk dengan arraylist yang digunakan.

Cara Kerja Program :
1.	Akan ditampilkan 2 kategori yang dapat diakses (Admin dan Customer) dan juga menu bernomor 3 yang akan mengakhiri program.
<img width="715" alt="image" src="https://user-images.githubusercontent.com/114004174/232756728-92f97070-fe1a-4836-9365-9d1428275ab1.png">

2.	(Akan digunakan switch case dan if else) Apabila pengguna menginputkan angka 1 akan mengakses menu admin.
<img width="729" alt="image" src="https://user-images.githubusercontent.com/114004174/232757269-6df72e9a-3015-4fb4-b175-c9331a3cd5bc.png">

    2.1	Menu yang dapat diakses dalam kategori admin akan ditampilkan
    2.2	Pengguna memilih angka yang sesuai dengan menu yang ingin diakses (akan digunakan switch case dan if else)
    2.3	Apabila menginput angka 1, admin akan melihat list restoran --- akan ditampilkan kembali keempat menu yang dapat diakses oleh admin
    <img width="709" alt="image" src="https://user-images.githubusercontent.com/114004174/232758542-392d2fa8-c81a-4cc2-81fe-961940d07020.png">
    2.4	Pengguna memilih angka yang sesuai dengan menu yang ingin diakses (akan digunakan switch case dan if else)
    2.5	Apabila menginput angka 2, admin akan dapat menambahkan restoran
    <img width="709" alt="image" src="https://user-images.githubusercontent.com/114004174/232757785-19fe6a27-5d77-4db5-9f0d-ad661bd28281.png">
    
    2.6	Admin menambahkan informasi restoran termasuk dengan makanan dan minuman. Admin akan diberikan pertanyaan apakah ingin menambahkan makanan atau tidak (y untuk iya dan n untuk tidak). Jika memilih y, maka admin akan dapat menambahkan makanan dengan harganya. Akan ditanya kembali apakah ingin menambahkan makanan atau tidak (looping), looping berhenti ketika admin menginput n. Serupa dengan makanan, apabila admin ingin menginput minuman, akan ada pertanyaan yang muncul (ingin menambah minuman atau tidak). Jika admin menginput y, maka admin dapat menambahkan minuman beserta harganya. Looping untuk menambahkan minuman akan berhenti ketika admin menginputkan huruf n. 
    <img width="350" alt="image" src="https://user-images.githubusercontent.com/114004174/232757841-7ad6afcc-ad9c-4fbf-9cca-9aced5bb00ef.png">
    
    Apabila huruf n terakhir (mengakhiri looping menambah minuman) diinput, maka proses untuk menambah restoran juga akan berakhir dan akan ditampilkan kembali keempat menu yang dapat diakses oleh admin.
    2.7	Pengguna memilih angka yang sesuai dengan menu yang ingin diakses (akan digunakan switch case dan if else)
    2.8	Apabila menginput angka 3, admin dapat menghapus restoran
    <img width="716" alt="image" src="https://user-images.githubusercontent.com/114004174/232758066-549d73dc-cc1d-4fc3-ad00-a9835c7c0d48.png">
    
    2.9	Proses menghapus restoran menggunakan id restoran yang didapat dengan menggunakan method getIdRestoran();. Id restoran diberikan (bukan diinput pengguna) secara berurutan dimulai dari angka 1. Apabila restoran dengan ID 1 telah dihapus, maka restoran selanjutnya yang ditambahkan akan memiliki ID 2.
    Untuk menghapus restoran, inputkan ID restorannya (misal 1). Apabila tidak ada restoran dengan ID yang diinputkan, maka akan ada kalimat peringatan yang muncul untuk mengingatkan admin agar menginputkan ID restoran yang benar.
    Proses menghapus restoran selesai, akan ditampilkan kembali keempat menu yang dapat diakses oleh admin.
    2.10	Pengguna memilih angka yang sesuai dengan menu yang ingin diakses (akan digunakan switch case dan if else)
    <img width="714" alt="image" src="https://user-images.githubusercontent.com/114004174/232758123-7d058060-0d4a-482a-afc5-e44786368038.png">
    
    2.11	Apabila menginput angka 4, maka akan ditampilkan kembali menu login yang ditunjukkan oleh kalimat atau pernyataan nomor 1.
    <img width="709" alt="image" src="https://user-images.githubusercontent.com/114004174/232758211-a606eccd-e75c-4b45-bce4-c0720e34118a.png">
    
 
3.	(Akan digunakan switch case dan if else) Apabila pengguna menginputkan angka 2 akan mengakses menu customer.
    3.1	Menu yang dapat diakses dalam kategori customer akan ditampilkan
    <img width="712" alt="image" src="https://user-images.githubusercontent.com/114004174/232758630-27aa3473-e4a0-47a8-be64-7bd502c68b7f.png">
    
    3.2	Pengguna memilih angka yang sesuai dengan menu yang ingin diakses (akan digunakan switch case dan if else)
    3.3	Apabila menginput angka 1, customer dapat melihat list restoran yang sebelumnya telah ditambahkan oleh admin ----- selanjutnya akan ditampilkan kembali keempat menu yang dapat diakses oleh customer
    <img width="706" alt="image" src="https://user-images.githubusercontent.com/114004174/232758733-0a2da0d4-9ab5-4fd0-8cdc-dad911846b11.png">
    
    3.4	Pengguna memilih angka yang sesuai dengan menu yang ingin diakses (akan digunakan switch case dan if else)
    3.5	Apabila menginput angka 2, customer dapat membuat pesanan baru.
    3.6	Customer akan diminta untuk memilih restoran terlebih dahulu dengan cara menginputkan ID Restoran terkait.
    <img width="708" alt="image" src="https://user-images.githubusercontent.com/114004174/232758856-b5bd5d98-d3ec-4ef1-8e9a-b27a42c0bf21.png">
    
    3.7	Selanjutnya akan ditampilkan daftar makanan yang terdapat pada menu restoran. Customer akan diminta untuk menginputkan id makanan yang terdaftar (misalnya dengan menginputkan id 1 untuk makanan nasi goreng)
    <img width="717" alt="image" src="https://user-images.githubusercontent.com/114004174/232758935-ca30c53e-62e1-4fa9-8dbc-4d7b97971d9c.png">
    
    3.8	Setelah menginputkan id, customer akan diminta untuk menginputkan jumlah atau banyaknya makanan terkait (misalnya nasi goreng) yang ingin dipesan (misalnya sebanyak 2)
    <img width="707" alt="image" src="https://user-images.githubusercontent.com/114004174/232759037-4b197b47-e44c-40a2-a148-ffa4d37d12bd.png">
    
    3.9	Akan ada pertanyaan yang akan ditampilkan untuk mendapatkan jawaban apakah customer ingin memesan makanan kembali atau tidak. Apabila customer ingin memesan makanan kembali (dengan menginputkan y) maka proses pada nomor 3.7 dan 3.8 akan diulangi (looping).
    3.10	Proses looping akan berakhir ketika pengguna menginputkan huruf n yang menandakan bahwa customer tidak ingin memesan makanan lagi.
    3.11	Customer juga dapat melakukan pesanan untuk memesan minuman. Setelah melakukan proses pemesanan makanan selesai, selanjutnya customer dapat melakukan pemesanan yang prosesnya serupa seperti yang ditunjukkan oleh nomor 3.7, 3.8, dan 3.9. Hanya saja pada proses ini, jenis menu yang dipesan adalah minuman.
    3.12	Proses looping untuk memesan minuman akan berhenti ketika customer tidak ingin memesan minuman kembali (dengan menginputkan huruf n).
    <img width="700" alt="image" src="https://user-images.githubusercontent.com/114004174/232759195-d8d23b44-83be-44ef-9b92-725e24d689bb.png">
    
    3.13	Ketika looping berhenti, akan ada inputan jarak yang diharapkan untuk menentukan seberapa jauh jarak restoran dengan lokasi customer. Juga ditampilkan informasi bahwa setiap 1 km akan dikenakan biaya sebesar 5000 untuk ongkirnya.
    3.14	Setelah menginputkan jarak, pesanan akan berhasil ditambahkan. Keempat menu yang dapat diakses oleh customer akan ditampilkan kembali.
    <img width="739" alt="image" src="https://user-images.githubusercontent.com/114004174/232759264-6aa51766-f52b-447b-8cea-a0dd1a2e73db.png">
    
    3.15	Pengguna memilih angka yang sesuai dengan menu yang ingin diakses (akan digunakan switch case dan if else)
    3.16	Apabila menginput angka 3, customer dapat melihat pesanan yang telah dilakukan sebelumnya.
    <img width="706" alt="image" src="https://user-images.githubusercontent.com/114004174/232759330-84feb37e-bbc7-407d-8b08-c3c8ffc20fd7.png">
    
    3.17	Detail pesanan akan ditampilkan. Keempat menu yang dapat diakses customer akan ditampilkan kembali.
    3.18	Pengguna memilih angka yang sesuai dengan menu yang ingin diakses (akan digunakan switch case dan if else)
    3.19	Apabila menginput angka 4, maka program akan kembali ke menu login.
    <img width="715" alt="image" src="https://user-images.githubusercontent.com/114004174/232759399-f8e6f6bd-b8b3-45ce-91c7-7f5ad5e03851.png">

Catatan :
Apabila restoran belum ditambahkan namun menu untuk melihat restoran telah diakses, maka tampilan yang didapat akan ditunjukkan oleh gambar berikut.
<img width="718" alt="image" src="https://user-images.githubusercontent.com/114004174/232757446-2138cebb-2ef0-48e0-976e-130ff6cbc770.png">

Apabila tidak ada makanan yang ditambahkan pada restoran, maka tampilan yang didapatkan akan ditunjukkan oleh gambar berikut.
<img width="708" alt="image" src="https://user-images.githubusercontent.com/114004174/232759545-730d6b07-a301-4bc4-a2e5-b138c988956f.png">

Apabila tidak ada minuman yang ditambahkan pada restoran, maka tampilan yang didapatkan akan ditunjukkan oleh gambar berikut.
<img width="709" alt="image" src="https://user-images.githubusercontent.com/114004174/232759759-f09890ee-c250-4deb-a810-53fc212680ca.png">

Apabia tidak ada minuman atau makanan yang ditambahkan pada restoran, maka tampilan yang didapatkan akan ditunjukkan oleh gambar berikut.
<img width="706" alt="image" src="https://user-images.githubusercontent.com/114004174/232759909-8971160c-b636-4b3f-9ca2-764735ce0d96.png">

Apabila belum ada pesanan yang dibuat namun menu lihat pesanan telah diakses, maka tampilan yang didapatkan akan ditunjukkan oleh gambar berikut.
<img width="712" alt="image" src="https://user-images.githubusercontent.com/114004174/232759982-2f43bb4e-ab70-444f-be30-b90f727169e7.png">
