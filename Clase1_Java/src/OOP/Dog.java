package OOP;

public class Dog {
    String nombre;

    public Dog(String nombre) {
        this.nombre = nombre;
    }
    public void bark(){
        System.out.printf("El perro %s está ladre y ladre que fastidio%n", nombre);
    }
}
