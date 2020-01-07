
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String args[]) {

        int x ;
        int y = 0 ;
        int i;
        int resultado1 = 1 ;
        int resultado2 ;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero : ");
        x = teclado.nextInt();

        for (i = 1; i <= x; i++) {

            resultado2 = y ;
            y = resultado1 + y;
            resultado1 = resultado2;

            //System.out.println("El resultado es: ");
            //System.out.println(resultado1);

        }

        System.out.println("El resultado es: ");
        System.out.println(resultado1);

    }

}
