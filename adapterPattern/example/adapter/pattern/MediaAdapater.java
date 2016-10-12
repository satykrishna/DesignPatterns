package example.adapter.pattern;

public class MediaAdapater implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapater(String type) {

        if (type.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        }
        else if (type.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new MP4Player();
        }

    }

    @Override
    public void play(String audioType, String fileName) {
        
        if(audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        }
        
        else if(audioType.equalsIgnoreCase("Mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        }
        
        else {
            System.out.println("Invalid Media Format " + audioType);
        }
 
    }

}
