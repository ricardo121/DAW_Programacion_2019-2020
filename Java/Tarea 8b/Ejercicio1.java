
import java.util.Scanner;

public class Ejercicio1 {

    public static void main( String args[] ) {

        int numero1 ;
        int numero2 ;
        int numero3 ;
        int numero4 ;
        int resultado1 = 1;
        int resultado2 = 2;
        int resultado3 = 3;
        int resultado4 = 4;
        int i;


        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la combinacion para abrir la caja fuerte: ");
        numero1 = teclado.nextInt();
        numero2 = teclado.nextInt();
        numero3 = teclado.nextInt();
        numero4 = teclado.nextInt();

        for ( i=1 ; i<=3; i++ ) {

            if (numero1 != resultado1 || numero2 != resultado2 || numero3 != resultado3 || numero4 != resultado4) {

                System.out.println("Introduce de nuevo ");
                numero1 = teclado.nextInt();
                numero2 = teclado.nextInt();
                numero3 = teclado.nextInt();
                numero4 = teclado.nextInt();
            }
        }
        if (numero1 != resultado1 || numero2 != resultado2 || numero3 != resultado3 || numero4 != resultado4) {
            System.out.println("Se ha bloqueado la caja fuerte");

        }else{
            System.out.println("Se esta abriendo la caja fuerte");
        }
    }

}
