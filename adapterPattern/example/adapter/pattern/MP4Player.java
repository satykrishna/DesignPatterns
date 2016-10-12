package example.adapter.pattern;

public class MP4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
         System.out.println("Playing Mp4 file : fileName : " + fileName);
    }

}
