import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {

    public static boolean esPuntoDeSilla(int x[][], int i, int j){


        int tamai= x.length;
        int tamaj= x[1].length;
        int resultado = 0;
        boolean punto = true;



        //int filas = 0;


        for (int n = 0; n < tamai; n++) {
            for (int m = 0; m < tamaj; m++) {

                if (n == i & m == j)

                    resultado = x[i][j];

            }
        }
//////Filas
        int cont1 = 0;
        int cont2 = 0;

        int maximo = 0 ;

        for (int m = 0; m < tamaj; m++){


            cont1 = cont1 + 1;

        }


        int resu[] = new int[cont1];



        for (int m = 0; m < tamaj; m++){

            resu[cont2] = x[i][m];
            cont2 = cont2 + 1;

        }

        for (int n=0; n < tamaj; n++) {

            if (resu[n]>maximo) {
                maximo = resu[n];
            }

        }

        int minimo = maximo ;

        for (int n=0; n < tamaj; n++) {

            if (resu[n]<minimo) {
                minimo = resu[n];
            }

        }

////Columnas
        int cont3 = 0;
        int cont4 = 0;

        int maximo1 = 0 ;

        for (int n = 0; n < tamai; n++){


            cont3 = cont3 + 1;

        }


        int resu1[] = new int[cont3];



        for (int n = 0; n < tamai; n++){

            resu1[cont4] = x[n][j];
            cont4 = cont4 + 1;

        }

///////
        for (int m=0; m < tamai; m++) {

            if (resu1[m]>maximo1) {
                maximo1 = resu1[m];
            }

        }

        int minimo1 = maximo1 ;

        for (int m=0; m < tamai; m++) {

            if (resu1[m]<minimo1) {
                minimo1 = resu1[m];
            }

        }

        if(minimo==resultado && maximo1==resultado){

             punto=true;
        }else{
             punto=false;
        }


       // System.out.println("Filas: "+Arrays.toString(resu));

       // System.out.println("El numero mayor de la Fila: "+maximo);
       // System.out.println("El numero menor de la Fila: "+minimo);

       // System.out.println("Columnas: "+Arrays.toString(resu1));

       // System.out.println("El numero mayor de la Columna: "+maximo1);
       // System.out.println("El numero menor de la Columna: "+minimo1);

       // System.out.println("Numero Seleccionado: "+resultado);


        return punto;

    }


    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);


        int tamai = 4;
        int tamaj = 6;
        int i = 3;
        int j = 0;

        int x[][] = new int[tamai][tamaj];

        for (int n = 0; n < tamai; n++){

            for (int m = 0 ; m < tamaj ; m++){

                //x[n][m] =(int) (Math.random() *(500-200+1) + 200);
                x[n][m] = n+m;

            }

        }

        for (int n = 0; n < tamai; n++){

            System.out.println(Arrays.toString(x[n]));

        }

        System.out.println("El Numero Elejido es Punto de Silla: "+esPuntoDeSilla(x,i,j));


    }



}
