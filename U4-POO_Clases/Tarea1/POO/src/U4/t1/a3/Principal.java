package U4.t1.a3;

public class Principal {

    public static void main(String args[]) {

        CuentaCorriente c = new CuentaCorriente("daniel", "98765969");
        //c.limite = -100; el atributo es private por eso da error
        //c.saldo = -100;  el atributo es private por eso da error
        c.dni= "ricardo";
        c.ingreso(1000);
        c.egreso(300);
        System.out.println("-----------------------------------------");
        c.mostrarInformacion();

    }




}
