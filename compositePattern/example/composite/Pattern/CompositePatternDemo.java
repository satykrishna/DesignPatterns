package example.composite.Pattern;

public class CompositePatternDemo {

    public static void main(String[] args) {

        Employee CEO = new Employee("John", "CEO", 30000);

        Employee headSales = new Employee("Robert", "Head Sales", 200000);

        Employee headMarketing = new Employee("Michael", "Head Marketing", 200000);

        Employee engineering = new Employee("Deb", "R & D", 10191110);

        Employee softwareEngineer = new Employee("Satya", "R&D", 85000);

        Employee seniorSoftwareEngineer = new Employee("Manjula", "R&D", 182000);

        Employee teamLead = new Employee("Oscar", "R&D", 200000);
        
        headMarketing.add(new Employee("Siva", "Sales", 10000));

        CEO.add(headMarketing);
        CEO.add(headSales);
        CEO.add(engineering);

        engineering.add(softwareEngineer);
        engineering.add(seniorSoftwareEngineer);
        engineering.add(teamLead);

        System.out.println("CEO is " + CEO);

        for (Employee unitHead : CEO.getSubordinates()) {

            System.out.println("head is " + unitHead);

            for (Employee subordinate : unitHead.getSubordinates()) {
                System.out.println("subordinate is " + subordinate);
            }
        }

    }

}
