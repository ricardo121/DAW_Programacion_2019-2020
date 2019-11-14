import java.util.Scanner;

public class Ejercicio4 {

    public static void eco(int n1,int n2 ) {

        if (n1>=n2){
            System.out.print("El numero mayor es: ");
            System.out.print(n1);
        }else {
            System.out.print("El numero mayor es: ");
            System.out.print(n2);
        }

    }

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca numero1: ");
        int n1=teclado.nextInt();
        System.out.print("Introduzca numero2: ");
        int n2=teclado.nextInt();

        eco(n1,n2);

    }

}
