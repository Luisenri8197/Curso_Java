import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Loops {
    static void main(String[] args) {
        // Loops
        for (int i = 1; i <= 5; i++){
            System.out.printf("Esto se ha repetido %d veces%n",i);
        }

        var clases = new ArrayList<>(List.of("PEDRO","MARIA","TATIANA","JESSICA"));
        for(int i = 0; i < clases.size(); i++){
            System.out.printf("A %s le gusta el chorizo gordo%n",clases.get(i));
        }
        for(String clase : clases){
            System.out.printf("A %s le gusta el panochon%n",clase);
        }

        var MyHash = new HashMap<Integer, String>(Map.of(1, "Pedro",2,"Maria",3, "Tatiana",4, "Jessica"));

        System.out.println(MyHash);

        for(Map.Entry<Integer, String> codigo : MyHash.entrySet()){
            System.out.println(codigo.getValue());
        }

        // WHILE - DO WHILE

        int index = 1;
        while (index < 5){
            System.out.printf("esto se imprimió %d veces%n",index);
            index++;
        }
        index = 0;
        while (index < clases.size()){
            System.out.printf("a %s le gusta la pichula%n",clases.get(index));
            index++;
        }

        do {
            System.out.printf("Pasé %d vez alv",index);
            index++;
        } while (index < 5);

        // Para control de bucles existe el break y el continue
    }
}
