import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String args[]) {

        int longitud ;

        Scanner teclado = new Scanner(System.in);
        System.out.print("introduzca frase: ");
        String frase = teclado.nextLine();
        longitud = frase.length();

        String muletilla1 = frase.substring(0 , 20);
        String muletilla2 = frase.substring(longitud-20, longitud);

        String muletilla3 = "Javalín, javalón    ";
        String muletilla4 = "   javalén, len, len";

        String resultado1 = frase.substring(20 , longitud);
        String resultado2 = frase.substring(0 , longitud-20);

        if (muletilla1.equals(muletilla3)) {
            System.out.println("Idioma de Javalandia");
            System.out.println(resultado1);
            //System.out.println(muletilla1);

        }else if(muletilla2.equals(muletilla4)) {
            System.out.println("Idioma de Javalandia");
            System.out.println(resultado2);
            //System.out.println(muletilla2);

        }else {
            System.out.println("No es el idioma de Javalandia ");
        }

    }

}
