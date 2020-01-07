
import java.util.Scanner;

public class Ejercicio3 {

    public static void main( String args[] ) {

        int x , par  ;

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca un número : " );
        x = teclado.nextInt();

        if (x % 2 == 0  ) {
            par = 1;
            System.out.println( par );
        }
        else {
            par = 0;
            System.out.println( par );
        }
        // Ejercicio con operador condicional
        par = x % 2 == 0 ?  1 : 0;

        System.out.print( " vale... " );
        System.out.println( par );
    }

}
