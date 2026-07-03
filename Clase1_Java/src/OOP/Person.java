package OOP;

public class Person {
    // Atributos
    String name;
    int age;

//        Constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

//    funciones - métodos
    public void wellcome(){
        System.out.printf("Hola %s mi perro carechimba como que ya tenés %d años%n", name, age);
    }

}
