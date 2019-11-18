import java.util.Scanner;

public class Ejercicio7 {

    public static boolean primo(int numero) {
        int contador = 2;
        boolean primo=true;
        if (numero==1){
            primo = false;
        }

        while ((primo=true) && (contador!=numero)){
            if (numero % contador == 0)
                primo = false;
            contador++;
        }
        return primo;
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
