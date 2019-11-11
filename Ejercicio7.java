import java.util.Scanner;

public class Ejercicio7 {

    public static void eco(int n) {
        if (n%2!=0) {
            System.out.print(n);
            System.out.print("Es Impar");

        }else{
            System.out.print("Es par");
        }

    }

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca numero: ");

        int n=teclado.nextInt();
        eco(n);

    }

}
