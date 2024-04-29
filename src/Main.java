import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Hamburguesa hamburguesa1 = new Hamburguesa();


        Ingredientes tomate = new Ingredientes("Tomate","Rodajas de tomate fresco",100);
        Ingredientes lechuga = new Ingredientes("Lechuga","Hojas de lechuga verde", 100);
        Ingredientes cebolla1 = new Ingredientes("Cebolla","Porcion de cebolla", 100);
        Ingredientes cebolla2 = new Ingredientes("Cebolla Caramelizada", "Porcion de cebolla caramelizada",100);
        Ingredientes cebolla3 = new Ingredientes("Cebolla Crispy", "Porcion de cebolla crispy",100);
        Ingredientes pepinillos = new Ingredientes("Pepinillos","Pepinillos finamente cortados",100);
        Ingredientes bacon = new Ingredientes("Bacon","2 lonchas de bacon", 200);
        Ingredientes medallonCarne = new Ingredientes("Medallon de Carne", "Medallon de carne picada de 100 gramos",400);
        Ingredientes medallonPollo = new Ingredientes("Medallon de Pollo", "Medallon de pollo frito de 100 gramos", 400);
        Ingredientes medallonVegano = new Ingredientes("Medallon Vegano", "Medallon de Soja de 100 gramos 100% Vegano",400);
        Ingredientes mayonesa = new Ingredientes("Mayonesa","Marca Hellmans",0);
        Ingredientes ketchup = new Ingredientes("Ketchup","Marca Hellmans",0);
        Ingredientes mostaza = new Ingredientes("Mostaza","Marca Hellmans",0);


        hamburguesa1.agregarIngrediente(tomate);
        hamburguesa1.agregarIngrediente(lechuga);
        hamburguesa1.agregarIngrediente(medallonCarne);
        hamburguesa1.agregarIngrediente(medallonCarne);
        hamburguesa1.agregarIngrediente(mayonesa);



        ArrayList<Ingredientes> menuIngredientes = hamburguesa1.getIngredientes();
        System.out.println("Ingredientes de la hamburguesa:" );
        for (Ingredientes ingrediente: menuIngredientes) {
            System.out.println(ingrediente.getNombre() + ": $" + ingrediente.getPrecio());
        }

        int precioTotal = hamburguesa1.calcularPrecioTotal(150);
        System.out.println("Precio total de la hamburguesa: $" + precioTotal);
    }
}