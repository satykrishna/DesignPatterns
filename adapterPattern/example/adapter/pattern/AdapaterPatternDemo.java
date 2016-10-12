package example.adapter.pattern;

public class AdapaterPatternDemo {
    
    
    public static void main(String[] args) {
        
        
        AudioPlayer player = new AudioPlayer();
        
        player.play("mp3", "ABC.mp3");
        player.play("mp4", "def.mp4");
        player.play("mp5", "efgh.mp5");
        player.play("vlc", "def.vlc");
        
        
    }

}
