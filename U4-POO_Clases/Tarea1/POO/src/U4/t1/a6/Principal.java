package U4.t1.a6;

public class Principal {

    public static void main(String args[]) {

        CuentaCorriente c = new CuentaCorriente("ricardo", "98765969");
        CuentaCorriente d = new CuentaCorriente("daniel", "12");
        Banco b1 = new Banco("caixa");
        Banco b2 = new Banco("cajasol");

        b1.bancoDireccion("direccion banco1");
        b2.bancoDireccion("direccion banco2");

        b1.bancoCapital(25557);
        b2.bancoCapital(255);

        c.limite = -100;
        c.ingreso(1000);
        c.egreso(300);
        System.out.println("-----------------------------------------");
        c.mostrarInformacion();
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        d.b.bancoCapital(50);
        d.b.bancoDireccion("av de castilleja");
        d.mostrarInformacion();

    }




}
