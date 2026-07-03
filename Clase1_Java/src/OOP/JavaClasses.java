package OOP;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaClasses {
    static void main(String[] args) {

//        Objetos
        var firstPerson = new Person("Lucas", 33);
//        firstPerson.name = "Luis";
//        firstPerson.age = 33;
        firstPerson.wellcome();

//        Resolución ejercicios de clases

        var firstBook = new Books("kikes", "gabriela");
        System.out.printf("El libro se llama %s y es del autor %s%n", firstBook.tittle, firstBook.author);

        var firstDog = new Dog("Pancho");
        firstDog.bark();

        var firstCar = new Car("mercedez", 2008);
        firstCar.showData();

        var firstStudent = new Student("Carlos", 45.8);
        firstStudent.aprove();

        var firstAccount = new BankAccount(1500000);
        firstAccount.deposit(452500);
        firstAccount.deposit(-1231455);
        firstAccount.showBalance();

        var firstRectangle = new Rectangle(42,98);
        firstRectangle.perimeter();
        firstRectangle.area();

        var firstWorker = new Worker("Cristina", 25);
        firstWorker.showSalary();

        var secondPerson = new Person("Laura", 34);
        var people = new ArrayList<Person>(Arrays.asList(firstPerson, secondPerson));
/*
        people.add(firstPerson);
        people.add(secondPerson);
*/
        for (Person person : people){
            System.out.println(person.name);
            person.wellcome();
        }

    }
}