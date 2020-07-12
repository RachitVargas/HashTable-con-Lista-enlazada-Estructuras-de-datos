package cr.ac.ulead.punto5;

import cr.ac.ulead.presentacion.presentacion;

import java.io.FileNotFoundException;

public class Main {


    public static void main(String args[]) throws FileNotFoundException {

        presentacion presentacion = new presentacion();
        Logic logic = new Logic();
        int opcion = 0;

        do {
            opcion = presentacion.mostrarmenu2();
            logic.ejecutarOpcion(opcion);
        } while (opcion != 3);
    }
}