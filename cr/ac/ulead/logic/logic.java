package cr.ac.ulead.logic;

import cr.ac.ulead.lista.entidades.Lista;
import cr.ac.ulead.presentacion.presentacion;

import java.io.FileNotFoundException;

public class logic {

    private presentacion presentacion;
    private Data data;
    boolean validacion;
    Lista lista;

    public logic() {

        this.presentacion = new presentacion();
        this.data = new Data();
        this.validacion = false;
        this.lista = new Lista();

    }

    public void ejecutarPrograma(int opcion) throws FileNotFoundException {

        switch (opcion) {

            case 1:

                if (this.validacion) {
                    System.out.println("Los datos ya están cargados");
                } else {
                    this.data.cargarData(lista);
                    this.validacion = true;
                }

                break;

            case 2:

                if (!this.validacion) {
                    this.presentacion.error();
                } else {
                    String nombre = presentacion.nombreProducto();
                    lista.imprimirLista(nombre);
                }

                break;

            case 3:

                if (!this.validacion) {
                    this.presentacion.error();
                } else {
                    this.lista.imprimirCodigoAlfanumerico();
                }

                break;

            case 4:

                this.presentacion.mostrarMensaje("¡Muchas gracias!");
                break;

            default:
                this.presentacion.error();
        }
    }
}
