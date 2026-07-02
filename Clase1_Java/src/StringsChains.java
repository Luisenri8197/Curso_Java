public class StringsChains {
    public static void main(String[] args) {
//        cadenas de texto
        String name = "Luis";
        new String("Luis");
        var surname = new String("Ordonez");

//        Operaciones basicas

//        Concatenacion
        System.out.println(name + " " + surname);

//        Metodo length
        System.out.println("El nombre " + name + " tiene una longitud de " + name.length() + " Caracteres");

//        Metodo charAt
        System.out.println("La letra en la posicion 2 en " + name + " es " + name.charAt(1));
        System.out.println("El total de letras en " + name + " es " + name.length());

//        Substring - subcadena un pedazo de la palabra
        System.out.println(surname.substring(2,(surname.length()-1)));

//        Transformar Strings
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

//        Contains - valdar con regex creo
        System.out.println("Hola, Mundo".contains("ola"));

//        Equal - comparacion
        System.out.println(name.equals(surname));
        System.out.println(name.equalsIgnoreCase("LUIS"));

//        Trim y replace - limpieza eliminaion o reemplazo
        System.out.println("Hola, me llamo Luis    ".trim());

        System.out.println("Hola carecola    peliagudo triangular".replace(" ", ""));

//        Format - interpolacion
        name = "Luisito";
        var age = 25;
        System.out.println(String.format("Hola me llamo %s y tengo %d años", name, age));

    }
}