package cr.ac.ulead.lista.entidades;

import cr.ac.ulead.logic.Producto;

public class Nodo {
    public Nodo next;
    public Producto value;

    public Nodo(Producto value) {
        this.value = value;
    }
}
