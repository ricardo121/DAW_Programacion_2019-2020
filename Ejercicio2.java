import java.util.Scanner;

public class Ejercicio2 {

    public static void eco(int n1, int n2) {
        int cont= 0;
        if (n1 > n2) {

            for (int i=n2+1 ; i<n1 ; i++ ){
                cont = i + 1;
                System.out.println(i);

            }


        }
        if (n1 < n2) {

            for (int i=n1+1 ; i<n2 ; i++ ){
                cont = i + 1;
                System.out.println(i);

            }

        }

    }

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un primer numero: ");
        int n1=teclado.nextInt();
        System.out.print("Introduzca un segundo numero: ");
        int n2=teclado.nextInt();
        eco(n1,n2);

    }


}
