
import java.util.Scanner;

public class Ejercicio3 {

    public static void main( String args[] ) {


        Double x  , y  , z ;
        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca el primer número: " );
        x = teclado.nextDouble();
        System.out.print( "Introduzca el segundo número: " );
        y = teclado.nextDouble();

        z = (double)(x/y) ;
        System.out.print( "La Division de los dos numeros es: " );
        System.out.println( z);
    }

}
