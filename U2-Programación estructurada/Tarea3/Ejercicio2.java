
import java.util.Scanner;

public class Ejercicio2 {

    public static void main( String args[] ) {


        short x  , y  , z ;
        Scanner teclado = new Scanner(System.in);
        System.out.print( "Fecha Actual: " );
        x = teclado.nextShort();
        System.out.print( "Fecha de Nacimiento: " );
        y = teclado.nextShort();

         z = (short)(x-y) ;
        System.out.print( "Edad: " );
        System.out.println( z);
    }


}
