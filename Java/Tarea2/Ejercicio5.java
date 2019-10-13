
import java.util.Scanner;

public class Ejercicio5 {

    public static void main( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca un número de grados y se hara la conversion a Fahrenheit: " );

        int primerNumero = (9 * teclado.nextInt()/5) + 32;

        System.out.print( "El Equivalente es : " );
        System.out.print( primerNumero  );
        System.out.print( " F" );
    }

}
