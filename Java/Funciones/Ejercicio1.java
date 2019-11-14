import java.util.Scanner;

public class Ejercicio1 {


    public static void eco(int n) {
        int cont= 0;
            while (n>cont) {

        cont = cont + 1;
        System.out.println("Eco...");

    }

    }

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca numero: ");

        int n=teclado.nextInt();
        eco(n);

    }


}
