import java.util.Scanner;

public class Ejercicio2 {

    public static void main( String args[] ) {


        int longitud ;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Acierta la contraseña ");
        System.out.print("Introduce una contraseña: ");
        String password = teclado.next();
        longitud = password.length();
        char primera = password.charAt(0);
        char ultima = password.charAt(longitud -1);

        System.out.println(">Pistas : ");

        System.out.print("Numero de Caracteres : ");
        System.out.println(longitud);

        System.out.print("Primera Letra : ");
        System.out.println(primera);

        System.out.print("Ultima Letra : ");
        System.out.println(ultima);

        System.out.print("Introduce la contraseña : ");
        String palabra = teclado.next();

        while (!password.equals(palabra)) {

            System.out.println("Fallaste");
            System.out.println("Intentalo de Nuevo : ");
            palabra = teclado.next();

        }

        if (password.equals(palabra)) {

            System.out.println("Acertaste!!");

        }

    }

}
