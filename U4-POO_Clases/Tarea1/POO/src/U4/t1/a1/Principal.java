package U4.t1.a1;

public class Principal {

    public static void main(String args[]) {

        CuentaCorriente c = new CuentaCorriente("ricardo", "98765969");
        c.limite = -100;

        c.ingreso(1000);
        c.egreso(300);
        System.out.println("-----------------------------------------");
        c.mostrarInformacion();
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("Puede sacar 700 euros:" + c.egreso(700));
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("Puede sacar 500 euros:" + c.egreso(500));
        //c.mostrarInformacion();
    }




}
