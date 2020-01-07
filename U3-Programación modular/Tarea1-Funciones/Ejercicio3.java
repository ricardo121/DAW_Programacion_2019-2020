import java.util.Scanner;

public class Ejercicio3 {

    public static void eco(int n,int radio,int altura ) {

        if (n==1){
            System.out.print("Area Total:");
            System.out.print(2*Math.PI*(altura+radio));
        }else if(n==2) {
            System.out.print("Volumen:");
            System.out.print(Math.PI*radio*radio*altura);
        }

    }

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca numero: ");
        int n=teclado.nextInt();
        System.out.print("Radio: ");
        int radio=teclado.nextInt();
        System.out.print("Altura: ");
        int altura=teclado.nextInt();
        eco(n,altura,radio);

    }

}
