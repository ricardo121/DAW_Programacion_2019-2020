package U4.t1.a6;

public class Banco {

       private String nombre;
       private String direccion;
       private double capital;

        Banco(String nombre){
            direccion = "";
            capital = 58.000;
            this.nombre = nombre;
            //this.direccion = direccion;

        }

    void bancoDireccion(String nuevaDireccion) {

        direccion = nuevaDireccion;
    }

    void bancoCapital(int nuevoCapital) {

        capital = nuevoCapital;
    }



        void mostrarInformacion(){
            System.out.println("Nombre:" + nombre);
            System.out.println("Direccion:" + direccion);
            System.out.println("Capital:" + capital);

        }

}
