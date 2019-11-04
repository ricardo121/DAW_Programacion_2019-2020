import java.util.Scanner;

public class Ejercicio1 {




        public static void main(String args[]) {

            Scanner teclado = new Scanner(System.in);
            System.out.print("Introduzca la altura: ");
            int numaltura = teclado.nextInt();

            System.out.println();
            for(int altura = 1; altura<=numaltura; altura++){
                if (altura==1){

                    for(int j=1; j<=(altura*2)-1; j++){
                        System.out.print("M");
                    }
                }


                for(int i = 1; i<=numaltura-altura; i++){
                    System.out.print(" ");
                }


                for(int j=1; j<=(altura*2)-1; j++){
                    System.out.print("M");
                }
                System.out.println();
            }
        }

        }




