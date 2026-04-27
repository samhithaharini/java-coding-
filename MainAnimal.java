import java.util.Scanner;
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
public class MainAnimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an animal: (1) Animal, (2) Dog");
        int choice = scanner.nextInt();
        Animal myAnimal;
        if (choice == 1) {
            myAnimal = new Animal();
        } else if (choice == 2) {
            myAnimal = new Dog();
        } else {
            System.out.println("Invalid choice, defaulting to Animal.");
            myAnimal = new Animal();
        }
        myAnimal.makeSound();
        scanner.close();
    }
}
