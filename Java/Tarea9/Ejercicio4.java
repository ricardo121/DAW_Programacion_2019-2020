import java.util.Scanner;

public class Ejercicio4 {


    public static void main(String args[]) {

        int longitud ;

        Scanner teclado = new Scanner(System.in);
        System.out.print("introduzca frase: ");

        String frase = teclado.nextLine();
        longitud = frase.length() / 2 ;
        String mitad = frase.substring(longitud, longitud + 1);
        String espacio = " ";
        if (mitad.equals(espacio)) {
            System.out.println("Es un espacio");
        } else {
            System.out.println("No es un espacio");
        }


    }
}
