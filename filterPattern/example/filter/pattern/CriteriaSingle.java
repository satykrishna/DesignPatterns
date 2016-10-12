package example.filter.pattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> filter(List<Person> persons) {
         List<Person> filter = new ArrayList<Person>();
         for(Person person : persons ) {
             if(person.getMartialStatus().equalsIgnoreCase("single" )) {
                 filter.add(person);
             }
         }

         return filter;
    }

}
