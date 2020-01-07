
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero : ");
        int numero = sc.nextInt();


        System.out.println();
        //filas
        for(int filas = numero; filas <numero+5; filas++){

            //columnas
            for(int columnas=0; columnas<=2; columnas++){
                if (columnas==0) {
                    System.out.print(filas);
                    System.out.print(" ");

                }
                else if (columnas==1){
                    System.out.print(filas*filas);
                    System.out.print(" ");

                }
                else if (columnas==2){
                    System.out.print(filas*filas*filas);
                    System.out.print(" ");

                }
            }
            System.out.println();

        }
    }


}






