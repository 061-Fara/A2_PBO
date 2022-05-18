package posttest6;

import static posttest6.PlayVideo.maxVideo;
import static posttest6.PlayVideo.minVideo;

public class Video implements PlayVideo{
    private static int vid;
    private static boolean diPlay;

    public Video(){
        this.vid = 1;
    }

    @Override
    public void play() {
        diPlay = true;
        System.out.println("Sedang Menjalankan Video...");
        System.out.println("Video Diputar");
        history();
        System.out.println("Selamat menonton video pelatihan " + this.getVid());
    }
    
    @Override
    public void stop() {
        diPlay = false;
        System.out.println("Video tertutup");
    }

    @Override
    public void next() {
        if (diPlay = true){
            if (this.vid == maxVideo) {
                System.out.println("Video berakhir");
                System.out.println("Kamu sudah menonton sebanyak" + this.getVid() + " video");
            } 
            else {
                this.vid += 1;
                System.out.println("Selamat menonton video pelatihan " + this.getVid());
            }
        }
        else{
            System.out.println("NYALAKAN DULU BOS");
        }
    }

    @Override
    public void prev() {
        if (diPlay = true){
            if (this.vid == minVideo) {
                System.out.println("Kamu berada di video awal");
                System.out.println("Selamat menonton video pelatihan " + this.getVid());
            } 
            else {
                this.vid -= 1;
                System.out.println("Selamat menonton video pelatihan " + this.getVid());
            }
        }
        else{
            System.out.println("NYALAKAN DULU BOS");
        }
    }
    
    public static void history(){
        System.out.println("Histori tonton video yang lalu yaitu video ke-"+vid);
    }

    public int getVid(){
        return this.vid;
    }


}
