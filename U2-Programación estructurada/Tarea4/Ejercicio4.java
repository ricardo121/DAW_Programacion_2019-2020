
import java.util.Scanner;

public class Ejercicio4 {

    public static void main( String args[] ) {

        double x ;

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca número decimal: " );
        x = teclado.nextDouble();
        System.out.println(Math.round(x));
    }

}
