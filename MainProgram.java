import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Animal
        System.out.print("Enter the species of the animal: ");
        String animalSpecies = scanner.nextLine();
        Animal userAnimal = new Animal(animalSpecies);

        System.out.print("Enter the sound the animal makes: ");
        String animalSound = scanner.nextLine();
        userAnimal.makeSound(animalSound);

        System.out.print("Enter the food the animal is eating: ");
        String animalFood = scanner.nextLine();
        userAnimal.eat(animalFood);



        // Car
        System.out.print("Enter the make of the car: ");
        String carMake = scanner.nextLine();
        Car userCar = new Car(carMake);

        System.out.print("Enter the acceleration: ");
        double carAcceleration = scanner.nextDouble();
        userCar.accelerate(carAcceleration);

        double carCurrentSpeed = userCar.getCurrentSpeed();
        System.out.println("Current speed of the " + userCar.make + ": " + carCurrentSpeed + " km/h");

        // Person
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter your name: ");
        String personName = scanner.nextLine();

        System.out.print("Enter your age: ");
        int personAge = scanner.nextInt();
        Person userPerson = new Person(personName, personAge);

        userPerson.greet();

        // Employee
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter employee's name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter employee's salary: ");
        double employeeSalary = scanner.nextDouble();
        Employee userEmployee = new Employee(employeeName, employeeSalary);

        userEmployee.work("Engineering");
        userEmployee.receiveSalary();

        // Close the Scanner
        scanner.close();
    }
}

class Animal {
    String species;
    int energy;

    public Animal(String species) {
        this.species = species;
        this.energy = 100;
    }

    public void makeSound(String sound) {
        System.out.println("The " + species + " says " + sound + "!");
    }

    public void eat(String food) {
        System.out.println("The " + species + " is eating " + food + ". Yum!");

    }

}

class Car {
    String make;
    double speed;

    public Car(String make) {
        this.make = make;
        this.speed = 0.0;
    }

    public void accelerate(double acceleration) {
        speed += acceleration;
        System.out.println("The " + make + " is accelerating. Current speed: " + speed + " km/h");
    }

    public double getCurrentSpeed() {
        return speed;
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greet() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}

class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void work(String department) {
        System.out.println(name + " is working in the " + department + " department.");
    }

    public void receiveSalary() {
        System.out.println("Salary received for " + name + ": $" + salary);
    }
}

