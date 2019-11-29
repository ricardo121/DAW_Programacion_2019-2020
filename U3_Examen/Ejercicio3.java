import java.util.Scanner;

public class Ejercicio3 {

    public static String convierteEnMorse(int numero){

        String frase1 ="";
        String frase2 ="";
       // int comparacion = password.compareTo(p);
        String num ="1234567890";


        int longitud1 ;

        frase1 += numero;
        longitud1 = frase1.length();

        for (int n = 0; n < longitud1; n++) {

            char caracter = frase1.charAt(n);


             if (num.charAt(0)==caracter) {
                 //System.out.println(caracter);
                 frase2 += ".----" ;
             }else if (num.charAt(1)==caracter){
                 frase2 +="..---";

             }else if (num.charAt(2)==caracter){
                 frase2 +="...--" ;

             }else if (num.charAt(3)==caracter){
                 frase2 +="....-" ;

             }else if (num.charAt(4)==caracter){
                 frase2 +="....." ;

             }else if (num.charAt(5)==caracter){
                 frase2 +="-...." ;

             }else if (num.charAt(6)==caracter){
                 frase2 +="--..." ;

             }else if (num.charAt(7)==caracter){
                 frase2 +="---.." ;

             }else if (num.charAt(8)==caracter){
                 frase2 +="----." ;

             }else if (num.charAt(9)==caracter){
                 frase2 +="-----" ;

             }

            //System.out.println(frase2);
        }
        return frase2 ;

    }

    public static void main( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Numero para convertir en Morse: ");
        int numero = teclado.nextInt();

        System.out.print(convierteEnMorse(numero));


    }

}
