package OOP;

public class Worker {
    String name;
    double salary;

    public Worker(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void showSalary(){
        System.out.printf("El salario de %s es de %.2f%n", name, salary);
    }
}
