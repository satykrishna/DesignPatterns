package example.filter.pattern;

public class Person {

    private String name;
    private String gender;
    private String martialStatus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMartialStatus() {
        return martialStatus;
    }

    public void setMartialStatus(String martialStatus) {
        this.martialStatus = martialStatus;
    }

    public Person(String name, String gender, String martialStatus) {
        this.name = name;
        this.gender = gender;
        this.martialStatus = martialStatus;
    }
    
    
    @Override
    public boolean equals(Object obj) {
        if(obj == null ) {
            return false;
        }
        
        if(!(obj instanceof Person) ) {
            return false;
        }
        
        Person other = (Person)obj;
        
        if(name == other.name && gender == other.gender && martialStatus == other.martialStatus ) {
            return true;
        }
        
        return false;
    }
    
    @Override
    public String toString() {
        return "Person : [ Name : " + name + " gender : " + gender + " martialStatus : " + martialStatus +"]";
    }

}
