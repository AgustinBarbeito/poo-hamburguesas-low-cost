import java.util.ArrayList;

public class Hamburguesa {

    private int precioBase; //Esto incluye el minimo que tendra que tener la hamburguesa, que es 1 pan.


    private ArrayList <Ingredientes> menuIngredientes;

    public Hamburguesa() {
        this.menuIngredientes = new ArrayList<>();

    }

    public void agregarIngrediente(Ingredientes ingrediente){
        this.menuIngredientes.add(ingrediente);
    }


    public ArrayList <Ingredientes> getIngredientes(){
        return menuIngredientes;
    }

    public int calcularPrecioTotal( int precioBase){
        int precioTotal = precioBase;

        for (Ingredientes ingrediente : menuIngredientes){
            precioTotal = precioTotal + ingrediente.getPrecio();
        }
        return precioTotal;
    }
}
