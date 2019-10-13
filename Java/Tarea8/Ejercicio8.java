package U6;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main( String args[] ) {

        int n ;
        int i;
        int resultado = 1;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce tu numero: ");
        n = teclado.nextInt();

        for ( i=n ; i>0 ; i-- ) {
            resultado = resultado * i ;

        }
        System.out.println(resultado);

    }

}
