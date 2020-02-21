public class Minecraft {

    private int cantidad_max = 10;
    private int cantidad = 0;

    public void borrarMaterialSinMasa(){
        if(cantidad == cantidad_max) {
            cantidad--;
        } else{
            cantidad++;
        }
    }


}
