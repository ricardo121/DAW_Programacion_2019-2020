
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca altura: ");
        int altura=teclado.nextInt();

        while(altura%2==0 || altura<3) {
            System.out.print("Altura erronea: ");
            altura=teclado.nextInt();
        }

        for (int i=1; i<=altura; i++) {

            for(int j=1; j<=altura ; j++) {

                if(j==i-(altura/2) || j==(altura/2-i)+1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }
            for(int j=1; j<=altura ; j++) {

                if(j==i-(altura/2) || j==(altura/2-i)+1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
        teclado.close();
    }

}
