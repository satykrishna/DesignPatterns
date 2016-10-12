package example.singleton.pattern;

public class SingleObjectDemo {
    
    public static void main(String[] args) {
        
        SingleObject singleObject = SingleObject.getInstance();
        
        singleObject.showMessage();
        
    }

}
