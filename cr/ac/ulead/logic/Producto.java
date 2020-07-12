package cr.ac.ulead.logic;

public class Producto {

    private String codigoAlfaNumerico;
    private String nombre;
    private String categoria;

    public String getCodigoAlfaNumerico() {

        return codigoAlfaNumerico;
    }

    public void setCodigoAlfaNumerico(String codigoAlfaNumerico) {

        this.codigoAlfaNumerico = codigoAlfaNumerico;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getCategoria() {

        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;

    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigoAlfaNumerico='" + codigoAlfaNumerico + '\'' +
                ", nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }

}
