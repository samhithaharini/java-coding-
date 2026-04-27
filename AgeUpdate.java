class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void displayDetails() {
        System.out.println("Person Name: " + name + ", Age: " + age);
    }
}

class PersonProcessor {
    public Person updatePerson(Person person) {
        person.setAge(person.getAge() + 1);
        person.setName(person.getName() + " Updated");
        return person; 
    }
}

public class AgeUpdate {
    public static void main(String[] args) {
        Person alice = new Person("Alice", 25);
        PersonProcessor processor = new PersonProcessor();
        Person updatedAlice = processor.updatePerson(alice);
        updatedAlice.displayDetails();

        Person bob = new Person("Bob", 30);
        Person updatedBob = processor.updatePerson(bob);
        updatedBob.displayDetails();

        Person charlie = new Person("Charlie", 40);
        Person updatedCharlie = processor.updatePerson(charlie);
        updatedCharlie.displayDetails();
    }
}
