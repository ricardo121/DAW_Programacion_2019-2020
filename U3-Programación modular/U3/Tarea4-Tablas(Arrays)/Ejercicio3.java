import java.util.Scanner;

public class Ejercicio3 {

    public static void main( String args[] ) {

        Scanner teclado = new Scanner(System.in);

        System.out.print( "Deme la cantidad de numeros a introducir:" );
        int cantidad = teclado.nextInt();

        int[] datos = new int[cantidad];

        int contador1=0;
        int contador2=0;
        int contador3=0;
        int positivos=0;
        int negativos=0;
        int resultado1=0;
        int resultado2=0;

        for (int i=0; i<=cantidad-1; i++)
        {
            System.out.print( "Deme el dato "+i+": " );
            datos[i] = teclado.nextInt();
        }

        for (int i=0; i<=cantidad-1; i++)
        {
            System.out.println( "El dato "+ i +" vale " + datos[i] );
            if (datos[i]>0){
                contador1++;
                positivos= positivos + datos[i];
                resultado1 = positivos/contador1 ;

            }else if (datos[i]<0){
                contador2++;
                negativos= negativos + datos[i];
                resultado2 = negativos/contador2 ;

            }else{
                contador3++;
            }

            //System.out.println( "El dato "+ i +" vale " + datos[i] );
        }
        System.out.println( "Positivos Media:" );
        System.out.println(resultado1);
        System.out.println( "Negativos Media:" );
        System.out.println(resultado2);
        System.out.println( "Numero de 0:" );
        System.out.println(contador3);
    }
}

