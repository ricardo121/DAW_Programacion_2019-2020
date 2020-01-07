import java.util.Scanner;

public class Ejercicio4 {

    public static void main( String args[] ) {

        int n, contador;
        contador = 0;
        n = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce tu numero: ");
        n = teclado.nextInt();
        do {
            contador++;
            System.out.println(contador);
        }

            while (n != contador) ;
        }

    }


