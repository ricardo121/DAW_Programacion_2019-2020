import java.util.Scanner;

public class Ejercicio4 {

    public static String convierteArrayEnString(int[] a){

        String frase = "";

        for (int n = 0; n < 4; n++) {


            frase += a[n];
        }
        return frase ;

    }

    public static void main( String args[] ) {

        Scanner teclado = new Scanner(System.in);

        int a[] = { 10,23,5,15 };

        System.out.print(convierteArrayEnString(a));


    }

}
