package U4.t1.a4;

public class Principal {

    public static void main(String args[]) {

        CuentaCorriente c1 = new CuentaCorriente("daniel", "98765969");
        CuentaCorriente c2 = new CuentaCorriente("ricardo", "56784678");
        c1.limite = -100;
        c1.nombrebanco("Caixa");
        c1.ingreso(1000);
        c1.egreso(300);
        System.out.println("-----------------------------------------");
        c1.mostrarInformacion();
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        c2.limite = -60;
        c2.nombrebanco("Santander");
        c2.ingreso(600);
        c2.egreso(300);
        System.out.println("-----------------------------------------");
        c2.mostrarInformacion();

    }




}
