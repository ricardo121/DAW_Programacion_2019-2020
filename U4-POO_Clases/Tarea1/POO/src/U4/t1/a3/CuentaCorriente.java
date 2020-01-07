package U4.t1.a3;

public class CuentaCorriente {

    private double saldo;
    String nombre;
    protected String dni;
    private double limite;

    CuentaCorriente(String nombre, String dni){
        saldo = 0;
        this.nombre = nombre;
        this.dni = dni;
        limite = -50;
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
        System.out.println("Nombre:" + nombre);
        System.out.println("Dni:" + dni);
        System.out.println("Saldo:" + saldo);
        System.out.println("Limite descubierto:" + limite);
    }


}
