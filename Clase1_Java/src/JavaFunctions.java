public class JavaFunctions {
    static void main(String[] args) {

        // Funciones
        sendEmail();

        sendEmailUser("Luis");

        sendEmail("Lucas", 3109234);

        System.out.println(sendEmailRetorno());

    }
// ------------ Funciones sin retorno -----------
    public static void sendEmail(){
        System.out.println("se envia email");
    }

    public static void sendEmailUser(String user){
        System.out.printf("Se envió email a %s%n",user);
    }

    public static void sendEmail(String user, int phone){
        System.out.printf("Se envió email a %s y al telefono %d%n",user, phone);
    }
// --------Funciones con retorno ----------------
    public static boolean sendEmailRetorno(){
        System.out.println("Se envió email con retorno");

        return true;
    }
}
