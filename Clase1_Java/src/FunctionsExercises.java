import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class FunctionsExercises {
    static void main(String[] args) {
        // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".

        wellcome();

        // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.

        wellcome("Maria");

        // 3. Haz un metodo que reciba dos números enteros y devuelva su resta.

        wellcome(2,6);

        // 4. Crea un metodo que calcule el cuadrado de un número (n * n).

        wellcome(4);

        // 5. Escribe una función que reciba un número y diga si es par o impar.

        even(5);

        // 6. Crea un metodo que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).

        System.out.println(permiso(5));

        // 7. Implementa una función que reciba una cadena y retorne su longitud.

        var myArrayList = new ArrayList<>(Arrays.asList("secretario", "bombero", "enfermero", "profesor"));
        recorrer(myArrayList);

        //  8. Crea un metodo que reciba un array de enteros, calcula su media y lo retorna.

        int[] myArray = {2, 4, 6, 7, 4, 5};
        System.out.printf("El promedio del Array %s es %.2f%n", Arrays.toString(myArray), recorrer(myArray));

        // 9. Escribe un metodo que reciba un número y retorna su factorial.

        System.out.printf("El factorial 5 es %d", fact(5));

        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.



    }
    public static void wellcome(){
        System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");
    }

    public static void wellcome(String name){
        System.out.printf("tonces %s sapa perra%n",name);
    }

    public static void wellcome(int a, int b ){
        int c = a - b;
        System.out.printf("la resta de %d y %d es: %d%n", a, b, c);
    }

    public static void wellcome(int a ){
        double c = Math.pow(a, 2);
        System.out.printf("El cuadrado de %d es: %.0f%n", a, c);
    }

    public static void even(int a ){
        if(a % 2 == 0){
            System.out.printf("El número %d es par%n",a);
            return;
        }
        System.out.printf("El número %d es impar%n", a);
    }

    public static boolean permiso(int a){
        if(a < 18){
            System.out.println("Parce vaya termine de crecer si?");
            return false;
        }
        System.out.println("Pasele mijo, gaste gaste perrito");
        return true;
    }
    public static void recorrer(ArrayList<String> myArrayList){
        for (String item : myArrayList){
            System.out.printf("Yo soy %s%n", item);
        }
    }

    public static double recorrer(int[] myArray){
        int acc = 0;
        for (int item : myArray) acc += item;
        return (double) acc / myArray.length;

    }
    public static int fact(int a){
        int acc = 1;
        for(; a > 0; a--) acc *= a;
        return acc;
    }
}
