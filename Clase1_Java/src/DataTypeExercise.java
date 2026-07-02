public class DataTypeExercise {

    public static void main(String[] args) {

        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String name = "Luis";
        // 2. Crea una variable de tipo int y asígnale tu edad.
        int age = 25;
        // 3. Crea una variable double con tu altura en metros.
        var height = 1.80;
        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean meGustaProgramar = true;
        // 5. Declara una constante con tu email.
        final String EMAIL = "ejemplo@gmail.com";
        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char initial = 'L';
        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String localidad = "primero de mayo";
        System.out.println(localidad);
        localidad = "segundo de mayo";
        System.out.println(localidad);
        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 2;
        int b = 3;
        System.out.println(a + b);
        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println(((Object) a).getClass().getSimpleName());
        System.out.println(((Object) b).getClass().getSimpleName());
        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        var barrio = "mayo";
        barrio = "tercero de mayo";
        System.out.println(barrio);
    }
}
