import java.util.Scanner;

public class Ejercicio6 {

    public static boolean vocal(char caracter) {

        if (caracter == 'a'||caracter == 'e'||caracter=='i'||caracter=='o'||caracter=='u'){
                return true;
        }else {
            return false;
        }


    }

    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca Vocal: ");
        char caracter = teclado.next().charAt(0);

        //eco(caracter);

        System.out.print("Es una vocal: ");
        System.out.print(vocal(caracter));

    }

}
