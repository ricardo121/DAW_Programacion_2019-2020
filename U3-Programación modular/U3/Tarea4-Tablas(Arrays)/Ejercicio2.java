import java.util.Scanner;

public class Ejercicio2 {

    public static void main( String args[] ) {

        Scanner teclado = new Scanner(System.in);

        System.out.print( "Deme la cantidad de numeros a introducir:" );
        int cantidad = teclado.nextInt();

        int[] datos = new int[cantidad];

       // int[] datos = new int[5];
        for (int i=0; i<=cantidad-1; i++)
        {
            System.out.print( "Deme el dato "+i+": " );
            datos[i] = teclado.nextInt();
        }

        for (int i=0; i<=cantidad-1; i++)
        {
            System.out.println( "El dato "+ i +" vale " + datos[i] );
        }
    }

}
