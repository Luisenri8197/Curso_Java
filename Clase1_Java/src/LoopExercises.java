import java.util.*;

public class LoopExercises {
    static void main(String[] args) {
        // 1. Imprime los números del 1 al 10 usando while.
        int i = 1;
        while(i < 11){
            System.out.printf("Numero %d%n",i);
            i++;
        }

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        var MyArrayList = new ArrayList<>(Arrays.asList("primero", "segundo", "tercero"));
        i = 0;
        do {
            System.out.printf("El jugador llegó de %s%n",MyArrayList.get(i));
            i++;
        }while (i < MyArrayList.size());
        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
        i = 1;
        System.out.println("Los multiplos del 5 son:");
        for (; i < 11; i++){
            int multiplo = 5;
            System.out.printf("%d x %d: %d%n", multiplo, i, multiplo * i);
        }
        // 4. Recorre un Array de 5 números e imprime la suma total.
        var ArrayListNum = new ArrayList<>(Arrays.asList(1,3,4,5,6,7,9,20));
        int acc = 0;
        for (int item : ArrayListNum){
            System.out.printf("Sumando %d con %d%n", acc, item);
            acc += item;
        }
        System.out.printf("El total de la suma del array es %d%n",acc);
        // 5. Usa un for para recorrer un Array y mostrar sus valores.
        int[] ArrayNums = {1,3,5,6,7,8,9,12};
        for (int j = 0; j < ArrayNums.length; j++){
            System.out.printf("El valor de la posición %d es %d%n", j, ArrayNums[j]);
        }
        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        var MyHashSet = new HashSet<>(Set.of("Correr","caminar", "Comer"));
        var MyHashMap = new HashMap<Integer, String>(Map.of(1,"Perro", 2, "Gato", 3, "Perico"));
        for(String item : MyHashSet){
            System.out.printf("A mi me gusta %s%n", item.toLowerCase());
        }

        for (Map.Entry<Integer, String> item : MyHashMap.entrySet()){
            System.out.printf("Yo tengo un %s%n", item.getValue());
        }
        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
        for (int j = 10; j > 0; j--){
            System.out.println(j);
        }
        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
        for(int j = 1; j < 21; j++){
            if(j % 3 == 0 && j > 1){
                System.out.printf("El %d es multiplo de 3%n",j);
                continue;
            }
            System.out.println(j);
        }
        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.

        // 10. Crea un programa que calcule el factorial de un número
        i = 5;
        acc = 1;
        for(; i > 1; i--){
            System.out.printf("Multiplicando %d por %d%n", acc, i);
            acc *= i;
        }
        System.out.printf("El factorial de 5 es %d%n",acc);
    }
}
