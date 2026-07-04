public class Polimorphism {
    static void main(String[] args) {

//        Polimorfismo

//        Polimorfismo por herencia (Sobreescirtura - Herencia)

        var firstDog = new Dog();
        var firstCat = new Cat();
        var firstCow = new Cow();
        firstCow.makeSound();
        firstCat.makeSound();
        firstDog.makeSound();

//        Polimorfismo por sobrecarga de metodos

//        Ejercicio de notification

        var firsEmail = new EmailNotification();
        var firstSms = new SmsNotification();
        sendNotification(firstSms);
        sendNotification(firsEmail);

    }

    public static class Mammal {
        public void makeSound(){
            System.out.println("El Anime gime que gime");
        }
    }

    public static class Dog extends Mammal {
        @Override
        public void makeSound(){
            System.out.println("El perro gime");
        }
    }

    public static class Cat extends Mammal {
        @Override
        public void makeSound() {
            System.out.println("El gato gime");
        }
    }

    public static class Cow extends Mammal {
        @Override
        public void makeSound(){
            System.out.println("La vaca muuu La vaca, la misma vaca, tengo una vaca lechera que le gusta...");
        }
    }

    public static class Calculator{

        public int sum(int a, int b){
            return a + b;
        }

        public double sum(double a, double b){
            return a + b;
        }
    }

    public static class Notification{
        public void send(){}
    }

    public static class EmailNotification extends Notification{
        @Override
        public void send(){
            System.out.println("Enviando notificación por Email");
        }
    }

    public static class SmsNotification extends Notification{
        @Override
        public void send(){
            System.out.println("Enviando notificación por SMS");
        }
    }

    public static void sendNotification(Notification notification){
        notification.send();
    }
}
