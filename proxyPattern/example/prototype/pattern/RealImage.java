package example.prototype.pattern;

public class RealImage implements Image {
    
    private String fileName;
    
    public RealImage() {
    }

    @Override
    public void draw() {
        System.out.println("Drawing image");
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * @param fileName
     */
    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Image : " + fileName + " is loaded from disk");
        
    }

}
