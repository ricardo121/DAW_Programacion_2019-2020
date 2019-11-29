
import java.util.Scanner;
public class Ejercicio2 {


    public static long juntaNumeros(long a , long b){

        long resultado = 0;
        long frase1 = 0;
        //long frase1 ="";
        frase1 += a;
        frase1 += b;
        resultado += frase1;
        System.out.println(frase1);

        //for (int n = 0; n < 4; n++) {


           // resultado += a[n];
        //}
        return resultado ;

    }

    public static void main( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Numero A");
        long a = teclado.nextInt();
        System.out.println("Numero B");
        long b = teclado.nextInt();

        System.out.print(juntaNumeros(a,b));




}



}
