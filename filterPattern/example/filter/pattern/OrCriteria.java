package example.filter.pattern;

import java.util.List;

public class OrCriteria implements Criteria {

    private Criteria first;
    private Criteria second;
    
    
    @Override
    public List<Person> filter(List<Person> persons) {
        
        List<Person> firstResult = first.filter(persons);
        List<Person> secondResult = second.filter(persons);
        
        for(Person person : firstResult ) {
            if(!secondResult.contains(person)) {
                secondResult.add(person);
            }
        }
        
        return secondResult;
    }





    public OrCriteria(Criteria first, Criteria second) {
        this.first = first;
        this.second = second;
    }

}
