public class Abstaction {
    static void main(String[] args) {

//        Abstraccion

//        - Clase Abstracta

        Cocodrile firstCocodrile = new Cocodrile();
        var firstLizard = new Lizard();
        var firstFrog = new Frog();
        var firstIguana = new Iguana();
        firstCocodrile.sleep();
        firstCocodrile.makeSound();
        firstLizard.sleep();
        firstLizard.makeSound();

//        Interface
        firstFrog.walk();
        firstFrog.makeSound();
        firstFrog.sleep();

        firstIguana.walk();
        firstIguana.makeSound();
        firstIguana.sleep();
    }

    public static abstract class Reptil{
        public void sleep(){
            System.out.println("El animal duerme");
        }
        public abstract void makeSound();
    }

    public static class Cocodrile extends Reptil{
        @Override
        public void makeSound(){
            System.out.println("El cocodrilistico ladra");
        }
    }

    public static class Lizard extends Reptil {
        @Override
        public void makeSound() {
            System.out.println("El lagarto maulla");
        }
    }

    public static class Iguana extends Reptil implements Walking{
        @Override
        public void makeSound() {
            System.out.println("La iguana gime feo");
        }

        @Override
        public void walk(){
            System.out.println("Ahora la Iguana camina como perra");
        }
    }

    public static class Frog extends Reptil implements Walking{
        @Override
        public void makeSound() {
            System.out.println("Sapo jpta feo");
        }
        @Override
        public void walk(){
            System.out.println("Ahora el sapo perro camina como gata");
        }
    }

    public interface Walking{
        void walk();
    }
}
