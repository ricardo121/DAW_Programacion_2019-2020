
import java.util.Scanner;

public class Ejercicio1 {

    public static void main( String args[] ) {

        byte x  , y  , z ;

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca el primer número: " );
        x = teclado.nextByte();
        System.out.print( "Introduzca el segundo número: " );
        y = teclado.nextByte();
          z = (byte)(x+y);
        System.out.print( "Su suma es: " );
        System.out.println( z);
    }

}


