package example.filter.pattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaPatternDemo {

    public static void main(String[] args) {

        List<Person> list = new ArrayList<Person>();

        list.add(new Person("satya", "male", "single"));
        list.add(new Person("sai", "male", "single"));
        list.add(new Person("satyam", "male", "married"));
        list.add(new Person("swarna", "female", "married"));
        list.add(new Person("Robert", "Male", "Single"));
        list.add(new Person("John", "Male", "Married"));
        list.add(new Person("Laura", "Female", "Married"));
        list.add(new Person("Diana", "Female", "Single"));
        list.add(new Person("Mike", "Male", "Single"));
        list.add(new Person("Bobby", "Male", "Single"));

        Criteria maleCriteria = new CriteriaMale();
        Criteria femaleCriteria = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, maleCriteria);
        Criteria singleOrFemale = new OrCriteria(femaleCriteria, single);

        System.out.println("Males : ");
        print(maleCriteria.filter(list));

        System.out.println("Females : ");
        print(femaleCriteria.filter(list));

        System.out.println("Singles : ");
        print(single.filter(list));

        System.out.println("singleMale : ");
        print(singleMale.filter(list));

        System.out.println("Females or singles : ");
        print(singleOrFemale.filter(list));

    }

    public static void print(List<Person> list) {
        System.out.println(list);
    }

}
