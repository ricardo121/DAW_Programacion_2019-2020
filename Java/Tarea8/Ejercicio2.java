
import java.util.Scanner;

public class Ejercicio2 {

    public static void main( String args[] ) {

    int edad , cont, suma, mayores;
    cont = 0;
    edad = 0;
    suma = 0;
    mayores = 0;
    Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
    edad = teclado.nextInt();

        while (edad >= 0) {
            suma +=  edad;
            System.out.print("Introduce tu edad: ");

            if (edad >= 18){
                mayores++ ;
            }

            edad = teclado.nextInt();
            cont++ ;

        }

        System.out.print("La Suma de los Alumnos es: ");
        System.out.println(suma);
        System.out.print("La Media de los Alumnos es: ");
        System.out.println(suma/cont);
        System.out.print("El numero de los Alumnos es: ");
        System.out.println(cont);
        System.out.print("El numero de los Alumnos Mayores de Edad es: ");
        System.out.println(mayores);
}

}
