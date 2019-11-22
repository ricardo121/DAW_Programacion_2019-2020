import java.util.Scanner;

public class Ejercicio5 {


    public static int aleatorioDeArray(int[] a){

        int numero_aleatorio = (int) (Math.random() * 4);


           int resultado= a[numero_aleatorio];

        return  resultado;

    }

    public static void main( String args[] ) {

        Scanner teclado = new Scanner(System.in);

        int a[] = { 10,23,5,15 };

        System.out.print("Valor Aleatorio del Array: ");

        System.out.print(aleatorioDeArray(a));


    }

}
