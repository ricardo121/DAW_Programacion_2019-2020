import java.util.Scanner;

public class Ejercicio5 {

    public static void main( String args[] ) {

        int radio , opcion;

        final double PI = 3.141592;

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Valor del radio : " );
        radio = teclado.nextInt();
        System.out.println( "1.Calcular diámetro\n" +
                "\n" +
                "2.Calcular perímetro\n" +
                "\n" +
                "3.Calcular área " );
        System.out.println( "" );
        System.out.print( "Elija una opcion (1,2,3) : " );
        opcion = teclado.nextInt();

        if ( opcion == 1 ) {
            System.out.println( "diametro: " );
            System.out.println( 2 * radio );
        }
        else if ( opcion == 2){
            System.out.println( "perimetro");
            System.out.println( 2 * PI *radio);
        }
        else if ( opcion == 3){
            System.out.println( "area: ");
            System.out.println( PI * radio * radio );
        }
        else {
            System.out.println( "No hay mas opciones" );
        }
    }

}
