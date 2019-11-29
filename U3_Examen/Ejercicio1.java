import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Numero de Filas:");
        int filas = 4;
        System.out.println("Numero Columnas:");
        int columnas = 4;
        int t[][] = new int[filas][columnas];



        int sumaFila;

        for (int i = 0; i < filas; i++) {
            for (int pos = 0; pos < columnas; pos++) {
                System.out.print("Fila " + i + ", columna " + pos + ": ");
                t[i][pos] = teclado.nextInt();
            }
        }



        for (int i = 0; i < filas; i++) {
            sumaFila = 0;

            for (int j = 0; j < columnas; j++) {
                System.out.printf("%7d   ", t[i][j]);
               // sumaFila += t[i][j];
                //sumaFila += t[i][j];
            }

            System.out.printf("|%7d\n", sumaFila);
        }



                //t[n][m] = (int) (Math.random() * 100);



      //  System.out.println(Arrays.deepToString(t));
    }

}
