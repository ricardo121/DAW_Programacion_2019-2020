import java.util.Scanner;

public class Ejercicio6 {

    public static void main( String args[] ) {

        double x , y = 9.8 , z ;
        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca un Tiempo : " );
        x = teclado.nextDouble();
        z = (double) (x * y) ;


        if (x > 0 ) {
            System.out.println( z );
            System.out.print( " m/s" );
        }
        else {
            System.out.print( "Tiempo incorrecto" );
        }

    }
}
