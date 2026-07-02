import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DataEstrutures {
    public static void main(String[] args) {
//        arrays
        int[] numbers = new int[3];
        System.out.println(numbers.length);

        String[] names = {"Luis", "Camilo", "Pedro", "Tatiana"};
        System.out.println(names[0]);

        numbers[0] = 25;
        System.out.println(numbers[0]);

        names[2] = null;
        System.out.println(names[2]);

//        Array List

        ArrayList<String> lastnames = new ArrayList<>();
        var streets = new ArrayList<Integer>();
        System.out.println(lastnames.size());
        lastnames.add("Camilita");
        lastnames.add("Carro");
        lastnames.add("Paquete");
        System.out.println(lastnames.size());

        System.out.println(lastnames.getFirst());
        System.out.println(lastnames.get(1));
        System.out.println(lastnames.getLast());

        lastnames.set(1, "Licuadora");
        System.out.println(lastnames.get(1));

        lastnames.removeFirst();
        System.out.println(lastnames.getFirst());

        System.out.println(lastnames.contains("Paquete"));

        lastnames.clear();
        System.out.println(lastnames.size());

//        Sets

        var cars = new HashSet<String>();

        cars.add("Camaleon");
        cars.add("Lagarto");
        cars.add("Camaleon");
        cars.add("Armada");
        System.out.println(cars);
        System.out.println(cars.size());
        cars.remove("Camaleon");
        System.out.println(cars.size());

//        Maps

        var myMap = new HashMap<Integer, String>();
        myMap.put(1, "Usuario Puto");
        myMap.put(2, "Usuario Pato");
        myMap.put(3, "Usuario Pote");
        myMap.put(4, "Usuario Pito");
        System.out.println(myMap);
        System.out.println(myMap.size());
        System.out.println(myMap.get(1));
        System.out.println(myMap.containsKey(2));
        System.out.println(myMap.containsValue("Usuario Puto"));
        System.out.println(myMap.remove(3));
        System.out.println(myMap.size());
    }
}