import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);
        int t[][] = new int[5][5];

        for (int n = 0; n < 5; n++){

            for (int m = 0 ; m < 5 ; m++){

                t[n][m] = n + m;

            }

        }

        System.out.println("Este es el contenido de la tabla");
        System.out.println(Arrays.deepToString(t));
        teclado.close();

    }
}