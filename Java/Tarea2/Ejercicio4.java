
import java.util.Scanner;

public class Ejercicio4 {

    public static void main( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca un número de millas y se hara la conversion a metros: " );

        int primerNumero = 1609 * teclado.nextInt();

        System.out.print( "El Equivalente es : " );
        System.out.print( primerNumero  );
        System.out.print( " m"  );
    }

}
