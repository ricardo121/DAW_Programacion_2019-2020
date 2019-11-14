import java.util.Scanner;

public class Ejercicio5 {

    public static int eco(int n1,int n2 ) {

        if (n1>=n2){

            return n1;
        }else {
            return n2;
        }

    }

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca numero1: ");
        int n1=teclado.nextInt();
        System.out.print("Introduzca numero2: ");
        int n2=teclado.nextInt();
        System.out.print("Introduzca numero2: ");
        int n3=teclado.nextInt();

        int resultado1 =eco(n1,n2);


        if (resultado1>n3){
            System.out.print("El numero mayor es: ");
            System.out.print(resultado1);
        }else {
            System.out.print("El numero mayor es: ");
            System.out.print(n3);
        }

    }

}
