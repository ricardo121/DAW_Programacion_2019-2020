
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String args[]) {

        float numero1;
        float numero2;
        float numero3;
        float media;
        String recu1 = "apto";
        String recu2 = "no apto";

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la nota de los tres controles ");
        numero1 = teclado.nextFloat();
        teclado.nextLine();
        numero2 = teclado.nextFloat();
        teclado.nextLine();
        numero3 = teclado.nextFloat();
        teclado.nextLine();

        media = (numero1 + numero2 + numero3) / 3;


        if (media < 5) {

            System.out.println("¿Cuál ha sido el resultado de la recuperación?");

            String recuperacion = teclado.nextLine();
            if(recuperacion.equalsIgnoreCase(recu1)){
                System.out.print("Tu nota de Programación es: ");
                System.out.print("5");
                System.out.print("-Suficiente ");

            }else if(recuperacion.equalsIgnoreCase(recu2)) {
                System.out.print("Tu nota de Programación es: ");
                System.out.print(media);
                System.out.print("-Suspenso ");
            }

        } else if (5 >= media || media < 6) {
            System.out.print("Tu nota de Programación es: ");
            System.out.print(media);
            System.out.print("-Suficiente ");
        }
         else if(6 >= media || media < 7) {
            System.out.print("Tu nota de Programación es: ");
            System.out.print(media);
            System.out.print("-Bien ");
        }
         else if(7 >= media || media < 9) {
            System.out.print("Tu nota de Programación es: ");
            System.out.print(media);
            System.out.print("-Notable ");
        }
        else {
            System.out.print("Tu nota de Programación es: ");
            System.out.print(media);
            System.out.print("-Sobresaliente ");
        }
    }
}



