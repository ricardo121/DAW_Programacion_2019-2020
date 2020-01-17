package Pizzeria;

public class Pizza {

    private enum Tamaño { MEDIANA, FAMILIA}
    private Tamaño tam ;
    private boolean max_cant=true;
    private int cant;




    public Pizza(int cant){

            this.cant = cant;
            tam = Tamaño.FAMILIA;
            mostrarInformacion();
            System.out.println("Maximo 3 Ingredientes");


    }

    void mostrarInformacion(){
        System.out.println("Tamaño de Pizzas: ");
        System.out.println(Tamaño.FAMILIA+" o "+Tamaño.MEDIANA);
    }

    public boolean verdad(){

        boolean iguales;
        if (this.cant < 4 ) {
            iguales = true;
        }else{
            iguales = false;
        }
        return iguales;
    }




}
