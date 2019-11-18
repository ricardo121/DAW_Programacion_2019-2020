import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);

        //System.out.println("Deme la cantidad de numeros a introducir:");
        //int cantidad = teclado.nextInt();

        int[] datos1 = new int[6];
        int[] datos2 = new int[6];
        int[] resultado = new int[datos1.length+datos2.length];


        for (int i = 0; i <= datos1.length - 1; i++) {

            System.out.print("Numero Aleatorio " + i + ": ");
            datos1[i] = (int) (Math.random() * 9);
            System.out.println(datos1[i]);

        }

        for (int i = 0; i <= datos2.length - 1; i++) {

            System.out.print("Deme el dato " + i + ": ");
            datos2[i] = (int) (Math.random() * 9);
            System.out.println(datos2[i]);


        }

        Arrays.sort(datos1);
        Arrays.sort(datos2);
        System.out.println(Arrays.toString(datos1));
        System.out.println(Arrays.toString(datos2));

        int contador1 = 0;
        int contador2 = 0;

        for (int i = 0; i < resultado.length; i++) {

            if ((contador1 < datos1.length) && (contador2 < datos2.length)) {
                if (datos1[contador1] <= datos2[contador2]) {
                    resultado[i] = datos1[contador1];
                    contador1++;
                } else {
                    resultado[i] = datos2[contador2];
                    contador2++;
                }
            } else {

                if (contador1 >= datos1.length) {
                    resultado[i] = datos2[contador2];
                    contador2++;

                } else if (contador2 >= datos2.length) {

                    resultado[i] = datos1[contador1];
                    contador1++;

                }

            }


        }


        //System.out.println(contador);

        System.out.println(Arrays.toString(resultado));


    }
}
