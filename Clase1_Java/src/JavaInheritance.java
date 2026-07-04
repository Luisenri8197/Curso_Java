import java.util.ArrayList;
import java.util.Arrays;

public class JavaInheritance {
    static void main(String[] args) {

//        Respuesta a ejercicios

        var fisrtCar = new Car("Mustang");
        fisrtCar.move();
        fisrtCar.honk();

        var firstStudent = new Student("Luis", 34, 7);
        firstStudent.study();

        var firstDog = new Dog();
        var firstCat = new Cat();
        var firstCow = new Cow();
        firstDog.makeSound();
        firstCat.makeSound();

        var firstEmployee = new Manager("gustavo", 1500, "contable");
        firstEmployee.showInfo();

        var firstRectangle = new Rectangle(15, 20);
        var firstCircle = new Circle(5);
        firstRectangle.calculateArea();
        firstCircle.calculateArea();

        var firstEagle = new Eagle();
        firstEagle.fly();

        var firstPhone = new Phone();

        var animals = new ArrayList<Animal>(Arrays.asList(firstDog, firstCat, firstCow));
        for (Animal item  : animals){
            item.makeSound();
        }

    }

    public static class Vehicle{
        String brand;

        public Vehicle(String brand){
            this.brand = brand;
        }

        public void move(){
            System.out.printf("El vehiculo %s se mueve%n",brand);
        }

    }

    public static class Car extends Vehicle{

        public Car(String brand) {
            super(brand);
        }

        public void honk(){
            System.out.printf("El carro %s está pitando%n", brand);
        }

    }

    public static class Person{
        private String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName(){
            return this.name;
        }
    }

    public static class Student extends Person{
        int grade;
        public Student(String name, int age, int grade) {
            super(name, age);
            this.grade = grade;
        }
        public void study(){
            System.out.printf("El estudiante %s del grado %d tiene %d años%n", getName(), grade, age);
        }
    }

    public static class Animal{
        public void makeSound(){
            System.out.println("El Anime gime que gime");
        }
    }

    public static class Dog extends Animal{
        @Override
        public void makeSound(){
            System.out.println("El perro gime");
        }
    }

    public static class Cat extends Animal{
        @Override
        public void makeSound(){
            System.out.println("El gato gime");
        }
    }

    public static class Cow extends Animal{
        @Override
        public void makeSound(){
            System.out.println("La vaca muuu La vaca, la misma vaca, tengo una vaca lechera que le gusta...");
        }
    }

    public static class Employee{
        String name;
        double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }
    }

    public static class Manager extends Employee{
        String department;
        public Manager(String name, double salary, String department) {
            super(name, salary);
            this.department = department;
        }
        public void showInfo(){
            System.out.printf("El empleado %s es un perro desgraciado que cobra %.2f y trabaja en el departamento %s%n", name, salary, department);
        }
    }

    public static abstract class Shape{
        public abstract void calculateArea();
    }

    public static class Rectangle extends Shape{
        double base;
        double height;

        public Rectangle(double base, double height) {
            this.base = base;
            this.height = height;
        }
        @Override
        public void calculateArea(){
            System.out.printf("El área del rectángulo es: %.2f%n",base * height);
        }
    }

    public static class Circle extends Shape{
        double radius;

        public Circle(double radius) {
            this.radius = radius;
        }
        @Override
        public void calculateArea(){
            System.out.printf("El área del circulo es: %.2f%n", Math.PI * (Math.pow(radius,2)));
        }
    }

    public static class Bird{
        public void fly(){
            System.out.println("Estoy volando con el padre jesucristo");
        }
    }

    public static class Eagle extends Bird{
        @Override
        public void fly(){
            System.out.println("Volando con el Eagle perro alv seguido de volar con");
            super.fly();
        }
    }

    public static class Device{
        public Device(){
            System.out.println("Device Created");
        }
    }

    public static class Phone extends Device{
        public Phone(){
            System.out.println("Phone Created mai perrusky");
        }
    }
}
