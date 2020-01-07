package U4.t1.a4;

public class CuentaCorriente {

    double saldo;
    String nombre;
    String dni;
    double limite;
    String banco;

    CuentaCorriente(String nombre, String dni){
        saldo = 0;
        this.nombre = nombre;
        this.dni = dni;
        banco = "NUlO";
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

    void nombrebanco(String nuevo_banco){
        banco = nuevo_banco;
    }

    void mostrarInformacion(){
        System.out.println("Nombre:" + nombre);
        System.out.println("Dni:" + dni);
        System.out.println("Banco:" + banco);
        System.out.println("Saldo:" + saldo);
        System.out.println("Limite descubierto:" + limite);

    }


}
