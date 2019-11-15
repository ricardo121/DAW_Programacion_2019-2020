import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main( String args[] ) {

        Scanner teclado = new Scanner(System.in);

        System.out.print( "Deme la cantidad de numeros a introducir:" );
        //int cantidad = teclado.nextInt();

        int[] datos1 = new int[4];
        int[] datos2 = new int[4];
        int[] resultado = new int[12];


        for (int i=0; i<=4-1; i++) {

            System.out.print( "Numero Aleatorio "+i+": " );
            datos1[i] = (int) (Math.random()*9);
            System.out.println(datos1[i]);

        }

        for (int i=0; i<=4-1; i++) {

            System.out.print( "Deme el dato "+i+": " );
            datos2[i] = (int) (Math.random()*9);
            System.out.println(datos2[i]);


        }

        int contador1=0;
        int contador2=0;

        for (int i=0; i<=12; i++) {

            if ((contador1<=datos1.length) && (contador2<=datos2.length)){
                if (datos1[contador1]<=datos2[contador2]) {
                    resultado[i]=datos1[contador1];
                    contador1++;
                }else{
                    resultado[i]=datos2[contador2];
                    contador2++;
                }
            }else {

                if (contador1>datos1.length) {
                    resultado[i]=datos2[contador2];
                    contador2++;

                }else if (contador2>datos2.length){

                    resultado[i]=datos1[contador1];
                    contador1++;

                }

            }




        }



        //System.out.println(contador);
        Arrays.sort(datos1);
        Arrays.sort(datos2);
        System.out.println(Arrays.toString(datos1));
        System.out.println(Arrays.toString(datos2));
        System.out.println(Arrays.toString(resultado));


    }

}
