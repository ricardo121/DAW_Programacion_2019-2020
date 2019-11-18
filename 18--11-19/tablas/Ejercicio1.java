import java.util.Scanner;

public class Ejercicio1 {

    public static void main( String args[] ) {

        Scanner teclado = new Scanner(System.in);

        double[] datos = new double[5];
        for (int i=0; i<5; i++)
        {
            System.out.print( "Deme el dato "+i+": " );
            datos[i] = teclado.nextDouble();
        }

        for (int i=0; i<=4; i++)
        {
            System.out.println( "El dato "+ i +" vale " + datos[i] );
        }
    }

}
