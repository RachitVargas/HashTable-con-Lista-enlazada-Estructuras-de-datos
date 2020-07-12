package cr.ac.ulead.punto5;

import cr.ac.ulead.presentacion.presentacion;

import java.io.FileNotFoundException;

public class Logic {

    presentacion presentacion;
    HashTable hashTable;
    boolean validacion = false;

    public Logic() {

        this.presentacion = new presentacion();
        this.hashTable = new HashTable(4096);

    }

    public void ejecutarOpcion(int opcion) throws FileNotFoundException {

        switch (opcion) {

            case 1:

                if (!validacion) {
                    hashTable.cargarData();
                    validacion = true;
                } else {
                    System.out.println("Los datos ya están cargados");
                }

                break;

            case 2:

                if (validacion) {
                    int indice = presentacion.getIndex();
                    hashTable.imprimir(indice);
                }else {

                    System.out.println("No hay datos cargados");
                }
                break;

            case 3:
                presentacion.mostrarMensaje("Muchas Gracias");

                break;

            default:
                presentacion.error();
        }
    }
}

