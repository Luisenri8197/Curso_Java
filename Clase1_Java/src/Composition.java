public class Composition {

    static void main(String[] args) {

//        Composición

        var firstCar = new Car();
        firstCar.engine.turnOn();
    }

    private static class Engine{
        public void turnOn(){
            System.out.println("El motor se enciende");
        }
    }

    public static class Car{

       private final Engine engine = new Engine();

       public void turnOn(){
           engine.turnOn();
       }
    }

}
