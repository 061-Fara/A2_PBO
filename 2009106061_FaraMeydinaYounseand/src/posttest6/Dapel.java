package posttest6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Dapel extends Database{
    
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader input = new BufferedReader(in);
    
    private int id_pelatih;
    private int mulai;
    private final int gaji = 100000;//final atribut

    public Dapel(int id_pelatih, int mulai, int nik, int umur, String nama, String gender, String bidang_umkm) {
        super(nik, umur, nama, gender, bidang_umkm);
        this.id_pelatih = id_pelatih;
        this.mulai = mulai;
    }

    ArrayList<Dapel> dataPelatih = new ArrayList<>();
    
    @Override
    void display() {
        System.out.println("NIK         : " + this.nik);
        System.out.println("ID Pelatih  : " + this.id_pelatih);
        System.out.println("Nama        : " + this.nama);
        System.out.println("Tahun Lahir : " + this.umur);
        System.out.println("Gender      : " + this.gender);
        System.out.println("Bidang UMKM : " + this.bidang_umkm);
        System.out.println("Tahun Mulai Melatih " + this.mulai);
    }
    
    public int getId_pelatih() {
        return id_pelatih;
    }

    public void setId_pelatih(int id_pelatih) {
        this.id_pelatih = id_pelatih;
    }

    public int getMulai() {
        return mulai;
    }

    public void setMulai(int mulai) {
        this.mulai = mulai;
    }
    
       
    @Override
    void mendaftar() {
        System.out.println("Mendaftarkan diri untuk memimpin pelatihan");
    }

    @Override
    void pelatihan() {
        System.out.println("Pelatihan dimulai oleh pelatih");
    }
    
    void Umur(int selisih, int lama) throws IOException{
        System.out.print("Masukkan Nama pelatih : ");
        String nam = input.readLine();
        for (Dapel pelatih : dataPelatih) {
            if (pelatih.getnama().equals(nam)) {
                selisih = 2022 - getUmur();
                lama    = 2022 - getMulai();
                System.out.print("Umur pelatih = " + selisih);
                System.out.print("Lama Melatih = " + lama);
                break;
            }
        }             
    }        

    @Override
    public void data() {
        System.out.println("ada tambahan final");
        System.out.println("NIK         : " + this.nik);
        System.out.println("ID Pelatih  : " + this.id_pelatih);
        System.out.println("Nama        : " + this.nama);
        System.out.println("Tahun Lahir : " + this.umur);
        System.out.println("Gender      : " + this.gender);
        System.out.println("Bidang UMKM : " + this.bidang_umkm);
        System.out.println("Gaji        : " + gaji);
        System.out.println("Tahun Mulai Melatih : " + this.mulai);
    }
}

