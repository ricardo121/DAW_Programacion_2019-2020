public class Ejercicio3 {

    public static void main( String args[] ) {

        double x = 4.5  , y = 5.3 , j = 5.7  ;
        double z ;

        System.out.print( "Primera Nota " );
        System.out.println( x );

        System.out.print( "Segunda Nota " );
        System.out.println( y );

        System.out.print( "Primera Nota " );
        System.out.println( j );

        System.out.print( "Media: " );
        z = (double) (x+y+j) / 3 ;

        System.out.println(Math.round(z));
    }

}
