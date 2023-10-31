package us.mattgreen;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalCreator {
    private ArrayList<Talkable> zoo;
    private Scanner scanner;

    public AnimalCreator(ArrayList<Talkable> zoo) {
        this.zoo = zoo;
        this.scanner = new Scanner(System.in);
    }

    public void createUserAnimal() {
        System.out.println("What type of animal would you like to create?");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Teacher");
        System.out.print("Enter the number of your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline

        try {
            switch (choice) {
                case 1:
                    createDog();
                    break;
                case 2:
                    createCat();
                    break;
                case 3:
                    createTeacher();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void createDog() {
        System.out.print("Is the dog friendly? (true/false): ");
        boolean isFriendly = scanner.nextBoolean();
        scanner.nextLine(); // Consume the leftover newline
        System.out.print("What is the dog's name?: ");
        String name = scanner.nextLine();
        Dog dog = new Dog(isFriendly, name);
        zoo.add(dog);
        System.out.println("Dog added to the zoo!");
    }

    private void createCat() {
        System.out.print("How many mice has the cat killed?: ");
        int miceKilled = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline
        System.out.print("What is the cat's name?: ");
        String name = scanner.nextLine();
        Cat cat = new Cat(miceKilled, name);
        zoo.add(cat);
        System.out.println("Cat added to the zoo!");
    }

    private void createTeacher() {
        System.out.print("What is the teacher's age?: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline
        System.out.print("What is the teacher's name?: ");
        String name = scanner.nextLine();
        Teacher teacher = new Teacher(age, name);
        zoo.add(teacher);
        System.out.println("Teacher added to the zoo!");
    }
}
