package Exceptions;

public class ThrowExamples {
        public void checkAge (int age) throws ArithmeticException {
            if (age < 18) {
                throw new ArithmeticException("Debes ser mayor de edad mi perrita");
            } else {
                System.out.println("Tas bien mai perro");
            }
        }

            public void checkScore (int score) throws CustomExceptions{
                if (score < 0 || score > 100){
                    throw new CustomExceptions("Pendejo no puede escribir un berraco numero bien");
                }else {
                    System.out.println(score);
                }
            }
}
