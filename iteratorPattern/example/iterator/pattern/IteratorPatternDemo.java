package example.iterator.pattern;

public class IteratorPatternDemo {

    public static void main(String[] args) {

        String[] names = new String[] { "Satya", "krishna", "Kondapalli" };

        NameRepository repository = new NameRepository(names);

        Iterator iterator = repository.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        System.out.println();

        String[] familyNames = new String[] { "Satyakrishna", "Annaluru" };
        
        NameRepository otherRepo = new NameRepository(familyNames);
        
        iterator = otherRepo.getIterator();
        
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
