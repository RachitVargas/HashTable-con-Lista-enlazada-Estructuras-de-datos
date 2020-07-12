package cr.ac.ulead.lista.entidades;

import cr.ac.ulead.logic.Producto;

public class Lista {

    private Nodo inicio = null;

    public boolean estaVacia() {

        return inicio == null;
    }

    public void agregar(Nodo nuevoNodo) {
        if (inicio == null) {
            inicio = nuevoNodo;
        } else {
            Nodo temp = inicio;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = nuevoNodo;
        }
    }

    public void imprimirLista(String nombre) {
        Nodo temp = inicio;
        int contador = 0;
        while (temp != null) {

            if (temp.value.getNombre().contains(nombre)) {
                System.out.println("El producto por aproximación es: " + temp.value);
                System.out.println("El indice en la posición lineas es: " + contador);
            }
            contador++;
            temp = temp.next;
        }
    }

    public void imprimirCodigoAlfanumerico() {

        Nodo temp = inicio;
        int contador = 0;
        System.out.println("Códigos alfanuméricos:");
        while (temp != null) {

            System.out.print(String.valueOf(temp.value.getCodigoAlfaNumerico().
                    charAt(temp.value.getCodigoAlfaNumerico().length() - 3)));
            System.out.print(String.valueOf(temp.value.getCodigoAlfaNumerico().
                    charAt(temp.value.getCodigoAlfaNumerico().length() - 2)));
            System.out.print(String.valueOf(temp.value.getCodigoAlfaNumerico().
                    charAt(temp.value.getCodigoAlfaNumerico().length() - 1)));
            System.out.print("\n");

            temp = temp.next;
            contador++;
        }
    }

    public static void agregarPunto5(Producto producto, Lista[] listaColision) {
        int key = getHash(producto.getCodigoAlfaNumerico().substring(producto.getCodigoAlfaNumerico().length() - 3));
        Lista valor = listaColision[key];
        if (valor != null) {
            for (int i = 0; i < listaColision.length; i++) {
                if (producto.getCodigoAlfaNumerico().substring(producto.getCodigoAlfaNumerico().length() - 3).equals(key)) {
                    valor.agregar(new Nodo(producto));
                }
            }
            valor.agregar(new Nodo(producto));
        } else {
            valor = new Lista();
            valor.agregar(new Nodo(producto));
            listaColision[key] = valor;
        }
    }

    private static int getHash(String dato) {
        return Integer.parseInt(dato, 16);
    }


    public void imprimirPunto5(Lista lista) {
        int contador = 0;
        Nodo temp = lista.inicio;
        while (temp != null) {
            System.out.println("[" + contador++ + "]= " + temp.value);
            temp = temp.next;
        }
        System.out.println("Esta lista contiene: " + contador + " elementos");
    }
}
