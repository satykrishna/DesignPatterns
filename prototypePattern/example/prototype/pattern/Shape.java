package example.prototype.pattern;

public abstract class Shape implements Cloneable {

    protected String type;
    private String   id;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getId() {
        return id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public abstract void draw();

}
