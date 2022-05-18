package posttest6;

public abstract class Database {//abstract class 
    protected int nik, umur;
    protected String nama, gender, bidang_umkm;
    
    public Database(int nik, int umur, String nama, String gender, String bidang_umkm) {
        this.nik = nik;
        this.umur = umur;
        this.nama = nama;
        this.gender = gender;
        this.bidang_umkm = bidang_umkm;
    }


    public abstract void data();
    
    void display(){
        
    }
    
    void Umur(int a){
        a = 2022 - this.umur;
    }
      
    public int getnik() {
        return nik;
    }

    public String getnama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    public String getgender() {
        return gender;
    }

    public String getbidang_umkm() {
        return bidang_umkm;
    }
    
    public void setnik(int nik) {
        this.nik = nik;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public void setgender(String gender) {
        this.gender = gender;
    }

    public void setbidang_umkm(String bidang_umkm) {
        this.bidang_umkm = bidang_umkm;
    }

    void mendaftar() {
        System.out.println("Mendaftarkan diri untuk pelatihan");
    }

    void pelatihan() {
        System.out.println("Pelatihan dimulai");
    }
    
    
}
