import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {

    public static int[] sinRepeticiones(int datos[]) {

        int longitud = datos.length;

        for (int i = 0; i < longitud; i++) {

            for (int j = i+1; j < longitud; j++){

                if (datos[i] == datos[j]) {

                    datos[j] = datos[longitud-1];
                    longitud--;

                }

            }
        }
        int resultado[] = Arrays.copyOf(datos,longitud);
        return resultado;

    }

    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Deme la cantidad de numeros a introducir:");
        int cantidad = teclado.nextInt();

        int[] t = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {

            System.out.print("Deme el dato " + i + ": ");
            t[i] = teclado.nextInt();

        }
        System.out.println(Arrays.toString(t));
        System.out.println(Arrays.toString(sinRepeticiones(t)));

    }

}