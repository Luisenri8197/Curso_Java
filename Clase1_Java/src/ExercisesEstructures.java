import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ExercisesEstructures {

        public static void main(String[] args) {

            // 1. Crea un Array con 5 valores e imprime su longitud.

            String[] myArray = new String[5];
            System.out.println(myArray.length);

            // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
            System.out.println(myArray[0]);
            myArray[0] = "Camioneta";
            System.out.println(myArray[0]);
            // 3. Crea un ArrayList vacío.
            var myArrayList = new ArrayList<Integer>();

            // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
            myArrayList.add(1);
            myArrayList.add(2);
            myArrayList.add(3);
            myArrayList.add(4);
            System.out.println(myArrayList.size());
            myArrayList.removeFirst();
            System.out.println(myArrayList.size());
            // 5. Crea un HashSet con 2 valores diferentes.
            var mySet = new HashSet<String>();
            mySet.add("Carlos");
            mySet.add("Valeria");
            System.out.println(mySet);
            // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
            mySet.add("Valeria");
            mySet.add("Hugo");
            System.out.println(mySet);
            // 7. Elimina uno de los elementos del HashSet.
            mySet.remove("Carlos");
            System.out.println(mySet);
            // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
            var myMap = new HashMap<String, Integer>();
            myMap.put("Carlos", 315286);
            myMap.put("Pedro", 315287);
            myMap.put("Camila", 315288);
            System.out.println(myMap);
            // 9. Modifica uno de los contactos y elimina otro.
            myMap.replace("Carlos", 315444);
            System.out.println(myMap);
            myMap.remove("Camila");
            System.out.println(myMap);
            // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales
            System.out.println(myArray.getClass().getSimpleName()); // Valida si es Array []
            var myArrayListTransform = new ArrayList<>(Arrays.asList(myArray)); //Se transforma el Array en ArrayList
            System.out.println(myArrayListTransform.getClass().getSimpleName()); // Valida si es ArrayList
            var MySetTransform = new HashSet<>(myArrayListTransform); // Transforma el ArrayList en un HashSet
            System.out.println(MySetTransform.getClass().getSimpleName()); // Valida a que clase pertenece
            // Para transformar una colección a Map, se debe usar un loop, que básicamente recorra la colección y le asigne ya sea una clave o un valor, dependiendo de lo que necesites
        }
}
