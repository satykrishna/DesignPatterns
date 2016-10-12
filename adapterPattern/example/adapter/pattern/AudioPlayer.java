package example.adapter.pattern;

public class AudioPlayer implements MediaPlayer{

    
    private MediaAdapater adapater;
    
    
    @Override
    public void play(String audioType, String fileName) {
        
        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing audio : Mp3 file Name is " + fileName);
        }
        else {
            
            if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("Mp4")) {
                adapater = new MediaAdapater(audioType);
                adapater.play(audioType, fileName);
            }
            else {
                System.out.println("Invalid media format...!!!");
            }
        }
    }
}
