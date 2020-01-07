import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String args[]) {

        int numero;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce Numero: ");
        numero = teclado.nextInt();
        String bi ="";
        if (numero > 0) {

            while (numero > 0) {

                if (numero % 2 == 0) {
                    bi ="0"+bi;
                } else {
                    bi ="1"+bi;
                }
                numero = (int) (numero / 2);

            }
            System.out.println("El numero en binario es: " + bi);
        } else if (numero == 0) {
            bi = "0";
            System.out.println("El numero en binario es: " + bi);
        } else {
            System.out.println("Numero Invalido. Ingrese solo números positivos");
            //bi = "Numero Invalido. Ingrese solo números positivos";
        }

    }


}
