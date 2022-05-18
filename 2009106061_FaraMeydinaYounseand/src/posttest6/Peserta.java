package posttest6;

public class Peserta {
    private PlayVideo video;
    
    public Peserta(PlayVideo video) {
        this.video = video;
    }
    
    void nyala(){
        this.video.play();
    }
    
    void mati(){
        this.video.stop();
    }
    
    void maju(){
        this.video.next();
    }
    
    void mundur(){
        this.video.prev();
    }
    
}

