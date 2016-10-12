package example.filter.pattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale  implements Criteria{

    @Override
    public List<Person> filter(List<Person> persons) {
        
        List<Person> filtered = new ArrayList<Person>();
        
        for(Person person: persons ) {
            
            if(person.getGender().equalsIgnoreCase("MALE")) {
               filtered.add(person);
            }
        }
        
        return filtered;
    }

}
