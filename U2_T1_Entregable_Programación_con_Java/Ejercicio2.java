import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String args[]) {

        long numero;
        long falta,numeroInvertido,resto;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce numero ");
        numero = teclado.nextLong();

        while(numero<=0);
        falta=numero;
        numeroInvertido=0;
        resto=0;

        while(falta!=0)
        {
            resto=falta%10;
            numeroInvertido=numeroInvertido*10+resto;
            falta=falta/10;
        }

        if(numeroInvertido==numero)
            System.out.println("\nEl numero es capicua\n");
        else
            System.out.println("\nEl numero no es capicua\n");

    }
}
