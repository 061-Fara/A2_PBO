package posttest6;

import java.util.ArrayList;
import java.io.*;

public final class Main {//final class
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(in);
        
        final ArrayList<Dapes> dataPeserta = new ArrayList<>();//final method
        final ArrayList<Dapel> dataPelatih = new ArrayList<>();//final method
        
        int menu, pencet;
        Dapes dapes1 = new Dapes(1,1,1,"1","1","1");
        Dapes dapes2 = new Dapes(1,1,1,"1","1","1");

        Dapel dapel1 = new Dapel(1,1,1,1,"1","1","1");
        Dapel dapel2 = new Dapel(1,1,1,1,"1","1","1");
        
        Video pelatihanvid = new Video();

        Peserta fara = new Peserta(pelatihanvid);
        
//        Database Database1 = new Database(11,"11", 11, "11","11");
//        Database Database2 = new Database(11,"11", 11, "11","11");
        
        while (true){
            System.out.println("+----------------------------+");
            System.out.println("|           M E N U          |");
            System.out.println("+----------------------------+");
            System.out.println("|   1. Memasukkan Data       |"); //create
            System.out.println("|   2. Menampilkan Data      |"); //read
            System.out.println("|   3. Mengubah Data         |"); //update
            System.out.println("|   4. Menghapus Data        |"); //delete
            System.out.println("|   5. Tonton Video Pelatihan|"); //interface
            System.out.println("|   6. Keluar                |");
            System.out.println("+----------------------------+");

            System.out.print  ("Masukkan pilihan : ");
            int pilih = Integer.parseInt(input.readLine());

            switch(pilih){
                case 1:   
//                    Database1.mendaftar();
                    System.out.println("+-----------------------+");
                    System.out.println("|    T A M P I L A N    |");
                    System.out.println("+-----------------------+");
                    System.out.println("|   1. Data Pelatih     |");
                    System.out.println("|   2. Data Peserta     |");
                    System.out.println("+-----------------------+");
                    
                    System.out.print("==> Pilihan : ");
                    menu = Integer.parseInt(input.readLine());
                    
                    if (menu == 1){
                        dapel1.mendaftar();
                        System.out.println("\n****** Menu Menambahkan Data Pelatih ******");
                        System.out.println("Masukkan data diri ");
                        System.out.print("NIK         : ");int nik            = Integer.parseInt(input.readLine());
                        System.out.print("ID Pelatih  : ");int id_pelatih     = Integer.parseInt(input.readLine());
                        System.out.print("Nama        : ");String nama        = input.readLine();
                        System.out.print("Tahun Lahir : ");int umur           = Integer.parseInt(input.readLine());
                        System.out.print("Gender      : ");String gender      = input.readLine();
                        System.out.print("Bidang UMKM : ");String bidang_umkm = input.readLine();
                        System.out.print("Bulan Mulai : ");int bulan          = Integer.parseInt(input.readLine());
                        System.out.print("Tahun Mulai : ");int mulai          = Integer.parseInt(input.readLine());    
                        System.out.println("******************************\n");
                        Dapel newData = new Dapel(id_pelatih, mulai, nik, umur, nama, gender, bidang_umkm);
                        dataPelatih.add(newData);
                    }
                    
                    else if(menu == 2){
                        dapes1.mendaftar();//overload
                        System.out.println("\n****** Menu Menambahkan Peserta ******");
                        System.out.println("Masukkan data diri ");
                        System.out.print("NIK         : ");int nik            = Integer.parseInt(input.readLine());
                        System.out.print("No Peserta  : ");int no_peserta     = Integer.parseInt(input.readLine());
                        System.out.print("Nama        : ");String nama        = input.readLine();
                        System.out.print("Tahun Lahir : ");int umur           = Integer.parseInt(input.readLine());
                        System.out.print("Gender      : ");String gender      = input.readLine();
                        System.out.print("Bidang UMKM : ");String bidang_umkm = input.readLine();
                        System.out.print("Bulan Mulai : ");int bulan          = Integer.parseInt(input.readLine());
                        System.out.println("******************************\n");
                        Dapes dataBaru = new Dapes(no_peserta, nik, umur, nama, gender, bidang_umkm);
                        dataPeserta.add(dataBaru);
                    }
                    
                    else{
                        System.out.println("!! Tidak ada pilihan !!");
                    }
                    break;

                case 2:
//                    Database2.pelatihan();
                    System.out.println("\n****** Menu Pelatihan ******\n");
                    
                    System.out.println("+-----------------------+");
                    System.out.println("|    T A M P I L A N    |");
                    System.out.println("+-----------------------+");
                    System.out.println("|   1. Data Pelatih     |");
                    System.out.println("|   2. Data Peserta     |");
                    System.out.println("+-----------------------+");
                    
                    System.out.print("==> Pilihan : ");
                    menu = Integer.parseInt(input.readLine());
                    
                    if (menu == 1){
                        dapel2.pelatihan();
                        System.out.println("+------------------------------+");
                        System.out.println("+       DATA PELATIH UMKM       ");
                        System.out.println("+------------------------------+");

                        if(dataPelatih.size() < 1){
                            System.out.println("- Data belum diisi, isi dulu ya -");
                        }
                        else{
                            for (int i = 0; i < dataPelatih.size(); i++) {
                                System.out.println("Data Pelatih --> " + (i + 1));
                                System.out.println("--------------------------------");
                                dataPelatih.get(i).display();
                                System.out.println("--------------------------------");
                            }
                        }
                    }
                    else if (menu == 2){
                        dapes2.pelatihan();
                        System.out.println("+------------------------------+");
                        System.out.println("+       DATA PESERTA UMKM       ");
                        System.out.println("+------------------------------+");

                        if(dataPeserta.size() < 1){
                            System.out.println("- Data belum diisi, isi dulu ya -");
                        }
                        else{
                            for (int i = 0; i < dataPeserta.size(); i++) {
                                System.out.println("Data Peserta --> " + (i + 1));
                                System.out.println("--------------------------------");
                                dataPeserta.get(i).display();
                                System.out.println("--------------------------------");
                            }  
                        }
                    }
                    
                    else{
                        System.out.println("!! Tidak ada pilihan !!");
                    }
                    break;

                case 3:
                    System.out.println("\n****** Menu Mengupdate ******\n");
                    
                    System.out.println("+-----------------------+");
                    System.out.println("|    T A M P I L A N    |");
                    System.out.println("+-----------------------+");
                    System.out.println("|   1. Data Pelatih     |");
                    System.out.println("|   2. Data Peserta     |");
                    System.out.println("+-----------------------+");
                    
                    System.out.print("==> Pilihan : ");
                    menu = Integer.parseInt(input.readLine());
                    
                    if (menu == 1){
                        for (int i = 0; i < dataPelatih.size(); i++) {
                                System.out.println("Data Pelatih --> " + (i + 1));
                                System.out.println("--------------------------------");
                                dataPelatih.get(i).data();
                                System.out.println("--------------------------------");
                        }
                        System.out.print("Masukkan Nama Pelatih : ");
                        String name = input.readLine();
                        for (Dapel pelatih : dataPelatih) {
                            if (pelatih.getnama().equals(name)) {
                                System.out.print("NIK         : ");pelatih.setnik(Integer.parseInt(input.readLine()));
                                System.out.print("ID Pelatih  : ");pelatih.setId_pelatih(Integer.parseInt(input.readLine()));
                                System.out.print("Nama        : ");pelatih.setnama(input.readLine());
                                System.out.print("Tahun Lahir : ");pelatih.setUmur(Integer.parseInt(input.readLine()));
                                System.out.print("Gender      : ");pelatih.setgender(input.readLine());
                                System.out.print("Bidang UMKM : ");pelatih.setbidang_umkm(input.readLine());
                                System.out.print("Tahun Mulai     : ");pelatih.setnik(Integer.parseInt(input.readLine()));
                                break;
                            }
                        }
                    }
                    
                    else if (menu == 2){
                        for (int i = 0; i < dataPeserta.size(); i++) {
                                System.out.println("Data Peserta --> " + (i + 1));
                                System.out.println("--------------------------------");
                                dataPeserta.get(i).data();
                                System.out.println("--------------------------------");
                        }                        
                        System.out.print("Masukkan Nama Peserta : ");
                        String name = input.readLine();
                        for (Dapes peserta : dataPeserta) {
                            if (peserta.getnama().equals(name)) {
                                System.out.print("NIK         : ");peserta.setnik(Integer.parseInt(input.readLine()));
                                System.out.print("No Peserta  : ");peserta.setNo_peserta(Integer.parseInt(input.readLine()));
                                System.out.print("Nama        : ");peserta.setnama(input.readLine());
                                System.out.print("Tahun Lahir : ");peserta.setUmur(Integer.parseInt(input.readLine()));
                                System.out.print("Gender      : ");peserta.setgender(input.readLine());
                                System.out.print("Bidang UMKM : ");peserta.setbidang_umkm(input.readLine());
                                break;
                            }
                        }
                    }
                    
                    else{
                        System.out.println("!! Tidak ada pilihan !!");
                    }
                    break;

                case 4:
                    System.out.println("\n****** Menu Menghapus ******\n");
                    
                    System.out.println("+-----------------------+");
                    System.out.println("|    T A M P I L A N    |");
                    System.out.println("+-----------------------+");
                    System.out.println("|   1. Data Pelatih     |");
                    System.out.println("|   2. Data Peserta     |");
                    System.out.println("+-----------------------+");
                    
                    System.out.print("==> Pilihan : ");
                    menu = Integer.parseInt(input.readLine());
                    if (menu == 1){
                        for (int i = 0; i < dataPelatih.size(); i++) {
                                System.out.println("Data Pelatih --> " + (i + 1));
                                System.out.println("--------------------------------");
                                dataPelatih.get(i).data();
                                System.out.println("--------------------------------");
                        }
                        System.out.print("Masukkan Nama Pelatih : ");
                        String nam = input.readLine();
                        for (int i = 0; i < dataPelatih.size(); i++) {
                            if (dataPelatih.get(i).getnama().equals(nam)) {
                                dataPelatih.remove(i);
                                break;
                            }
                        }
                    }
                    else if(menu == 2){
                        for (int i = 0; i < dataPeserta.size(); i++) {
                                System.out.println("Data Peserta --> " + (i + 1));
                                System.out.println("--------------------------------");
                                dataPeserta.get(i).data();
                                System.out.println("--------------------------------");
                        }   
                        System.out.print("Masukkan Nama peserta : ");
                        String nam = input.readLine();
                        for (int i = 0; i < dataPeserta.size(); i++) {
                            if (dataPeserta.get(i).getnama().equals(nam)) {
                                dataPeserta.remove(i);
                                break;
                            }
                        }
                    }
                    
                    else{
                        System.out.println("!! Tidak ada pilihan !!");
                    }
                    break;
                      
                case 5:
                    while(true){
                        System.out.println("== Ini interface nonton video buat si peserta pelatihan ==\n");
                        
                        System.out.println("--- I N T E R F C E ---");
                        System.out.println("[1] Nyala");
                        System.out.println("[2] Maju");
                        System.out.println("[3] Mundur");
                        System.out.println("[4] Mati");
                        System.out.println("[0] Kembali");
                        System.out.println("--------------------------");
                        System.out.print("Pilih : ");
                        
                        pencet = Integer.parseInt(input.readLine());

                        if (pencet == 1){
                            fara.nyala();
                        }
                        
                        else if (pencet == 2){
                            fara.maju();
                        }

                        else if (pencet == 3){
                            fara.mundur();
                        }
                        
                        else if (pencet == 4){
                            fara.mati();
                        }
                        
                        else if (pencet == 0){
                            break;
                        }
                        else{
                            System.out.println("yang bener oy");
                        }
                    }
                        break;
                    
                    
                case 6:
                    System.out.println("== SEMOGA BERMANFAAT ==");
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Menu tidak tersedia");
                    break;
            }
        }
    }
}
