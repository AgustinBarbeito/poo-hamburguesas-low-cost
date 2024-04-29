public class Ingredientes {

    private String nombre;
    private String descripcion;
    private int precio;

    public Ingredientes(String nombre, String descripcion, int precio){

        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrecio() {
        return precio;
    }
}
