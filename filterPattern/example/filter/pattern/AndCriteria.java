package example.filter.pattern;

import java.util.List;

public class AndCriteria implements Criteria {

    private Criteria first;
    private Criteria second;
    
    @Override
    public List<Person> filter(List<Person> persons) {
        return second.filter(first.filter(persons));
    }

    public AndCriteria(Criteria first, Criteria second) {
        this.first = first;
        this.second = second;
    }

}
