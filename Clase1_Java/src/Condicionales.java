public class Condicionales {
    public static void main(String[] args) {
//        condicionales

        var age = 5;
        if (age < 18){
            System.out.println("Papi tas muy peque");
        }else {
            System.out.println("Papi, pasele");
        }

//        Switch - case
        var day = 8;
        switch (day){
            case 1:
                System.out.println("Entra al case 1");
                break;
            case 2:
                System.out.println("Entra al case 2");
                break;
            case 3:
                System.out.println("Entra al case 3");
                break;
            default:
                System.out.println("Tu mamita la mocha");
        }
    }
}
