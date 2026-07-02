public class OperatorsExcersices {
    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operación aritmética.
        int a = 2;
        int b = 3;
        double c;
        c = a + b;
        System.out.println(c);
        c = a - b;
        System.out.println(c);
        c = a * b;
        System.out.println(c);
        c = (double)a / b;
        System.out.printf("%.2f%n", c);
        // 2. Crea una variable para cada tipo de operación de asignación.
        c += a;
        System.out.println(c);
        c -= a;
        System.out.println(c);
        c *= a;
        System.out.println(c);
        c /= a;
        System.out.println(c);
        c %= a;
        System.out.println(c);
        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        System.out.println(a != c);
        System.out.println(c < a);
        System.out.println(b >= a);
        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        System.out.println(a == c);
        System.out.println(b < c);
        System.out.println(c != c);
        // 5. Utiliza el operador lógico and.
        System.out.println(a > c && c < b);
        // 6. Utiliza el operador lógico or.
        System.out.println(a == b || b == a);
        // 7. Combina ambos operadores lógicos.
        System.out.println(a > b && c < b || c != a);
        // 8. Añade alguna negación.
        System.out.println(!(a == a));
        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        System.out.println(-b);
        System.out.println(+c);
        System.out.println(++a);
        // 10. Combina operadores aritméticos, de comparación y lógicos.
    }
}
