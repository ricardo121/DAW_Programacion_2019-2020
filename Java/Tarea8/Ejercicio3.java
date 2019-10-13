
import java.util.Scanner;

public class Ejercicio3 {


    public static void main( String args[] ) {

        int numero_aleatorio , numero_entrada;

        numero_aleatorio= (int)(Math.random()*100+1);
        numero_entrada=0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce tu numero: ");

        while (numero_entrada != -1 && numero_entrada != numero_aleatorio  ) {
            numero_entrada = teclado.nextInt();
            System.out.print("Intentalo Otra Vez: ");

        }

        if (numero_entrada == numero_aleatorio && numero_entrada != -1  ) {
            System.out.println("Ha Ganado!");
        }
        else{
            System.out.println("Se ha Rendido!");
        }
    }

}
