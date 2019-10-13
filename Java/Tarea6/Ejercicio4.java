import java.util.Scanner;

public class Ejercicio4 {

    public static void main( String args[] ) {

        byte x , y , menor ;

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca un número : " );
        x = teclado.nextByte();
        System.out.print( "Introduzca otro número : " );
        y = teclado.nextByte();

        if ( x < y ) {
            menor = x ;
            System.out.println( menor );
        }
        else {
            menor = y ;
            System.out.println( menor );
        }
        // Ejercicio con operador condicional
         menor = (x < y) ?  x:y ;
         System.out.print( " vale... " );
         System.out.println( menor );
    }

}
