package example.filter.pattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> filter(List<Person> persons) {
        
        List<Person> filters =  new ArrayList<Person>();
        
        for(Person person : persons ) {
            
            if(person.getGender().equalsIgnoreCase("female")) {
                filters.add(person);
            }
        }
        
        
        return filters;
    }

}
