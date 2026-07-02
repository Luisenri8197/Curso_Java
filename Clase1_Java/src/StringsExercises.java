import java.lang.classfile.ClassTransform;
import java.lang.classfile.Signature;

public class StringsExercises {
    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.
        String name = "Luisito";
        String LastName = "Calvito";
        System.out.println(String.format("El amigo de mi primo que es albañil de mi yerno se llama %s %s", name, LastName));
        // 2. Muestra la longitud de una cadena de texto.
        System.out.println("El nombre tiene " + name.length() + " caracteres");
        // 3. Muestra el primer y último carácter de un string.
        System.out.println(String.format("La primera letra del nombre %s es %s y su ultima letra es %s", name, name.charAt(0), name.toUpperCase().charAt(name.length()-1)));
        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println(LastName.toUpperCase());
        System.out.println(LastName.toLowerCase());
        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println(name.contains("jorge"));
        // 6. Formatea un string con un entero.
        int edad = 40;
        System.out.println(String.format("El viejo verde ese tiene %d años", edad));
        // 7. Elimina los espacios en blanco al principio y final de un string.
        System.out.println("Que es padalustro?".replace(" ", ""));
        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println("Que es padalustro?".replace(" ", "-"));
        // 9. Comprueba si dos strings son iguales.
        System.out.println(name.equals(LastName));
        // 10. Comprueba si dos strings tienen la misma longitud.
        System.out.println(name.length() == LastName.length());
    }
}