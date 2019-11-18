import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);

        int[] alumnos = new int[5];
        int[] primer_trimestre = new int[5];
        int[] segundo_trimestre = new int[5];
        int[] tercero_trimestre = new int[5];

        int media1 = 0;

        for (int i = 0; i < primer_trimestre.length; i++) {

            System.out.print("Nota Primer Trimestre " + i + ": ");
            primer_trimestre[i] = teclado.nextInt();
            media1 = media1 + primer_trimestre[i];

        }
        System.out.println("La Media del Primer Trimestre: " + media1/5);
        int media2 = 0;

        for (int i = 0; i < segundo_trimestre.length; i++) {

            System.out.print("Nota de Segundo Trimestre " + i + ": ");
            segundo_trimestre[i] = teclado.nextInt();
            media2 = media2 + segundo_trimestre[i];

        }
        System.out.println("La Media del Primer Trimestre: " + media2/5);
        int media3 = 0;

        for (int i = 0; i < tercero_trimestre.length; i++) {

            System.out.print("Nota Tercer Trimestre " + i + ": ");
            tercero_trimestre[i] = teclado.nextInt();
            media3 = media3 + tercero_trimestre[i];

        }
        System.out.println("La Media del Primer Trimestre: " + media3/5);

        System.out.println(Arrays.toString(primer_trimestre));
        System.out.println(Arrays.toString(segundo_trimestre));
        System.out.println(Arrays.toString(tercero_trimestre));


        for (int i = 0; i < alumnos.length; i++) {

            alumnos[i] = i + 1;

        }

        System.out.println(Arrays.toString(alumnos));

        System.out.print("Introduzca Alumno: ");
        int alumno_elegido = teclado.nextInt();

        int resultado_trimestres = 0;

            if (alumnos[alumno_elegido-1] == alumno_elegido) {

                resultado_trimestres = (primer_trimestre[alumno_elegido-1] + segundo_trimestre[alumno_elegido-1]+ tercero_trimestre[alumno_elegido-1])/3; ;

            }

        System.out.println("La Media del alumno "+alumno_elegido+ " es: "+ resultado_trimestres );
    }

}
