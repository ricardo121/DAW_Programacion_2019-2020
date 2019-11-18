import java.util.Scanner;

public class Ejercicio4 {

    public static void main( String args[] ) {

        Scanner teclado = new Scanner(System.in);

        System.out.print( "Deme la cantidad de numeros a introducir:" );
        int cantidad = teclado.nextInt();

        int[] datos = new int[cantidad];
        int[] clave = new int[cantidad];


        for (int i=0; i<=cantidad-1; i++) {

            System.out.println( "Numero Aleatorio "+i+": " );
            clave[i] = (int) (Math.random()*9);
            System.out.println(clave[i]);

        }

        for (int i=0; i<=cantidad-1; i++) {

            System.out.print( "Deme el dato "+i+": " );
            datos[i] = teclado.nextInt();

        }

        for (int i=0; i<=cantidad-1; i++) {

            if (clave[i]<datos[i]){

                System.out.println( "El numero "+ datos[i] +" es mayor ");

            }else if(clave[i]>datos[i]){

                System.out.println( "El numero "+ datos[i] +" es menor ");

            }else{
                System.out.println( "El numero "+ datos[i] +" es igual ");
            }

        }

    }

}
