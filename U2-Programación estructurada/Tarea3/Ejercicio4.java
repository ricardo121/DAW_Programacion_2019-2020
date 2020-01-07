
import java.util.Scanner;

public class Ejercicio4 {

    public static void main( String args[] ) {



            float x ,z ;
            //int y = 1.609 ;
            Scanner teclado = new Scanner(System.in);
            System.out.print( "Introduzca un numero de millas para hacer la conversion a KM: " );
            x = teclado.nextFloat();

            z = (float)(x * 1.609) ;
            System.out.print( "Su Equivalencia en Km: " );
            System.out.print( z );
            System.out.print( " Km" );

    }

}
