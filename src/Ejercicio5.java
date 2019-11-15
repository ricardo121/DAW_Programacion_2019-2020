import java.util.Scanner;

public class Ejercicio5 {

    public static void main( String args[] ) {

        Scanner teclado = new Scanner(System.in);

        System.out.print( "Deme la cantidad de numeros a introducir:" );
        //int cantidad = teclado.nextInt();

        int[] datos1 = new int[6];
        int[] datos2 = new int[6];


        for (int i=0; i<=6; i++) {

            System.out.print( "Numero Aleatorio "+i+": " );
            datos1[i] = (int) (Math.random()*9);
            System.out.println(datos1[i]);

        }

        for (int i=0; i<=6; i++) {

            System.out.print( "Deme el dato "+i+": " );
            datos2[i] = (int) (Math.random()*9);
            System.out.println(datos2[i]);

        }



    }

}
