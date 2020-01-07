package U4.t1.a2;

public class Principal {

    public static void main(String args[]) {

        CuentaCorriente c1 = new CuentaCorriente("ricardo", "787659690");
        CuentaCorriente c2 = new CuentaCorriente(1000);
        //CuentaCorriente c3 = new CuentaCorriente("ricardo", "98765969");
        //c1
        c1.limite = -100;
        c1.ingreso(1000);
        c1.egreso(300);
        //c2
        //c2.limite = -50;
        c2.ingreso(1000);
        c2.egreso(1000);
        System.out.println("-----------------------------------------");
        c1.mostrarInformacion();
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        c2.mostrarInformacion();


    }




}
