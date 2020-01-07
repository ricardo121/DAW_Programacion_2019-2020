import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

    public static long trozoDeNumero(long x, int inicio, int fin){

        long resultado = 0;
        long c = 0;
        while (x > 0){

            long resto = x % 10;
            c = ((c *10));
            if (c==inicio){
                resultado = ((c *10) + resto);
            }
            x /= 10;
            System.out.println("riki43 : "+resultado);
        }

        long num_juntos = 1243212;


        return resultado;


    }


    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        //System.out.print("Introduzca un número: ");
        //long x = teclado.nextLong();
        long x = 15748293;
        int inicio = 5;
        int fin = 2;
        System.out.print("Numero: "+x);
        //teclado.nextLine();


        //System.out.println("Num: ");
        System.out.println("Numero resutado: " + trozoDeNumero(x, inicio,fin));
       // System.out.println("Los dos números unidos quedarían: " + juntaNumeros(x, b));
    }


}
