package U4.t1.a2;

public class CuentaCorriente {

    double saldo;
    String nombre;
    String dni = "7895687";
    double limite;

    CuentaCorriente(String nombre, String dni){
        saldo = 0;
        this.nombre = nombre;
        this.dni = dni;
        limite = -50;
    }

    CuentaCorriente( double saldo){
        this.saldo = saldo;
        //this.nombre = nombre;
        dni = "98956587";
        limite = -40;
    }

    public boolean egreso(double cant) {
    boolean operacionPosible;
    if((saldo - cant) >= limite) {
        saldo -= cant;
        operacionPosible = true;
    } else{
        System.out.println("No hay dinero suficiente");
        operacionPosible = false;
    }
    return (operacionPosible);

    }

    void ingreso(double cant){
        saldo += cant;
    }

    void mostrarInformacion(){
        //System.out.println("Nombre:" + nombre);
        System.out.println("Dni:" + dni);
        System.out.println("Saldo:" + saldo);
        System.out.println("Limite descubierto:" + limite);
    }


}
