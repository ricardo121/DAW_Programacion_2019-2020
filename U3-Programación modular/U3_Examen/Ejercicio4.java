import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int numElem;

        System.out.println("Introduzca el tamaño de la tabla:");
       // numElem=teclado.nextInt();
        int x[] = { 101,232,5,15,121 };
        filtraCapicuas(x);
        System.out.println("El contenido de la tabla es "+ Arrays.toString(x));
        teclado.close();
    }

    static int[] filtraCapicuas(int x[]){
        Scanner teclado = new Scanner (System.in);

        int t[] = new int[5];
        int cont = 0;
        for (int i=0;i<5;i++){
            //System.out.println("Introduzca numeros en la posicion "+i+" de la tabla:");
            //t[i]=teclado.nextInt();
            if (i<5) {
                int falta = t[i];
                int numeroInvertido = 0;
                int resto = 0;
                while (falta != 0) {
                    resto = falta % 10;
                    numeroInvertido = numeroInvertido * 10 + resto;
                    falta = falta / 10;
                }

                if (numeroInvertido == t[i]) {


                } else {
                    i--;
                    cont++;

                }
            }else{

            }


        }
        return t;
        //System.out.println("El contenido de la tabla es "+ Arrays.toString(t));

       // teclado.close();
    }
}
