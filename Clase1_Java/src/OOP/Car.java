package OOP;

public class Car {
    String brand;
    int model;

    public Car(String brand, int model) {
        this.brand = brand;
        this.model = model;
    }

    public void showData(){
        System.out.printf("El carro carechimba es de la marca %s y modelo %s%n", brand, model);
    }
}
