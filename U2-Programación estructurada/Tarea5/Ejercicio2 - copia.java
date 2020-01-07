
import java.util.Scanner;

public class Ejercicio2 {

    public static void main( String args[] ) {

        int x ;

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca el número 12 : " );
        x = teclado.nextInt();

        if (x == 12) {
            System.out.print( "Lo ha hecho correctamente" );
        }
        else {
            System.out.print( "No lo ha hecho correctamente" );
        }
    }

}

