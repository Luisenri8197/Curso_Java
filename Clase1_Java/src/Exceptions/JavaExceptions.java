package Exceptions;

public class JavaExceptions {

    public static void main(String[] args) {

//      Try catch simple
        try {
            var result = 10 / 0;
            System.out.println(result);
        } catch (RuntimeException e) {
//            throw new Error("Errorsisimo: " + e);
            System.out.println("Errorsisimo: " + e);
        }finally {
            System.out.println("Probador de finally alv");
        }

//        Try catch multiple
        try {
            var result = 10 / 2;
            System.out.println(result);

            var name = "Luis";
            name = null;
            System.out.println("Nombre: " + name.toUpperCase());
        } catch (ArithmeticException e) {
            System.out.println("Error en division: " + e);
        } catch (NullPointerException e){
            System.out.println("Error en el nombre: " + e);
        } catch (Exception e){
            System.out.println("Error no esperado " + e);
        } finally {
            System.out.println("Tu mamita le gusta el chorizo");
        }

//        Instanciando un checker con throws

        var firstAge = new ThrowExamples();
        try {
            firstAge.checkAge(15);
        }catch (ArithmeticException e){
            System.out.println("Error validando edad: " + e.getMessage());
        }

        try{
            firstAge.checkScore(400);
        }catch (CustomExceptions e){
            System.out.println("Error validando score: " + e.getMessage());
        }

        System.out.println("Fin");
    }
}
