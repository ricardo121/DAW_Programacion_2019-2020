import java.util.Scanner;

public class Ejercicio4 {

    public static void main( String args[] ) {

        Scanner teclado = new Scanner(System.in);

        System.out.print( "Deme la cantidad de numeros a introducir:" );
        int cantidad = teclado.nextInt();

        int[] datos = new int[cantidad];



        for (int i=0; i<=cantidad-1; i++)
        {
            System.out.print( "Deme el dato "+i+": " );
            datos[i] = Math.random(9);
        }

        for (int j=0; j<=cantidad-1; j++)
        {
            System.out.print( "Deme el dato "+j+": " );
            datos[j] = teclado.nextInt();
        }

        for (int i=0; i<=cantidad-1; i++)
        {
            System.out.println( "El dato "+ i +" vale " + datos[i] );


            //System.out.println( "El dato "+ i +" vale " + datos[i] );
        }

    }

}
