package example.prototype.pattern;

public class ProxyImage implements Image {

    private RealImage realImage;
    private String    fileName;

    public ProxyImage(String fileName) {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
    }

    @Override
    public void draw() {
        
        if( realImage == null ) {
            realImage = new RealImage(fileName);
        }
        
        realImage.draw();

    }

    public RealImage getRealImage() {
        return realImage;
    }

    public void setRealImage(RealImage realImage) {
        this.realImage = realImage;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

}
