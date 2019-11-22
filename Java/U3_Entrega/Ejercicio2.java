import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);

        int suma1 = 0;
        int suma2 = 0;
        int suma3 = 0;
        int suma4 = 0;
        int suma5 = 0;

        int t[][] = new int[4][5];

        for (int n = 0; n < 4; n++){

            for (int m = 0 ; m < 5 ; m++){
                //System.out.println("numero");
                //t[n][m] = n + m;
                t[n][m] = teclado.nextInt();


                if (t[n][m] ==t[n][0]){

                    suma1= suma1 + t[n][0];

                }
                if(t[n][m]==t[n][1]){

                    suma2= suma2 + t[n][1];

                }
                if(t[n][m]==t[n][2]){

                    suma3= suma3 + t[n][2];

                }
                if(t[n][m]==t[n][3]){

                    suma4= suma4 + t[n][3];

                }
                if(t[n][m]==t[n][4]){

                    suma5= suma5 + t[n][4];

                }


            }

        }

        System.out.println("Este es el contenido de la tabla");
        System.out.println(Arrays.deepToString(t));
        System.out.println("Suma de los valores de la Columna 1 ");
        System.out.println(suma1);
        System.out.println("Suma de los valores de la Columna 2 ");
        System.out.println(suma2);
        System.out.println("Suma de los valores de la Columna 3 ");
        System.out.println(suma3);
        System.out.println("Suma de los valores de la Columna 4 ");
        System.out.println(suma4);
        System.out.println("Suma de los valores de la Columna 5 ");
        System.out.println(suma5);
        System.out.println("Suma de todos los valores");
        int total = 0;
        total = suma1 + suma2 + suma3 + suma4 + suma5;
        System.out.println(total);
        teclado.close();



        System.out.println("Cuadrado");

        System.out.println("--------\n");

        for (int n = 0; n < 4; n++) {

            for (int m = 0; m < 5; m++) {
                //System.out.println("numero");
                //t[n][m] = n + m;
                System.out.print(t[n][m]);
                System.out.print(" ");
                System.out.print(" ");

            }
            System.out.print(suma1);
            System.out.print(" ");
            System.out.print(" ");
            System.out.print("\n");

        }
        System.out.print(suma1);
        System.out.print(" ");
        System.out.print(suma2);
        System.out.print(" ");
        System.out.print(suma3);
        System.out.print(" ");
        System.out.print(suma4);
        System.out.print(" ");
        System.out.print(suma5);


    }
}
