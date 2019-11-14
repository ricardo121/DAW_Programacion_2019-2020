import java.util.Scanner;

public class Ejercicio9 {

    public static boolean primo(int numero) {

    }

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un primer numero: ");
        int numero=teclado.nextInt();
        primo(numero);

        System.out.print("Es primo");
        System.out.print(primo(numero));
    }

}
