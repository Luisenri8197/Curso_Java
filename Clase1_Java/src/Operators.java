public class Operators {
    public static void main(String[] args) {
//        Operadores
        var a = 2;
        var b = 3;
        double c = (double) a / (double) b;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(c);
        System.out.println((double) a / b);
        System.out.println((double) a % b);

//        Asignacion

        a = b;
        System.out.println(a);
        a = b * 2;
        System.out.println(a);
        a += 1;
        System.out.println(a);
        a -= 1;
        System.out.println(a);
        a *= 2;
        System.out.println(a);
        a /= 2;
        System.out.println(a);

//        comparacion
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a < b);
        System.out.println(a > b);

//        Operadores logicos

        System.out.println(true && true);
        System.out.println(true || false);

//        Negacion
        System.out.println(!true && true);
        System.out.println(!true || false);

//        Operadores unarios
        int d = 3;
        System.out.println(-d);
        System.out.println(+d);
        System.out.println(++d);
        System.out.println(d++);
        System.out.println(d);

    }
}
